package ru.neoflex.calculator.model.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Краткая информация о заявке.
 */

@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder(toBuilder = true)
@lombok.Data

@Schema(name = "LoanStatementRequestDTO", description = "Краткая информация о заявке.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-20T01:26:53.519840700+04:00[Europe/Saratov]")
public class LoanStatementRequestDTO {

  private java.math.BigDecimal amount;

  private Integer term;

  private String firstName;

  private String lastName;

  private String middleName;

  private String email;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate birthdate;

  private String passportSeries;

  private String passportNumber;

  public LoanStatementRequestDTO amount(java.math.BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Запрашиваемая сумма кредита.
   * minimum: 30000
   * @return amount
  */
  @NotNull @Valid @DecimalMin("30000") 
  @Schema(name = "amount", example = "1000000", description = "Запрашиваемая сумма кредита.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amount")
  public java.math.BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(java.math.BigDecimal amount) {
    this.amount = amount;
  }

  public LoanStatementRequestDTO term(Integer term) {
    this.term = term;
    return this;
  }

  /**
   * Запрашиваемый срок кредитования (месяцы).
   * minimum: 6
   * @return term
  */
  @NotNull @Min(6) 
  @Schema(name = "term", example = "24", description = "Запрашиваемый срок кредитования (месяцы).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("term")
  public Integer getTerm() {
    return term;
  }

  public void setTerm(Integer term) {
    this.term = term;
  }

  public LoanStatementRequestDTO firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Имя клиента
   * @return firstName
  */
  @NotNull @Pattern(regexp = "[A-Za-z\\-]{2,30}") 
  @Schema(name = "firstName", example = "Ivan", description = "Имя клиента", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public LoanStatementRequestDTO lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Фамилия клиента
   * @return lastName
  */
  @NotNull @Pattern(regexp = "[A-Za-z\\-]{2,30}") 
  @Schema(name = "lastName", example = "Ivanov", description = "Фамилия клиента", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public LoanStatementRequestDTO middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Отчество клиента
   * @return middleName
  */
  @NotNull @Pattern(regexp = "[A-Za-z]{2,30}") 
  @Schema(name = "middleName", example = "Ivanovich", description = "Отчество клиента", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public LoanStatementRequestDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Электронная почта клиента.
   * @return email
  */
  @NotNull @Pattern(regexp = "^[a-zA-Z0-9_!#$%&*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$") 
  @Schema(name = "email", example = "iivanov@email.ru", description = "Электронная почта клиента.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LoanStatementRequestDTO birthdate(LocalDate birthdate) {
    this.birthdate = birthdate;
    return this;
  }

  /**
   * дата рождения клиента
   * @return birthdate
  */
  @Valid 
  @Schema(name = "birthdate", example = "Tue Feb 18 03:00:00 GMT+04:00 1997", description = "дата рождения клиента", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("birthdate")
  public LocalDate getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(LocalDate birthdate) {
    this.birthdate = birthdate;
  }

  public LoanStatementRequestDTO passportSeries(String passportSeries) {
    this.passportSeries = passportSeries;
    return this;
  }

  /**
   * Серия паспорта клиента
   * @return passportSeries
  */
  @NotNull @Pattern(regexp = "[0-9]{4}") 
  @Schema(name = "passportSeries", example = "1234", description = "Серия паспорта клиента", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("passportSeries")
  public String getPassportSeries() {
    return passportSeries;
  }

  public void setPassportSeries(String passportSeries) {
    this.passportSeries = passportSeries;
  }

  public LoanStatementRequestDTO passportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
    return this;
  }

  /**
   * Номер паспорта клиента
   * @return passportNumber
  */
  @NotNull @Pattern(regexp = "[0-9]{6}") 
  @Schema(name = "passportNumber", example = "123456", description = "Номер паспорта клиента", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("passportNumber")
  public String getPassportNumber() {
    return passportNumber;
  }

  public void setPassportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanStatementRequestDTO loanStatementRequestDTO = (LoanStatementRequestDTO) o;
    return Objects.equals(this.amount, loanStatementRequestDTO.amount) &&
        Objects.equals(this.term, loanStatementRequestDTO.term) &&
        Objects.equals(this.firstName, loanStatementRequestDTO.firstName) &&
        Objects.equals(this.lastName, loanStatementRequestDTO.lastName) &&
        Objects.equals(this.middleName, loanStatementRequestDTO.middleName) &&
        Objects.equals(this.email, loanStatementRequestDTO.email) &&
        Objects.equals(this.birthdate, loanStatementRequestDTO.birthdate) &&
        Objects.equals(this.passportSeries, loanStatementRequestDTO.passportSeries) &&
        Objects.equals(this.passportNumber, loanStatementRequestDTO.passportNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, term, firstName, lastName, middleName, email, birthdate, passportSeries, passportNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanStatementRequestDTO {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
    sb.append("    passportSeries: ").append(toIndentedString(passportSeries)).append("\n");
    sb.append("    passportNumber: ").append(toIndentedString(passportNumber)).append("\n");
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

