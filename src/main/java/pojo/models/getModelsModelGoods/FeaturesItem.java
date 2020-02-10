package pojo.models.getModelsModelGoods;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FeaturesItem {

    @JsonProperty("imgUrl")
    private String imgUrl;

    @JsonProperty("actionUrl")
    private Object actionUrl;

    @JsonProperty("title")
    private Object title;

    @JsonProperty("type")
    private String type;

    @JsonProperty("content")
    private String content;

    public String getImgUrl() {
        return imgUrl;
    }

    public Object getActionUrl() {
        return actionUrl;
    }

    public Object getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return
                "FeaturesItem{" +
                        "imgUrl = '" + imgUrl + '\'' +
                        ",actionUrl = '" + actionUrl + '\'' +
                        ",title = '" + title + '\'' +
                        ",type = '" + type + '\'' +
                        ",content = '" + content + '\'' +
                        "}";
    }
}