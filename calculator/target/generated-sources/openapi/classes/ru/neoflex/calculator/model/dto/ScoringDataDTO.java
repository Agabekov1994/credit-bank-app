package ru.neoflex.calculator.model.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import ru.neoflex.calculator.model.dto.EmploymentDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Полные оценочные данные.
 */

@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder(toBuilder = true)
@lombok.Data

@Schema(name = "ScoringDataDTO", description = "Полные оценочные данные.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-20T01:26:53.519840700+04:00[Europe/Saratov]")
public class ScoringDataDTO {

  private java.math.BigDecimal amount;

  private Integer term;

  private String firstName;

  private String lastName;

  private String middleName;

  /**
   * Пол клиента.
   */
  public enum GenderEnum {
    MALE("MALE"),
    
    FEMALE("FEMALE"),
    
    NON_BINARY("NON_BINARY");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private GenderEnum gender;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate birthdate;

  private String passportSeries;

  private String passportNumber;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate passportIssueDate;

  private String passportIssueBranch;

  /**
   * Семейное положение клиента.
   */
  public enum MaritalStatusEnum {
    MARRIED("MARRIED"),
    
    DIVORCED("DIVORCED"),
    
    SINGLE("SINGLE"),
    
    WIDOW_WIDOWER("WIDOW_WIDOWER");

    private String value;

    MaritalStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MaritalStatusEnum fromValue(String value) {
      for (MaritalStatusEnum b : MaritalStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private MaritalStatusEnum maritalStatus;

  private Integer dependentAmount;

  private EmploymentDTO employment;

  private String accountNumber;

  private Boolean isInsuranceEnabled;

  private Boolean isSalaryClient;

  public ScoringDataDTO amount(java.math.BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Запрашиваемая сумма кредита.
   * minimum: 30000
   * @return amount
  */
  @Valid @DecimalMin("30000") 
  @Schema(name = "amount", example = "1000000", description = "Запрашиваемая сумма кредита.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amount")
  public java.math.BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(java.math.BigDecimal amount) {
    this.amount = amount;
  }

  public ScoringDataDTO term(Integer term) {
    this.term = term;
    return this;
  }

  /**
   * Запрашиваемый срок кредитования (месяцы).
   * minimum: 6
   * @return term
  */
  @Min(6) 
  @Schema(name = "term", example = "24", description = "Запрашиваемый срок кредитования (месяцы).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("term")
  public Integer getTerm() {
    return term;
  }

  public void setTerm(Integer term) {
    this.term = term;
  }

  public ScoringDataDTO firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Имя клиента
   * @return firstName
  */
  @Pattern(regexp = "[A-Za-z\\-]{2,30}") 
  @Schema(name = "firstName", example = "Ivan", description = "Имя клиента", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ScoringDataDTO lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Фамилия клиента
   * @return lastName
  */
  @Pattern(regexp = "[A-Za-z\\-]{2,30}") 
  @Schema(name = "lastName", example = "Ivanov", description = "Фамилия клиента", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ScoringDataDTO middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Отчество клиента(при наличии).
   * @return middleName
  */
  @Pattern(regexp = "[A-Za-z]{2,30}") 
  @Schema(name = "middleName", example = "Ivanovich", description = "Отчество клиента(при наличии).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public ScoringDataDTO gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Пол клиента.
   * @return gender
  */
  
  @Schema(name = "gender", example = "MALE", description = "Пол клиента.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public ScoringDataDTO birthdate(LocalDate birthdate) {
    this.birthdate = birthdate;
    return this;
  }

  /**
   * Дата рождения клиента
   * @return birthdate
  */
  @Valid 
  @Schema(name = "birthdate", example = "Wed Nov 27 03:00:00 GMT+04:00 1996", description = "Дата рождения клиента", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("birthdate")
  public LocalDate getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(LocalDate birthdate) {
    this.birthdate = birthdate;
  }

  public ScoringDataDTO passportSeries(String passportSeries) {
    this.passportSeries = passportSeries;
    return this;
  }

  /**
   * Серия паспорта клиента
   * @return passportSeries
  */
  @Pattern(regexp = "[0-9]{4}") 
  @Schema(name = "passportSeries", example = "1234", description = "Серия паспорта клиента", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passportSeries")
  public String getPassportSeries() {
    return passportSeries;
  }

  public void setPassportSeries(String passportSeries) {
    this.passportSeries = passportSeries;
  }

  public ScoringDataDTO passportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
    return this;
  }

  /**
   * серия паспорта клиента
   * @return passportNumber
  */
  @Pattern(regexp = "[0-9]{6}") 
  @Schema(name = "passportNumber", example = "123456", description = "серия паспорта клиента", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passportNumber")
  public String getPassportNumber() {
    return passportNumber;
  }

  public void setPassportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
  }

  public ScoringDataDTO passportIssueDate(LocalDate passportIssueDate) {
    this.passportIssueDate = passportIssueDate;
    return this;
  }

  /**
   * Дата выдачи паспорта клиента.
   * @return passportIssueDate
  */
  @Valid 
  @Schema(name = "passportIssueDate", example = "Thu Feb 27 04:00:00 GMT+04:00 2020", description = "Дата выдачи паспорта клиента.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passportIssueDate")
  public LocalDate getPassportIssueDate() {
    return passportIssueDate;
  }

  public void setPassportIssueDate(LocalDate passportIssueDate) {
    this.passportIssueDate = passportIssueDate;
  }

  public ScoringDataDTO passportIssueBranch(String passportIssueBranch) {
    this.passportIssueBranch = passportIssueBranch;
    return this;
  }

  /**
   * Отдел выдачи паспорта клиента.
   * @return passportIssueBranch
  */
  
  @Schema(name = "passportIssueBranch", example = "123-456", description = "Отдел выдачи паспорта клиента.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passportIssueBranch")
  public String getPassportIssueBranch() {
    return passportIssueBranch;
  }

  public void setPassportIssueBranch(String passportIssueBranch) {
    this.passportIssueBranch = passportIssueBranch;
  }

  public ScoringDataDTO maritalStatus(MaritalStatusEnum maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  /**
   * Семейное положение клиента.
   * @return maritalStatus
  */
  
  @Schema(name = "maritalStatus", example = "SINGLE", description = "Семейное положение клиента.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maritalStatus")
  public MaritalStatusEnum getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(MaritalStatusEnum maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public ScoringDataDTO dependentAmount(Integer dependentAmount) {
    this.dependentAmount = dependentAmount;
    return this;
  }

  /**
   * количество иждевенцев
   * @return dependentAmount
  */
  
  @Schema(name = "dependentAmount", example = "1", description = "количество иждевенцев", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dependentAmount")
  public Integer getDependentAmount() {
    return dependentAmount;
  }

  public void setDependentAmount(Integer dependentAmount) {
    this.dependentAmount = dependentAmount;
  }

  public ScoringDataDTO employment(EmploymentDTO employment) {
    this.employment = employment;
    return this;
  }

  /**
   * Get employment
   * @return employment
  */
  @Valid 
  @Schema(name = "employment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("employment")
  public EmploymentDTO getEmployment() {
    return employment;
  }

  public void setEmployment(EmploymentDTO employment) {
    this.employment = employment;
  }

  public ScoringDataDTO accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Основной счет клиента.
   * @return accountNumber
  */
  @Pattern(regexp = "[0-9]{20}") 
  @Schema(name = "accountNumber", example = "11223344556677889900", description = "Основной счет клиента.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountNumber")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public ScoringDataDTO isInsuranceEnabled(Boolean isInsuranceEnabled) {
    this.isInsuranceEnabled = isInsuranceEnabled;
    return this;
  }

  /**
   * Включена ли страховка?
   * @return isInsuranceEnabled
  */
  
  @Schema(name = "isInsuranceEnabled", example = "true", description = "Включена ли страховка?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isInsuranceEnabled")
  public Boolean getIsInsuranceEnabled() {
    return isInsuranceEnabled;
  }

  public void setIsInsuranceEnabled(Boolean isInsuranceEnabled) {
    this.isInsuranceEnabled = isInsuranceEnabled;
  }

  public ScoringDataDTO isSalaryClient(Boolean isSalaryClient) {
    this.isSalaryClient = isSalaryClient;
    return this;
  }

  /**
   * Является зарплатным клиентом?
   * @return isSalaryClient
  */
  
  @Schema(name = "isSalaryClient", example = "true", description = "Является зарплатным клиентом?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isSalaryClient")
  public Boolean getIsSalaryClient() {
    return isSalaryClient;
  }

  public void setIsSalaryClient(Boolean isSalaryClient) {
    this.isSalaryClient = isSalaryClient;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScoringDataDTO scoringDataDTO = (ScoringDataDTO) o;
    return Objects.equals(this.amount, scoringDataDTO.amount) &&
        Objects.equals(this.term, scoringDataDTO.term) &&
        Objects.equals(this.firstName, scoringDataDTO.firstName) &&
        Objects.equals(this.lastName, scoringDataDTO.lastName) &&
        Objects.equals(this.middleName, scoringDataDTO.middleName) &&
        Objects.equals(this.gender, scoringDataDTO.gender) &&
        Objects.equals(this.birthdate, scoringDataDTO.birthdate) &&
        Objects.equals(this.passportSeries, scoringDataDTO.passportSeries) &&
        Objects.equals(this.passportNumber, scoringDataDTO.passportNumber) &&
        Objects.equals(this.passportIssueDate, scoringDataDTO.passportIssueDate) &&
        Objects.equals(this.passportIssueBranch, scoringDataDTO.passportIssueBranch) &&
        Objects.equals(this.maritalStatus, scoringDataDTO.maritalStatus) &&
        Objects.equals(this.dependentAmount, scoringDataDTO.dependentAmount) &&
        Objects.equals(this.employment, scoringDataDTO.employment) &&
        Objects.equals(this.accountNumber, scoringDataDTO.accountNumber) &&
        Objects.equals(this.isInsuranceEnabled, scoringDataDTO.isInsuranceEnabled) &&
        Objects.equals(this.isSalaryClient, scoringDataDTO.isSalaryClient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, term, firstName, lastName, middleName, gender, birthdate, passportSeries, passportNumber, passportIssueDate, passportIssueBranch, maritalStatus, dependentAmount, employment, accountNumber, isInsuranceEnabled, isSalaryClient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScoringDataDTO {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
    sb.append("    passportSeries: ").append(toIndentedString(passportSeries)).append("\n");
    sb.append("    passportNumber: ").append(toIndentedString(passportNumber)).append("\n");
    sb.append("    passportIssueDate: ").append(toIndentedString(passportIssueDate)).append("\n");
    sb.append("    passportIssueBranch: ").append(toIndentedString(passportIssueBranch)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    dependentAmount: ").append(toIndentedString(dependentAmount)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    isInsuranceEnabled: ").append(toIndentedString(isInsuranceEnabled)).append("\n");
    sb.append("    isSalaryClient: ").append(toIndentedString(isSalaryClient)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

