package pojo.leasingApplication.valid.postLeasingApplicationApplicationIdCheckConsentsOtp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Links {

    @JsonProperty("cancel")
    private Cancel cancel;

    @JsonProperty("upload-selfie-or-passport")
    private UploadSelfieOrPassport uploadSelfieOrPassport;

    public Cancel getCancel() {
        return cancel;
    }

    public UploadSelfieOrPassport getUploadSelfieOrPassport() {
        return uploadSelfieOrPassport;
    }

    @Override
    public String toString() {
        return
                "Links{" +
                        "cancel = '" + cancel + '\'' +
                        ",upload-selfie-or-passport = '" + uploadSelfieOrPassport + '\'' +
                        "}";
    }
}