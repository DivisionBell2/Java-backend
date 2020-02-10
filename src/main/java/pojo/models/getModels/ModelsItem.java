package pojo.models.getModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ModelsItem {

    @JsonProperty("code")
    private String code;

    @JsonProperty("marketingLabel")
    private String marketingLabel;

    @JsonProperty("sortOrder")
    private int sortOrder;

    @JsonProperty("name")
    private String name;

    @JsonProperty("producer")
    private Producer producer;

    @JsonProperty("description")
    private String description;

    @JsonProperty("modelType")
    private ModelType modelType;

    @JsonProperty("categoryCodes")
    private List<String> categoryCodes;

    @JsonProperty("favoriteGoods")
    private List<FavoriteGoodsItem> favoriteGoods;

    @JsonProperty("contentLabels")
    private Object contentLabels;

    public String getCode() {
        return code;
    }

    public String getMarketingLabel() {
        return marketingLabel;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public String getName() {
        return name;
    }

    public Producer getProducer() {
        return producer;
    }

    public String getDescription() {
        return description;
    }

    public ModelType getModelType() {
        return modelType;
    }

    public List<String> getCategoryCodes() {
        return categoryCodes;
    }

    public List<FavoriteGoodsItem> getFavoriteGoods() {
        return favoriteGoods;
    }

    public Object getContentLabels() {
        return contentLabels;
    }

    @Override
    public String toString() {
        return
                "ModelsItem{" +
                        "code = '" + code + '\'' +
                        ",marketingLabel = '" + marketingLabel + '\'' +
                        ",sortOrder = '" + sortOrder + '\'' +
                        ",name = '" + name + '\'' +
                        ",producer = '" + producer + '\'' +
                        ",description = '" + description + '\'' +
                        ",modelType = '" + modelType + '\'' +
                        ",categoryCodes = '" + categoryCodes + '\'' +
                        ",favoriteGoods = '" + favoriteGoods + '\'' +
                        ",contentLabels = '" + contentLabels + '\'' +
                        "}";
    }
}