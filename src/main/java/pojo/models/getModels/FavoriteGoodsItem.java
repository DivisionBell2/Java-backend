package pojo.models.getModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FavoriteGoodsItem {

    @JsonProperty("good")
    private Good good;

    public Good getGood() {
        return good;
    }

    @Override
    public String toString() {
        return
                "FavoriteGoodsItem{" +
                        "good = '" + good + '\'' +
                        "}";
    }
}