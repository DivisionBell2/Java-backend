package pojo.leasingApplication.valid.postLeasingApplicationApplicationIdCheckConsentsOtp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultData {

    @JsonProperty("_links")
    private Links links;

    @JsonProperty("resultCode")
    private String resultCode;

    @JsonProperty("token")
    private String token;

    public Links getLinks() {
        return links;
    }

    public String getResultCode() {
        return resultCode;
    }

    public String getToken() {
        return token;
    }

    @Override
    public String toString() {
        return
                "ResultData{" +
                        "_links = '" + links + '\'' +
                        ",resultCode = '" + resultCode + '\'' +
                        ",token = '" + token + '\'' +
                        "}";
    }
}