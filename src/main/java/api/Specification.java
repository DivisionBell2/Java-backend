package api;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.Matchers;

public interface Specification extends GetEnv {

    default RequestSpecification getRequestSpecification(String path) {
        return new RequestSpecBuilder()
                .addFilter(new AllureRestAssured())
                .setContentType(ContentType.JSON)
                .setBaseUri(getEnv("baseUriDev"))
                .setBasePath(path)
                .addHeader("device-type", "WEB")
                .build()
                ;
    }

    default ResponseSpecification getResponseSpecification(Boolean isNegative) {
        if (isNegative) {
            return new ResponseSpecBuilder()
                    .expectStatusCode(Matchers.oneOf(400, 404, 500))
                    .expectContentType(ContentType.JSON)
                    .build()
                    ;
        } else {
            return new ResponseSpecBuilder()
                    .expectStatusCode(200)
                    .expectContentType(ContentType.JSON)
                    .build()
                    ;
        }
    }
}
