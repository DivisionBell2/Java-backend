package pojo.leasingApplication.invalid.LeasingApplicationEmptyEmailOrPhoneResponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LeasingApplicationNoValidResponse {

    @SerializedName("resultData")
    private ResultData resultData;

    @SerializedName("errorMessage")
    private String errorMessage;

    @SerializedName("errorCode")
    private int errorCode;

    public ResultData getResultData() {
        return resultData;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    @Override
    public String toString() {
        return
                "LeasingApplicationResponse{" +
                        "resultData = '" + resultData + '\'' +
                        ",errorMessage = '" + errorMessage + '\'' +
                        ",errorCode = '" + errorCode + '\'' +
                        "}";
    }
}