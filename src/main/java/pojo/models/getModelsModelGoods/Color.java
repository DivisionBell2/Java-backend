package pojo.models.getModelsModelGoods;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Color {

    @JsonProperty("colorName")
    private String colorName;

    @JsonProperty("colorCode")
    private String colorCode;

    public String getColorName() {
        return colorName;
    }

    public String getColorCode() {
        return colorCode;
    }

    @Override
    public String toString() {
        return
                "Color{" +
                        "colorName = '" + colorName + '\'' +
                        ",colorCode = '" + colorCode + '\'' +
                        "}";
    }
}