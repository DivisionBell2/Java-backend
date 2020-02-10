package pojo.models.getModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultData {

    @JsonProperty("models")
    private List<ModelsItem> models;

    @JsonProperty("subscriptions")
    private Object subscriptions;

    public List<ModelsItem> getModels() {
        return models;
    }

    public Object getSubscriptions() {
        return subscriptions;
    }

    @Override
    public String toString() {
        return
                "ResultData{" +
                        "models = '" + models + '\'' +
                        ",subscriptions = '" + subscriptions + '\'' +
                        "}";
    }
}