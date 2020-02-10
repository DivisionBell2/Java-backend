package pojo.models.getModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Good {

    @JsonProperty("volume")
    private String volume;

    @JsonProperty("isDefault")
    private boolean isDefault;

    @JsonProperty("images")
    private List<ImagesItem> images;

    @JsonProperty("code")
    private String code;

    @JsonProperty("color")
    private Color color;

    @JsonProperty("price")
    private double price;

    @JsonProperty("sortOrder")
    private int sortOrder;

    @JsonProperty("name")
    private String name;

    @JsonProperty("onSale")
    private boolean onSale;

    @JsonProperty("shortDescription")
    private Object shortDescription;

    @JsonProperty("leasingInfo")
    private LeasingInfo leasingInfo;

    @JsonProperty("contentLabels")
    private List<ContentLabelsItem> contentLabels;

    public String getVolume() {
        return volume;
    }

    public boolean isIsDefault() {
        return isDefault;
    }

    public List<ImagesItem> getImages() {
        return images;
    }

    public String getCode() {
        return code;
    }

    public Color getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public String getName() {
        return name;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public Object getShortDescription() {
        return shortDescription;
    }

    public LeasingInfo getLeasingInfo() {
        return leasingInfo;
    }

    public List<ContentLabelsItem> getContentLabels() {
        return contentLabels;
    }

    @Override
    public String toString() {
        return
                "Good{" +
                        "volume = '" + volume + '\'' +
                        ",isDefault = '" + isDefault + '\'' +
                        ",images = '" + images + '\'' +
                        ",code = '" + code + '\'' +
                        ",color = '" + color + '\'' +
                        ",price = '" + price + '\'' +
                        ",sortOrder = '" + sortOrder + '\'' +
                        ",name = '" + name + '\'' +
                        ",onSale = '" + onSale + '\'' +
                        ",shortDescription = '" + shortDescription + '\'' +
                        ",leasingInfo = '" + leasingInfo + '\'' +
                        ",contentLabels = '" + contentLabels + '\'' +
                        "}";
    }
}