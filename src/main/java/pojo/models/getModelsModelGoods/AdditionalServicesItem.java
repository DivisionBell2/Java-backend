package pojo.models.getModelsModelGoods;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AdditionalServicesItem {

    @JsonProperty("code")
    private String code;

    @JsonProperty("obligatory")
    private boolean obligatory;

    @JsonProperty("price")
    private double price;

    @JsonProperty("name")
    private String name;

    @JsonProperty("type")
    private String type;

    public String getCode() {
        return code;
    }

    public boolean isObligatory() {
        return obligatory;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return
                "AdditionalServicesItem{" +
                        "code = '" + code + '\'' +
                        ",obligatory = '" + obligatory + '\'' +
                        ",price = '" + price + '\'' +
                        ",name = '" + name + '\'' +
                        ",type = '" + type + '\'' +
                        "}";
    }
}