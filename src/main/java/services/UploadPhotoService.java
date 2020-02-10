package services;

import io.qameta.allure.Step;
import api.Specification;
import pojo.uploadPhoto.Invalid.UploadPhotoInvalidResponse;
import pojo.uploadPhoto.valid.postUploadPhoto.UploadPhotoResponse;

import java.io.File;
import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class UploadPhotoService extends BodyForTest implements Specification {


    private HashMap getBodyValidPassport() {
        return getHashMapImageEncoder("PASSPORT_RECOGNIZE", "src/main/resources/pass.jpeg");
    }

    private HashMap getBodyPicture() {
        return getHashMapImageEncoder("PASSPORT_RECOGNIZE", "src/main/resources/kartinka.jpg");
    }

    private HashMap getBodySelfie() {
        return getHashMapImageEncoder("SELFIE", "src/main/resources/pass.jpeg");
    }


    @Step("I post upload passport")
    public UploadPhotoResponse postUploadPassport(String applicationId, String authToken) {
        return given()
                .spec(getRequestSpecification("contractName".concat(applicationId).concat("contractName")))
                .header("authorization", "Bearer " + authToken)
                .body(getBodyValidPassport())
                .post()
                .then()
                .spec(getResponseSpecification(false))
                .body(matchesJsonSchema(new File("src/main/resources/jsonSchema/valid/post_photo.json")))
                .extract().body().as(UploadPhotoResponse.class)
                ;
    }

    @Step("I post upload picture instead passport")
    public UploadPhotoInvalidResponse postUploadPassportInvalid(String applicationId, String authToken) {
        return given()
                .spec(getRequestSpecification("contractName".concat(applicationId).concat("contractName")))
                .header("authorization", "Bearer " + authToken)
                .body(getBodyPicture())
                .post()
                .then()
                .spec(getResponseSpecification(true))
                .body(matchesJsonSchema(new File("src/main/resources/jsonSchema/invalid/post_photo.json")))
                .extract().body().as(UploadPhotoInvalidResponse.class)
                ;
    }

    @Step("I post upload selfie")
    public UploadPhotoResponse postUploadSelfie(String applicationId, String authToken) {
        return given()
                .spec(getRequestSpecification("contractName".concat(applicationId).concat("contractName")))
                .header("authorization", "Bearer " + authToken)
                .body(getBodySelfie())
                .post()
                .then()
                .spec(getResponseSpecification(false))
                .body(matchesJsonSchema(new File("src/main/resources/jsonSchema/valid/post_photo.json")))
                .extract().body().as(UploadPhotoResponse.class)
                ;
    }

}
