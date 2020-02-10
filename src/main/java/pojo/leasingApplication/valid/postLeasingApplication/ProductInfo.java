package pojo.leasingApplication.valid.postLeasingApplication;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductInfo {

    @JsonProperty("monthTerm")
    private int monthTerm;

    @JsonProperty("earlyUpgradeTerm")
    private int earlyUpgradeTerm;

    @JsonProperty("prolongationTerm")
    private int prolongationTerm;

    @JsonProperty("goodPrice")
    private double goodPrice;

    @JsonProperty("residualValue")
    private double residualValue;

    @JsonProperty("productName")
    private String productName;

    @JsonProperty("leasingSum")
    private double leasingSum;

    @JsonProperty("upgradePayment")
    private double upgradePayment;

    @JsonProperty("productCode")
    private String productCode;

    @JsonProperty("freeUpgradeTerm")
    private int freeUpgradeTerm;

    @JsonProperty("goodName")
    private String goodName;

    @JsonProperty("monthPay")
    private double monthPay;

    @JsonProperty("financialType")
    private String financialType;

    @JsonProperty("goodCode")
    private String goodCode;

    public int getMonthTerm() {
        return monthTerm;
    }

    public int getEarlyUpgradeTerm() {
        return earlyUpgradeTerm;
    }

    public int getProlongationTerm() {
        return prolongationTerm;
    }

    public double getGoodPrice() {
        return goodPrice;
    }

    public double getResidualValue() {
        return residualValue;
    }

    public String getProductName() {
        return productName;
    }

    public double getLeasingSum() {
        return leasingSum;
    }

    public double getUpgradePayment() {
        return upgradePayment;
    }

    public String getProductCode() {
        return productCode;
    }

    public int getFreeUpgradeTerm() {
        return freeUpgradeTerm;
    }

    public String getGoodName() {
        return goodName;
    }

    public double getMonthPay() {
        return monthPay;
    }

    public String getFinancialType() {
        return financialType;
    }

    public String getGoodCode() {
        return goodCode;
    }

    @Override
    public String toString() {
        return
                "ProductInfo{" +
                        "monthTerm = '" + monthTerm + '\'' +
                        ",earlyUpgradeTerm = '" + earlyUpgradeTerm + '\'' +
                        ",prolongationTerm = '" + prolongationTerm + '\'' +
                        ",goodPrice = '" + goodPrice + '\'' +
                        ",residualValue = '" + residualValue + '\'' +
                        ",productName = '" + productName + '\'' +
                        ",leasingSum = '" + leasingSum + '\'' +
                        ",upgradePayment = '" + upgradePayment + '\'' +
                        ",productCode = '" + productCode + '\'' +
                        ",freeUpgradeTerm = '" + freeUpgradeTerm + '\'' +
                        ",goodName = '" + goodName + '\'' +
                        ",monthPay = '" + monthPay + '\'' +
                        ",financialType = '" + financialType + '\'' +
                        ",goodCode = '" + goodCode + '\'' +
                        "}";
    }
}