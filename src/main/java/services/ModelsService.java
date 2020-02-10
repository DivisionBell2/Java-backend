package services;

import io.qameta.allure.Step;
import org.apache.commons.lang3.RandomUtils;
import api.Specification;
import pojo.models.getModels.ModelsResponse;
import pojo.models.getModelsModelGoods.ModelsModelGoodsResponse;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class ModelsService implements Specification {

    private ModelsResponse modelsResponse;
    private ModelsModelGoodsResponse modelsModelGoodsResponse;

    private ModelsResponse getModels(String categoryCode) {
        if (modelsResponse == null) {
            modelsResponse = given()
                    .spec(getRequestSpecification("contractName"))
                    .queryParam("categoryCode", categoryCode)
                    .get()
                    .then()
                    .spec(getResponseSpecification(false))
                    .body(matchesJsonSchema(new File("src/main/resources/jsonSchema/valid/get_models.json")))
                    .extract().body().as(ModelsResponse.class)
            ;
        }
        return modelsResponse;
    }


    private ModelsModelGoodsResponse getGoodCode(String modelCode) {
        if (modelsModelGoodsResponse == null) {
            modelsModelGoodsResponse = given()
                    .spec(getRequestSpecification("contractName".concat(modelCode).concat("contractName")))
                    .get()
                    .then()
                    .spec(getResponseSpecification(false))
                    .body(matchesJsonSchema(new File("src/main/resources/jsonSchema/valid/get_models.json")))
                    .extract().body().as(ModelsModelGoodsResponse.class)
            ;
        }
        return modelsModelGoodsResponse;
    }

    @Step("I get random model code")
    public String getRandomModelCode(String category) {
        return getModels(category)
                .getResultData()
                .getModels().stream().sorted((o1, o2) -> RandomUtils.nextInt(0, 2) - 1)
                .findFirst()
                .get()
                .getCode()
                ;
    }

    @Step("I get random models good code")
    public String getRandomModelGoodCode(String modelCode) {
        return getGoodCode(modelCode)
                .getResultData()
                .getGoods().stream().sorted((o1, o2) -> RandomUtils.nextInt(0, 2) - 1)
                .findFirst()
                .get()
                .getCode()
                ;
    }
}
