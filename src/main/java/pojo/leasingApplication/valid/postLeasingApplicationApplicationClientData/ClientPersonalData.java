package pojo.leasingApplication.valid.postLeasingApplicationApplicationClientData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientPersonalData {

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("occupation")
    private String occupation;

    @JsonProperty("documentType")
    private String documentType;

    @JsonProperty("ident")
    private String ident;

    @JsonProperty("sex")
    private String sex;

    @JsonProperty("hasMiddleName")
    private boolean hasMiddleName;

    @JsonProperty("registrationAddressJson")
    private String registrationAddressJson;

    @JsonProperty("salary")
    private int salary;

    @JsonProperty("birthDate")
    private String birthDate;

    @JsonProperty("issuer")
    private String issuer;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("birthPlace")
    private String birthPlace;

    @JsonProperty("middleName")
    private String middleName;

    @JsonProperty("issuerCode")
    private String issuerCode;

    @JsonProperty("issueDate")
    private String issueDate;

    public String getLastName() {
        return lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getDocumentType() {
        return documentType;
    }

    public String getIdent() {
        return ident;
    }

    public String getSex() {
        return sex;
    }

    public boolean isHasMiddleName() {
        return hasMiddleName;
    }

    public String getRegistrationAddressJson() {
        return registrationAddressJson;
    }

    public int getSalary() {
        return salary;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getIssuer() {
        return issuer;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getIssuerCode() {
        return issuerCode;
    }

    public String getIssueDate() {
        return issueDate;
    }

    @Override
    public String toString() {
        return
                "ClientPersonalData{" +
                        "lastName = '" + lastName + '\'' +
                        ",occupation = '" + occupation + '\'' +
                        ",documentType = '" + documentType + '\'' +
                        ",ident = '" + ident + '\'' +
                        ",sex = '" + sex + '\'' +
                        ",hasMiddleName = '" + hasMiddleName + '\'' +
                        ",registrationAddressJson = '" + registrationAddressJson + '\'' +
                        ",salary = '" + salary + '\'' +
                        ",birthDate = '" + birthDate + '\'' +
                        ",issuer = '" + issuer + '\'' +
                        ",firstName = '" + firstName + '\'' +
                        ",birthPlace = '" + birthPlace + '\'' +
                        ",middleName = '" + middleName + '\'' +
                        ",issuerCode = '" + issuerCode + '\'' +
                        ",issueDate = '" + issueDate + '\'' +
                        "}";
    }
}