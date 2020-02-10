package pojo.basketOnline.getBasketOnlineBasketId;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LeasingInfo {

    @JsonProperty("leasingSum")
    private double leasingSum;

    @JsonProperty("upgradePayment")
    private double upgradePayment;

    @JsonProperty("productCode")
    private String productCode;

    @JsonProperty("freeUpgradeTerm")
    private int freeUpgradeTerm;

    @JsonProperty("monthPay")
    private double monthPay;

    @JsonProperty("financialType")
    private String financialType;

    @JsonProperty("monthTerm")
    private int monthTerm;

    @JsonProperty("earlyUpgradeTerm")
    private int earlyUpgradeTerm;

    @JsonProperty("prolongationTerm")
    private int prolongationTerm;

    @JsonProperty("productName")
    private String productName;

    @JsonProperty("residualSum")
    private double residualSum;

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

    public double getMonthPay() {
        return monthPay;
    }

    public String getFinancialType() {
        return financialType;
    }

    public int getMonthTerm() {
        return monthTerm;
    }

    public int getEarlyUpgradeTerm() {
        return earlyUpgradeTerm;
    }

    public int getProlongationTerm() {
        return prolongationTerm;
    }

    public String getProductName() {
        return productName;
    }

    public double getResidualSum() {
        return residualSum;
    }

    @Override
    public String toString() {
        return
                "LeasingInfo{" +
                        "leasingSum = '" + leasingSum + '\'' +
                        ",upgradePayment = '" + upgradePayment + '\'' +
                        ",productCode = '" + productCode + '\'' +
                        ",freeUpgradeTerm = '" + freeUpgradeTerm + '\'' +
                        ",monthPay = '" + monthPay + '\'' +
                        ",financialType = '" + financialType + '\'' +
                        ",monthTerm = '" + monthTerm + '\'' +
                        ",earlyUpgradeTerm = '" + earlyUpgradeTerm + '\'' +
                        ",prolongationTerm = '" + prolongationTerm + '\'' +
                        ",productName = '" + productName + '\'' +
                        ",residualSum = '" + residualSum + '\'' +
                        "}";
    }
}