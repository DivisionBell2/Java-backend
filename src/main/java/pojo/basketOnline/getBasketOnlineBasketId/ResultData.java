package pojo.basketOnline.getBasketOnlineBasketId;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultData {

    @JsonProperty("basketInfo")
    private BasketInfo basketInfo;

    public BasketInfo getBasketInfo() {
        return basketInfo;
    }

    @Override
    public String toString() {
        return
                "ResultData{" +
                        "basketInfo = '" + basketInfo + '\'' +
                        "}";
    }
}