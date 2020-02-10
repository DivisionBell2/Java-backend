package pojo.leasingApplication.valid.postLeasingApplicationApplicationIdCheckConsentsOtp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cancel {

    @JsonProperty("href")
    private String href;

    public String getHref() {
        return href;
    }

    @Override
    public String toString() {
        return
                "Cancel{" +
                        "href = '" + href + '\'' +
                        "}";
    }
}