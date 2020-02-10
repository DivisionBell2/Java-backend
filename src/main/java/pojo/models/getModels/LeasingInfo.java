package pojo.models.getModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LeasingInfo {

    @JsonProperty("leasingSum")
    private double leasingSum;

    @JsonProperty("upgradePayment")
    private double upgradePayment;

    @JsonProperty("code")
    private String code;

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

    @JsonProperty("hasUpgrade")
    private boolean hasUpgrade;

    @JsonProperty("residualSum")
    private double residualSum;

    public double getLeasingSum() {
        return leasingSum;
    }

    public double getUpgradePayment() {
        return upgradePayment;
    }

    public String getCode() {
        return code;
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

    public boolean isHasUpgrade() {
        return hasUpgrade;
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
                        ",code = '" + code + '\'' +
                        ",freeUpgradeTerm = '" + freeUpgradeTerm + '\'' +
                        ",monthPay = '" + monthPay + '\'' +
                        ",financialType = '" + financialType + '\'' +
                        ",monthTerm = '" + monthTerm + '\'' +
                        ",earlyUpgradeTerm = '" + earlyUpgradeTerm + '\'' +
                        ",prolongationTerm = '" + prolongationTerm + '\'' +
                        ",hasUpgrade = '" + hasUpgrade + '\'' +
                        ",residualSum = '" + residualSum + '\'' +
                        "}";
    }
}