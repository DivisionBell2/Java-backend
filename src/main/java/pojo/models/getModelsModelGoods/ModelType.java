package pojo.models.getModelsModelGoods;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ModelType {

    @JsonProperty("code")
    private String code;

    @JsonProperty("name")
    private String name;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return
                "ModelType{" +
                        "code = '" + code + '\'' +
                        ",name = '" + name + '\'' +
                        "}";
    }
}