package services;

import api.Specification;
import pojo.catalog.invalidProductCode.InvalidProductCodeResponse;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class CatalogService extends BodyForTest implements Specification {
    private InvalidProductCodeResponse invalidProductCodeResponse;

    public InvalidProductCodeResponse getCatalogGoodsInvalid(String productCode) {
        if (invalidProductCodeResponse == null) {
            invalidProductCodeResponse = given()
                    .spec(getRequestSpecification("contractName".concat(productCode)))
                    .get()
                    .then()
                    .spec(getResponseSpecification(true))
                    .body(matchesJsonSchema(new File("src/main/resources/jsonSchema/invalid/content_goods.json")))
                    .extract().body().as(InvalidProductCodeResponse.class)
                    ;
        }
        return invalidProductCodeResponse;
    }
}
