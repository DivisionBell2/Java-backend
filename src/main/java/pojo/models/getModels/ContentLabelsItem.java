package pojo.models.getModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentLabelsItem {

    @JsonProperty("imgUrl")
    private Object imgUrl;

    @JsonProperty("code")
    private String code;

    @JsonProperty("title")
    private String title;

    @JsonProperty("content")
    private String content;

    public Object getImgUrl() {
        return imgUrl;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return
                "ContentLabelsItem{" +
                        "imgUrl = '" + imgUrl + '\'' +
                        ",code = '" + code + '\'' +
                        ",title = '" + title + '\'' +
                        ",content = '" + content + '\'' +
                        "}";
    }
}