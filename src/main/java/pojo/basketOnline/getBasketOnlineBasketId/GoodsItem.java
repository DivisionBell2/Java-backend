package pojo.basketOnline.getBasketOnlineBasketId;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GoodsItem {

    @JsonProperty("goodName")
    private String goodName;

    @JsonProperty("partnerSKU")
    private Object partnerSKU;

    @JsonProperty("obligatory")
    private boolean obligatory;

    @JsonProperty("price")
    private double price;

    @JsonProperty("count")
    private int count;

    @JsonProperty("goodType")
    private String goodType;

    @JsonProperty("tradeInIfo")
    private Object tradeInIfo;

    @JsonProperty("goodCode")
    private String goodCode;

    @JsonProperty("partnerGoodName")
    private Object partnerGoodName;

    @JsonProperty("leasingInfo")
    private LeasingInfo leasingInfo;

    public String getGoodName() {
        return goodName;
    }

    public Object getPartnerSKU() {
        return partnerSKU;
    }

    public boolean isObligatory() {
        return obligatory;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public String getGoodType() {
        return goodType;
    }

    public Object getTradeInIfo() {
        return tradeInIfo;
    }

    public String getGoodCode() {
        return goodCode;
    }

    public Object getPartnerGoodName() {
        return partnerGoodName;
    }

    public LeasingInfo getLeasingInfo() {
        return leasingInfo;
    }

    @Override
    public String toString() {
        return
                "GoodsItem{" +
                        "goodName = '" + goodName + '\'' +
                        ",partnerSKU = '" + partnerSKU + '\'' +
                        ",obligatory = '" + obligatory + '\'' +
                        ",price = '" + price + '\'' +
                        ",count = '" + count + '\'' +
                        ",goodType = '" + goodType + '\'' +
                        ",tradeInIfo = '" + tradeInIfo + '\'' +
                        ",goodCode = '" + goodCode + '\'' +
                        ",partnerGoodName = '" + partnerGoodName + '\'' +
                        ",leasingInfo = '" + leasingInfo + '\'' +
                        "}";
    }
}