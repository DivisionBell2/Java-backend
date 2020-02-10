package pojo.models.getModelsModelGoods;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SimilarGoodsItem {

    @JsonProperty("code")
    private String code;

    @JsonProperty("param")
    private List<ParamItem> param;

    public String getCode() {
        return code;
    }

    public List<ParamItem> getParam() {
        return param;
    }

    @Override
    public String toString() {
        return
                "SimilarGoodsItem{" +
                        "code = '" + code + '\'' +
                        ",param = '" + param + '\'' +
                        "}";
    }
}