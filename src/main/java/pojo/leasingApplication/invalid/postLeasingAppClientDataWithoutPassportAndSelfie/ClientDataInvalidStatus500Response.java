package pojo.leasingApplication.invalid.postLeasingAppClientDataWithoutPassportAndSelfie;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientDataInvalidStatus500Response {

    @JsonProperty("exception")
    private String exception;

    @JsonProperty("path")
    private String path;

    @JsonProperty("error")
    private String error;

    @JsonProperty("message")
    private String message;

    @JsonProperty("timestamp")
    private long timestamp;

    @JsonProperty("status")
    private int status;

    public String getException() {
        return exception;
    }

    public String getPath() {
        return path;
    }

    public String getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public int getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return
                "CLientDataResponseNoValid{" +
                        "exception = '" + exception + '\'' +
                        ",path = '" + path + '\'' +
                        ",error = '" + error + '\'' +
                        ",message = '" + message + '\'' +
                        ",timestamp = '" + timestamp + '\'' +
                        ",status = '" + status + '\'' +
                        "}";
    }
}