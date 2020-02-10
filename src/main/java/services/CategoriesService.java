package services;

import io.qameta.allure.Step;
import org.apache.commons.lang3.RandomUtils;
import api.Specification;
import pojo.categories.getCategories.CategoriesResponse;

import java.io.File;
import java.util.NoSuchElementException;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class CategoriesService implements Specification {

    private CategoriesResponse categoriesResponse;

    private CategoriesResponse getCategories() {
        if (categoriesResponse == null) {
            categoriesResponse = given()
                    .spec(getRequestSpecification("contractName"))
                    .get()
                    .then()
                    .spec(getResponseSpecification(false))
                    .body(matchesJsonSchema(new File("src/main/resources/jsonSchema/valid/get_categories.json")))
                    .extract().body().as(CategoriesResponse.class)
            ;
        }
        return categoriesResponse;
    }

    @Step("I get code category Iphone")
    public String getCodeCategoryIphone() {
        return getCategories()
                .getResultData()
                .getCategories()
                .stream().filter(val -> val.getName().toLowerCase().contains("Iphone".toLowerCase())).findAny().orElseThrow(NoSuchElementException::new)
                .getChilds()
                .stream().findAny().orElseThrow(NoSuchElementException::new)
                .getCode()
                ;
    }

    @Step("I get code category Samsung")
    public String getCodeCategorySamsung() {
        return getCategories()
                .getResultData()
                .getCategories()
                .stream().filter(val -> val.getName().toLowerCase().contains("Samsung".toLowerCase())).findAny().orElseThrow(NoSuchElementException::new)
                .getChilds()
                .stream().findAny().orElseThrow(NoSuchElementException::new)
                .getCode()
                ;
    }

    @Step("I get code category Consoles")
    public String getCodeCategoryConsoles() {
        return getCategories()
                .getResultData()
                .getCategories()
                .stream().filter(val -> val.getName().toLowerCase().contains("Xbox".toLowerCase())).findAny().orElseThrow(NoSuchElementException::new)
                .getChilds()
                .stream().findAny().orElseThrow(NoSuchElementException::new)
                .getCode()
                ;
    }

    @Step("I get code category Digital Services")
    public String getCodeCategoryDigitalServices() {
        return getCategories()
                .getResultData()
                .getCategories()
                .stream().filter(val -> val.getName().toLowerCase().contains("Цифровые сервисы".toLowerCase())).findAny().orElseThrow(NoSuchElementException::new)
                .getChilds()
                .stream().findAny().orElseThrow(NoSuchElementException::new)
                .getCode()
                ;
    }

    @Step("I get random code category")
    public String getRandomCodeCategory() {
        return getCategories()
                .getResultData()
                .getCategories()
                .stream().sorted((o1, o2) -> RandomUtils.nextInt(0, 2) - 1)
                .findFirst()
                .get()
                .getChilds()
                .stream().sorted((o1, o2) -> RandomUtils.nextInt(0, 2) - 1)
                .findFirst()
                .get()
                .getCode()
                ;
    }
}
