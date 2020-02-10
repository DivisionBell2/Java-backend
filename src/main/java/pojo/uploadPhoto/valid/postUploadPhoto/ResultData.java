package pojo.uploadPhoto.valid.postUploadPhoto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultData {

    @JsonProperty("application")
    private Application application;

    @JsonProperty("checkResultText")
    private Object checkResultText;

    @JsonProperty("documentData")
    private DocumentData documentData;

    @JsonProperty("applicantStatus")
    private String applicantStatus;

    public Application getApplication() {
        return application;
    }

    public Object getCheckResultText() {
        return checkResultText;
    }

    public DocumentData getDocumentData() {
        return documentData;
    }

    public String getApplicantStatus() {
        return applicantStatus;
    }

    @Override
    public String toString() {
        return
                "ResultData{" +
                        "application = '" + application + '\'' +
                        ",checkResultText = '" + checkResultText + '\'' +
                        ",documentData = '" + documentData + '\'' +
                        ",applicantStatus = '" + applicantStatus + '\'' +
                        "}";
    }
}