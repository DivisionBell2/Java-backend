package pojo.leasingApplication.valid.postLeasingApplicationApplicationClientData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientImagesItem {

    @JsonProperty("imageUrl")
    private String imageUrl;

    @JsonProperty("imageType")
    private String imageType;

    public String getImageUrl() {
        return imageUrl;
    }

    public String getImageType() {
        return imageType;
    }

    @Override
    public String toString() {
        return
                "ClientImagesItem{" +
                        "imageUrl = '" + imageUrl + '\'' +
                        ",imageType = '" + imageType + '\'' +
                        "}";
    }
}