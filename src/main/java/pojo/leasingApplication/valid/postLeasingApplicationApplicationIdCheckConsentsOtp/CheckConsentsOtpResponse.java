package pojo.leasingApplication.valid.postLeasingApplicationApplicationIdCheckConsentsOtp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CheckConsentsOtpResponse {

    @JsonProperty("resultData")
    private ResultData resultData;

    @JsonProperty("errorMessage")
    private Object errorMessage;

    @JsonProperty("errorCode")
    private int errorCode;

    public ResultData getResultData() {
        return resultData;
    }

    public Object getErrorMessage() {
        return errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    @Override
    public String toString() {
        return
                "CheckConsentsOtpResponse{" +
                        "resultData = '" + resultData + '\'' +
                        ",errorMessage = '" + errorMessage + '\'' +
                        ",errorCode = '" + errorCode + '\'' +
                        "}";
    }
}