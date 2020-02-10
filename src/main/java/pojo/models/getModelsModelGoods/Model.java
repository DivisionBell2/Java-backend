package pojo.models.getModelsModelGoods;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Model {

    @JsonProperty("code")
    private String code;

    @JsonProperty("marketingLabel")
    private Object marketingLabel;

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

    public String getCode() {
        return code;
    }

    public Object getMarketingLabel() {
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

    @Override
    public String toString() {
        return
                "Model{" +
                        "code = '" + code + '\'' +
                        ",marketingLabel = '" + marketingLabel + '\'' +
                        ",sortOrder = '" + sortOrder + '\'' +
                        ",name = '" + name + '\'' +
                        ",producer = '" + producer + '\'' +
                        ",description = '" + description + '\'' +
                        ",modelType = '" + modelType + '\'' +
                        ",categoryCodes = '" + categoryCodes + '\'' +
                        "}";
    }
}