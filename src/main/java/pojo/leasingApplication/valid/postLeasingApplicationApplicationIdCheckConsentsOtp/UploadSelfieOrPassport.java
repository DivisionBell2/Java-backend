package pojo.leasingApplication.valid.postLeasingApplicationApplicationIdCheckConsentsOtp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UploadSelfieOrPassport {

    @JsonProperty("href")
    private String href;

    public String getHref() {
        return href;
    }

    @Override
    public String toString() {
        return
                "UploadSelfieOrPassport{" +
                        "href = '" + href + '\'' +
                        "}";
    }
}