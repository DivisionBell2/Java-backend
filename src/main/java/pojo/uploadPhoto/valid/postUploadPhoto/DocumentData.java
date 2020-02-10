package pojo.uploadPhoto.valid.postUploadPhoto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentData {

    @JsonProperty("success")
    private boolean success;

    @JsonProperty("documentFields")
    private List<DocumentFieldsItem> documentFields;

    public boolean isSuccess() {
        return success;
    }

    public List<DocumentFieldsItem> getDocumentFields() {
        return documentFields;
    }

    @Override
    public String toString() {
        return
                "DocumentData{" +
                        "success = '" + success + '\'' +
                        ",documentFields = '" + documentFields + '\'' +
                        "}";
    }
}