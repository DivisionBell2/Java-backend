package pojo.leasingApplication.valid.postLeasingApplicationApplicationClientData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultData {

    @JsonProperty("applicationInfo")
    private ApplicationInfo applicationInfo;

    public ApplicationInfo getApplicationInfo() {
        return applicationInfo;
    }

    @Override
    public String toString() {
        return
                "ResultData{" +
                        "applicationInfo = '" + applicationInfo + '\'' +
                        "}";
    }
}