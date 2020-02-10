package pojo.models.getModelsModelGoods;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Producer {

    @JsonProperty("code")
    private String code;

    @JsonProperty("name")
    private String name;

    @JsonProperty("categoryCodes")
    private List<String> categoryCodes;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public List<String> getCategoryCodes() {
        return categoryCodes;
    }

    @Override
    public String toString() {
        return
                "Producer{" +
                        "code = '" + code + '\'' +
                        ",name = '" + name + '\'' +
                        ",categoryCodes = '" + categoryCodes + '\'' +
                        "}";
    }
}