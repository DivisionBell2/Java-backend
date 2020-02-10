package pojo.leasingApplication.invalid.LeasingApplicationEmptyEmailOrPhoneResponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultData {

    @SerializedName("fieldName")
    private String fieldName;

    public String getFieldName() {
        return fieldName;
    }

    @Override
    public String toString() {
        return
                "ResultData{" +
                        "fieldName = '" + fieldName + '\'' +
                        "}";
    }
}