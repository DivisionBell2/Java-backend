package pojo.leasingApplication.valid.postLeasingApplication;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultData {

    @JsonProperty("basketId")
    private String basketId;

    @JsonProperty("agentId")
    private Object agentId;

    @JsonProperty("hasPersonalDataExist")
    private boolean hasPersonalDataExist;

    @JsonProperty("hasPassportImage")
    private boolean hasPassportImage;

    @JsonProperty("previousApplicationId")
    private Object previousApplicationId;

    @JsonProperty("type")
    private String type;

    @JsonProperty("hardCheckText")
    private Object hardCheckText;

    @JsonProperty("passportSelfieStatus")
    private String passportSelfieStatus;

    @JsonProperty("productInfo")
    private ProductInfo productInfo;

    @JsonProperty("hasSelfieImage")
    private boolean hasSelfieImage;

    @JsonProperty("partnerId")
    private Object partnerId;

    @JsonProperty("applicationID")
    private String applicationID;

    @JsonProperty("email")
    private String email;

    @JsonProperty("createDate")
    private String createDate;

    @JsonProperty("expirationDate")
    private String expirationDate;

    @JsonProperty("status")
    private String status;

    @JsonProperty("mobilePhoneMasked")
    private String mobilePhoneMasked;

    public String getBasketId() {
        return basketId;
    }

    public Object getAgentId() {
        return agentId;
    }

    public boolean isHasPersonalDataExist() {
        return hasPersonalDataExist;
    }

    public boolean isHasPassportImage() {
        return hasPassportImage;
    }

    public Object getPreviousApplicationId() {
        return previousApplicationId;
    }

    public String getType() {
        return type;
    }

    public Object getHardCheckText() {
        return hardCheckText;
    }

    public String getPassportSelfieStatus() {
        return passportSelfieStatus;
    }

    public ProductInfo getProductInfo() {
        return productInfo;
    }

    public boolean isHasSelfieImage() {
        return hasSelfieImage;
    }

    public Object getPartnerId() {
        return partnerId;
    }

    public String getApplicationID() {
        return applicationID;
    }

    public String getEmail() {
        return email;
    }

    public String getCreateDate() {
        return createDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public String getStatus() {
        return status;
    }

    public String getMobilePhoneMasked() {
        return mobilePhoneMasked;
    }

    @Override
    public String toString() {
        return
                "ResultData{" +
                        "basketId = '" + basketId + '\'' +
                        ",agentId = '" + agentId + '\'' +
                        ",hasPersonalDataExist = '" + hasPersonalDataExist + '\'' +
                        ",hasPassportImage = '" + hasPassportImage + '\'' +
                        ",previousApplicationId = '" + previousApplicationId + '\'' +
                        ",type = '" + type + '\'' +
                        ",hardCheckText = '" + hardCheckText + '\'' +
                        ",passportSelfieStatus = '" + passportSelfieStatus + '\'' +
                        ",productInfo = '" + productInfo + '\'' +
                        ",hasSelfieImage = '" + hasSelfieImage + '\'' +
                        ",partnerId = '" + partnerId + '\'' +
                        ",applicationID = '" + applicationID + '\'' +
                        ",email = '" + email + '\'' +
                        ",createDate = '" + createDate + '\'' +
                        ",expirationDate = '" + expirationDate + '\'' +
                        ",status = '" + status + '\'' +
                        ",mobilePhoneMasked = '" + mobilePhoneMasked + '\'' +
                        "}";
    }
}