package pojo.catalog.invalidProductCode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InvalidProductCodeResponse {

    @JsonProperty("errorCode")
    private int errorCode;

    @JsonProperty("errorMessage")
    private String errorMessage;

    @JsonProperty("resultData")
    private Object resultData;

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public Object getResultData() {
        return resultData;
    }

    @Override
    public String toString() {
        return "InvalidProductCodeResponse{" +
                "errorCode=" + errorCode +
                ", errorMessage='" + errorMessage + '\'' +
                ", resultData=" + resultData +
                '}';
    }
}
