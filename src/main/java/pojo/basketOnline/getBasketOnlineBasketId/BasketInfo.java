package pojo.basketOnline.getBasketOnlineBasketId;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BasketInfo {

    @JsonProperty("basketId")
    private String basketId;

    @JsonProperty("agentId")
    private Object agentId;

    @JsonProperty("totalMonthPay")
    private double totalMonthPay;

    @JsonProperty("orderId")
    private Object orderId;

    @JsonProperty("totalPrice")
    private double totalPrice;

    @JsonProperty("channel")
    private String channel;

    @JsonProperty("goods")
    private List<GoodsItem> goods;

    @JsonProperty("employeeId")
    private Object employeeId;

    @JsonProperty("storeId")
    private Object storeId;

    @JsonProperty("type")
    private String type;

    @JsonProperty("referenceId")
    private Object referenceId;

    @JsonProperty("usid")
    private String usid;

    @JsonProperty("totalLeasingSum")
    private double totalLeasingSum;

    @JsonProperty("partnerId")
    private Object partnerId;

    @JsonProperty("lang")
    private String lang;

    @JsonProperty("status")
    private String status;

    @JsonProperty("expirationDate")
    private String expirationDate;

    public String getBasketId() {
        return basketId;
    }

    public Object getAgentId() {
        return agentId;
    }

    public double getTotalMonthPay() {
        return totalMonthPay;
    }

    public Object getOrderId() {
        return orderId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getChannel() {
        return channel;
    }

    public List<GoodsItem> getGoods() {
        return goods;
    }

    public Object getEmployeeId() {
        return employeeId;
    }

    public Object getStoreId() {
        return storeId;
    }

    public String getType() {
        return type;
    }

    public Object getReferenceId() {
        return referenceId;
    }

    public String getUsid() {
        return usid;
    }

    public double getTotalLeasingSum() {
        return totalLeasingSum;
    }

    public Object getPartnerId() {
        return partnerId;
    }

    public String getLang() {
        return lang;
    }

    public String getStatus() {
        return status;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return
                "BasketInfo{" +
                        "basketId = '" + basketId + '\'' +
                        ",agentId = '" + agentId + '\'' +
                        ",totalMonthPay = '" + totalMonthPay + '\'' +
                        ",orderId = '" + orderId + '\'' +
                        ",totalPrice = '" + totalPrice + '\'' +
                        ",channel = '" + channel + '\'' +
                        ",goods = '" + goods + '\'' +
                        ",employeeId = '" + employeeId + '\'' +
                        ",storeId = '" + storeId + '\'' +
                        ",type = '" + type + '\'' +
                        ",referenceId = '" + referenceId + '\'' +
                        ",usid = '" + usid + '\'' +
                        ",totalLeasingSum = '" + totalLeasingSum + '\'' +
                        ",partnerId = '" + partnerId + '\'' +
                        ",lang = '" + lang + '\'' +
                        ",status = '" + status + '\'' +
                        ",expirationDate = '" + expirationDate + '\'' +
                        "}";
    }
}