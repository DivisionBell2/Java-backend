package pojo.models.getModelsModelGoods;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GoodsItem {

    @JsonProperty("additionalServices")
    private List<AdditionalServicesItem> additionalServices;

    @JsonProperty("images")
    private List<ImagesItem> images;

    @JsonProperty("code")
    private String code;

    @JsonProperty("color")
    private Color color;

    @JsonProperty("description")
    private Object description;

    @JsonProperty("shortDescription")
    private Object shortDescription;

    @JsonProperty("params")
    private List<ParamsItem> params;

    @JsonProperty("features")
    private List<FeaturesItem> features;

    @JsonProperty("marketingCodes")
    private Object marketingCodes;

    @JsonProperty("modifyTime")
    private String modifyTime;

    @JsonProperty("price")
    private double price;

    @JsonProperty("sortOrder")
    private int sortOrder;

    @JsonProperty("name")
    private String name;

    @JsonProperty("onSale")
    private boolean onSale;

    @JsonProperty("similarGoods")
    private List<SimilarGoodsItem> similarGoods;

    @JsonProperty("contentLabel")
    private List<ContentLabelItem> contentLabel;

    @JsonProperty("leasingInfo")
    private LeasingInfo leasingInfo;

    public List<AdditionalServicesItem> getAdditionalServices() {
        return additionalServices;
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

    public Object getDescription() {
        return description;
    }

    public Object getShortDescription() {
        return shortDescription;
    }

    public List<ParamsItem> getParams() {
        return params;
    }

    public List<FeaturesItem> getFeatures() {
        return features;
    }

    public Object getMarketingCodes() {
        return marketingCodes;
    }

    public String getModifyTime() {
        return modifyTime;
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

    public List<SimilarGoodsItem> getSimilarGoods() {
        return similarGoods;
    }

    public List<ContentLabelItem> getContentLabel() {
        return contentLabel;
    }

    public LeasingInfo getLeasingInfo() {
        return leasingInfo;
    }

    @Override
    public String toString() {
        return
                "GoodsItem{" +
                        "additionalServices = '" + additionalServices + '\'' +
                        ",images = '" + images + '\'' +
                        ",code = '" + code + '\'' +
                        ",color = '" + color + '\'' +
                        ",description = '" + description + '\'' +
                        ",shortDescription = '" + shortDescription + '\'' +
                        ",params = '" + params + '\'' +
                        ",features = '" + features + '\'' +
                        ",marketingCodes = '" + marketingCodes + '\'' +
                        ",modifyTime = '" + modifyTime + '\'' +
                        ",price = '" + price + '\'' +
                        ",sortOrder = '" + sortOrder + '\'' +
                        ",name = '" + name + '\'' +
                        ",onSale = '" + onSale + '\'' +
                        ",similarGoods = '" + similarGoods + '\'' +
                        ",contentLabel = '" + contentLabel + '\'' +
                        ",leasingInfo = '" + leasingInfo + '\'' +
                        "}";
    }
}