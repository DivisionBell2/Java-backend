package services;

import io.qameta.allure.Step;
import api.Specification;
import pojo.leasingApplication.invalid.LeasingApplicationEmptyEmailOrPhoneResponse.LeasingApplicationNoValidResponse;
import pojo.leasingApplication.invalid.postLeasingAppClientDataWithoutPassportAndSelfie.ClientDataInvalidStatus500Response;
import pojo.leasingApplication.valid.postLeasingApplication.LeasingApplicationResponse;
import pojo.leasingApplication.valid.postLeasingApplicationApplicationClientData.ClientDataResponse;
import pojo.leasingApplication.valid.postLeasingApplicationApplicationIdCheckConsentsOtp.CheckConsentsOtpResponse;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class LeasingApplicationService extends BodyForTest implements Specification {

    private LeasingApplicationResponse leasingApplicationResponse;
    private CheckConsentsOtpResponse checkConsentsOtpResponse;

    private LeasingApplicationResponse postLeasingApplicationValid(String basketId, String typeApplication, String email, String mobilePhone) {
        if (leasingApplicationResponse == null) {
            leasingApplicationResponse = given()
                    .spec(getRequestSpecification("contractName"))
                    .body(getBodyForApplicationId(basketId, typeApplication, email, mobilePhone))
                    .post()
                    .then()
                    .spec(getResponseSpecification(false))
                    .body(matchesJsonSchema(new File("src/main/resources/jsonSchema/valid/post_v2_leasing_application.json")))
                    .extract().body().as(LeasingApplicationResponse.class)
            ;
        }
        return leasingApplicationResponse;
    }

    @Step("I post request leasing-application with empty email ")
    public LeasingApplicationNoValidResponse postLeasingApplicationEmptyEmail(String basketId, String typeApplication, String email, String mobilePhone) {
        return given()
                .spec(getRequestSpecification("contractName"))
                .body(getBodyForApplicationId(basketId, typeApplication, email, mobilePhone))
                .post()
                .then()
                .spec(getResponseSpecification(true))
                .body(matchesJsonSchema(new File("src/main/resources/jsonSchema/invalid/post_empty_email_and_phone.json")))
                .extract().body().as(LeasingApplicationNoValidResponse.class)
                ;
    }

    @Step("I post request leasing-application with empty phone")
    public LeasingApplicationNoValidResponse postLeasingApplicationEmptyPhone(String basketId, String typeApplication, String email, String mobilePhone) {
        return given()
                .spec(getRequestSpecification("contractName"))
                .body(getBodyForApplicationId(basketId, typeApplication, email, mobilePhone))
                .post()
                .then()
                .spec(getResponseSpecification(true))
                .body(matchesJsonSchema(new File("src/main/resources/jsonSchema/invalid/post_empty_email_and_phone.json")))
                .extract().body().as(LeasingApplicationNoValidResponse.class)
                ;
    }

    private CheckConsentsOtpResponse postLeasingAppCheckConsentsOtp(String applicationId, String mobileCode) {
        if (checkConsentsOtpResponse == null) {
            checkConsentsOtpResponse = given()
                    .spec(getRequestSpecification("contractName".concat(applicationId).concat("contractName")))
                    .body(getBodyForAuthToken(mobileCode))
                    .post()
                    .then()
                    .spec(getResponseSpecification(false))
                    .body(matchesJsonSchema(new File("src/main/resources/jsonSchema/valid/post_otp.json")))
                    .extract().body().as(CheckConsentsOtpResponse.class)
            ;
        }
        return checkConsentsOtpResponse;
    }

    @Step("I post leasing application check consents otp with invalid mobile code")
    public CheckConsentsOtpResponse postLeasingAppCheckConsentsOtpWithInvalidMobileCode(String applicationId, String mobileCode) {
        checkConsentsOtpResponse = given()
                .spec(getRequestSpecification("contractName".concat(applicationId).concat("contractName")))
                .header("device-type", "WEB")
                .body(getBodyForAuthToken(mobileCode))
                .post()
                .then()
                .spec(getResponseSpecification(false))
                .body(matchesJsonSchema(new File("src/main/resources/jsonSchema/invalid/post_otp.json")))
                .extract().body().as(CheckConsentsOtpResponse.class)
                ;
        return checkConsentsOtpResponse;
    }

    @Step("I post leasing application check consents otp with invalid auth token and reject order")
    public CheckConsentsOtpResponse postLeasingAppCheckConsentsOtpWithInvalidTokenWithRejectOrder(String applicationId, String mobileCode) {
        checkConsentsOtpResponse = given()
                .spec(getRequestSpecification("contractName".concat(applicationId).concat("contractName")))
                .header("device-type", "WEB")
                .body(getBodyForAuthToken(mobileCode))
                .post()
                .then()
                .spec(getResponseSpecification(true))
                .body(matchesJsonSchema(new File("src/main/resources/jsonSchema/invalid/post_otp-rejection.json")))
                .extract().body().as(CheckConsentsOtpResponse.class)
                ;
        return checkConsentsOtpResponse;
    }

    @Step("I get leasing application short check with reject order info")
    public LeasingApplicationResponse getLeasingAppShortCheckWithRejectOrderInfo(String applicationId) {
        return given()
                .spec(getRequestSpecification("contractName".concat(applicationId).concat("contractName")))
                .header("device-type", "WEB")
                .get()
                .then()
                .spec(getResponseSpecification(false))
                .body(matchesJsonSchema(new File("src/main/resources/jsonSchema/valid/get_short-rejection.json")))
                .extract().body().as(LeasingApplicationResponse.class)
                ;
    }

    @Step("I post leasing application client data")
    public ClientDataResponse postLeasingAppClientData(String applicationId, String authToken) {
        return given()
                .spec(getRequestSpecification("contractName".concat(applicationId).concat("contractName")))
                .header("authorization", "Bearer " + authToken)
                .body(getBodyForClientData())
                .post()
                .then()
                .spec(getResponseSpecification(false))
                .body(matchesJsonSchema(new File("src/main/resources/jsonSchema/valid/post_client_data.json")))
                .extract().body().as(ClientDataResponse.class)
                ;
    }

    @Step("I post leasing application client data without passport and selfie")
    public ClientDataInvalidStatus500Response postLeasingAppClientDataWithoutPassportAndSelfie(String applicationId, String authToken) {
        return given()
                .spec(getRequestSpecification("contractName".concat(applicationId).concat("contractName")))
                .header("authorization", "Bearer " + authToken)
                .body(getBodyForClientData())
                .post()
                .then()
                .spec(getResponseSpecification(true))
                .body(matchesJsonSchema(new File("src/main/resources/jsonSchema/invalid/post_client_data_without_passport_and_selfie.json")))
                .extract().body().as(ClientDataInvalidStatus500Response.class)
                ;
    }

    @Step("I get application ID")
    public String getApplicationId(String basketId, String typeApplication, String email, String mobilePhone) {
        return postLeasingApplicationValid(basketId, typeApplication, email, mobilePhone)
                .getResultData()
                .getApplicationID()
                ;
    }

    @Step("I get authorization token")
    public String getAuthToken(String applicationId, String mobileCode) {
        return postLeasingAppCheckConsentsOtp(applicationId, mobileCode)
                .getResultData()
                .getToken()
                ;
    }
}
