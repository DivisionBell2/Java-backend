package pojo.leasingApplication.valid.postLeasingApplicationApplicationClientData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicationInfo {

    @JsonProperty("clientPersonalDataMasked")
    private ClientPersonalDataMasked clientPersonalDataMasked;

    @JsonProperty("agentId")
    private Object agentId;

    @JsonProperty("clientImages")
    private List<ClientImagesItem> clientImages;

    @JsonProperty("hasPersonalDataExist")
    private boolean hasPersonalDataExist;

    @JsonProperty("clientPersonalData")
    private ClientPersonalData clientPersonalData;

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

    @JsonProperty("hardCheckCode")
    private String hardCheckCode;

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

    public ClientPersonalDataMasked getClientPersonalDataMasked() {
        return clientPersonalDataMasked;
    }

    public Object getAgentId() {
        return agentId;
    }

    public List<ClientImagesItem> getClientImages() {
        return clientImages;
    }

    public boolean isHasPersonalDataExist() {
        return hasPersonalDataExist;
    }

    public ClientPersonalData getClientPersonalData() {
        return clientPersonalData;
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

    public String getHardCheckCode() {
        return hardCheckCode;
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
                "ApplicationInfo{" +
                        "clientPersonalDataMasked = '" + clientPersonalDataMasked + '\'' +
                        ",agentId = '" + agentId + '\'' +
                        ",clientImages = '" + clientImages + '\'' +
                        ",hasPersonalDataExist = '" + hasPersonalDataExist + '\'' +
                        ",clientPersonalData = '" + clientPersonalData + '\'' +
                        ",hasPassportImage = '" + hasPassportImage + '\'' +
                        ",previousApplicationId = '" + previousApplicationId + '\'' +
                        ",type = '" + type + '\'' +
                        ",hardCheckText = '" + hardCheckText + '\'' +
                        ",passportSelfieStatus = '" + passportSelfieStatus + '\'' +
                        ",productInfo = '" + productInfo + '\'' +
                        ",hardCheckCode = '" + hardCheckCode + '\'' +
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