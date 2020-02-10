package pojo.basketOnline.postBasketOnline;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultData {

    @JsonProperty("basketId")
    private String basketId;

    public String getBasketId() {
        return basketId;
    }

    @Override
    public String toString() {
        return
                "ResultData{" +
                        "basketId = '" + basketId + '\'' +
                        "}";
    }
}