package pojo.leasingApplication.valid.postLeasingApplicationApplicationClientData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientPersonalDataMasked {

    @JsonProperty("occupation")
    private String occupation;

    @JsonProperty("issuerCodeMasked")
    private String issuerCodeMasked;

    @JsonProperty("sex")
    private String sex;

    @JsonProperty("issuerMasked")
    private String issuerMasked;

    @JsonProperty("hasPassportImage")
    private boolean hasPassportImage;

    @JsonProperty("birthDateMasked")
    private String birthDateMasked;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("registrationAddressMasked")
    private String registrationAddressMasked;

    @JsonProperty("birthPlaceMasked")
    private String birthPlaceMasked;

    @JsonProperty("issueDateMasked")
    private String issueDateMasked;

    @JsonProperty("lastNameMasked")
    private String lastNameMasked;

    @JsonProperty("patronymicNameMasked")
    private String patronymicNameMasked;

    @JsonProperty("identMasked")
    private String identMasked;

    @JsonProperty("email")
    private String email;

    @JsonProperty("mobilePhoneMasked")
    private String mobilePhoneMasked;

    public String getOccupation() {
        return occupation;
    }

    public String getIssuerCodeMasked() {
        return issuerCodeMasked;
    }

    public String getSex() {
        return sex;
    }

    public String getIssuerMasked() {
        return issuerMasked;
    }

    public boolean isHasPassportImage() {
        return hasPassportImage;
    }

    public String getBirthDateMasked() {
        return birthDateMasked;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getRegistrationAddressMasked() {
        return registrationAddressMasked;
    }

    public String getBirthPlaceMasked() {
        return birthPlaceMasked;
    }

    public String getIssueDateMasked() {
        return issueDateMasked;
    }

    public String getLastNameMasked() {
        return lastNameMasked;
    }

    public String getPatronymicNameMasked() {
        return patronymicNameMasked;
    }

    public String getIdentMasked() {
        return identMasked;
    }

    public String getEmail() {
        return email;
    }

    public String getMobilePhoneMasked() {
        return mobilePhoneMasked;
    }

    @Override
    public String toString() {
        return
                "ClientPersonalDataMasked{" +
                        "occupation = '" + occupation + '\'' +
                        ",issuerCodeMasked = '" + issuerCodeMasked + '\'' +
                        ",sex = '" + sex + '\'' +
                        ",issuerMasked = '" + issuerMasked + '\'' +
                        ",hasPassportImage = '" + hasPassportImage + '\'' +
                        ",birthDateMasked = '" + birthDateMasked + '\'' +
                        ",firstName = '" + firstName + '\'' +
                        ",registrationAddressMasked = '" + registrationAddressMasked + '\'' +
                        ",birthPlaceMasked = '" + birthPlaceMasked + '\'' +
                        ",issueDateMasked = '" + issueDateMasked + '\'' +
                        ",lastNameMasked = '" + lastNameMasked + '\'' +
                        ",patronymicNameMasked = '" + patronymicNameMasked + '\'' +
                        ",identMasked = '" + identMasked + '\'' +
                        ",email = '" + email + '\'' +
                        ",mobilePhoneMasked = '" + mobilePhoneMasked + '\'' +
                        "}";
    }
}