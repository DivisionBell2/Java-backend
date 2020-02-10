package pojo.uploadPhoto.valid.postUploadPhoto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentFieldsItem {

    @JsonProperty("fieldName")
    private String fieldName;

    @JsonProperty("correct")
    private boolean correct;

    @JsonProperty("fieldValue")
    private String fieldValue;

    public String getFieldName() {
        return fieldName;
    }

    public boolean isCorrect() {
        return correct;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    @Override
    public String toString() {
        return
                "DocumentFieldsItem{" +
                        "fieldName = '" + fieldName + '\'' +
                        ",correct = '" + correct + '\'' +
                        ",fieldValue = '" + fieldValue + '\'' +
                        "}";
    }
}