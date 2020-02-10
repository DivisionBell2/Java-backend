package pojo.models.getModelsModelGoods;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ImagesItem {

    @JsonProperty("imgUrl")
    private String imgUrl;

    @JsonProperty("sortOrder")
    private int sortOrder;

    @JsonProperty("type")
    private String type;

    @JsonProperty("thumbUrl")
    private Object thumbUrl;

    public String getImgUrl() {
        return imgUrl;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public String getType() {
        return type;
    }

    public Object getThumbUrl() {
        return thumbUrl;
    }

    @Override
    public String toString() {
        return
                "ImagesItem{" +
                        "imgUrl = '" + imgUrl + '\'' +
                        ",sortOrder = '" + sortOrder + '\'' +
                        ",type = '" + type + '\'' +
                        ",thumbUrl = '" + thumbUrl + '\'' +
                        "}";
    }
}