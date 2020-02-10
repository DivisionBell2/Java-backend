package pojo.models.getModelsModelGoods;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultData {

    @JsonProperty("goods")
    private List<GoodsItem> goods;

    @JsonProperty("model")
    private Model model;

    public List<GoodsItem> getGoods() {
        return goods;
    }

    public Model getModel() {
        return model;
    }

    @Override
    public String toString() {
        return
                "ResultData{" +
                        "goods = '" + goods + '\'' +
                        ",model = '" + model + '\'' +
                        "}";
    }
}