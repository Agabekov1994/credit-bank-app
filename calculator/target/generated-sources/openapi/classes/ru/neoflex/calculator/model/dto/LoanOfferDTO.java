package ru.neoflex.calculator.model.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Кредитное предложение после скоринга.
 */

@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder(toBuilder = true)
@lombok.Data

@Schema(name = "LoanOfferDTO", description = "Кредитное предложение после скоринга.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-20T01:26:53.519840700+04:00[Europe/Saratov]")
public class LoanOfferDTO {

  private UUID statementId;

  private java.math.BigDecimal requestedAmount;

  private java.math.BigDecimal totalAmount;

  private Integer term;

  private java.math.BigDecimal monthlyPayment;

  private java.math.BigDecimal rate;

  private Boolean isInsuranceEnabled;

  private Boolean isSalaryClient;

  public LoanOfferDTO statementId(UUID statementId) {
    this.statementId = statementId;
    return this;
  }

  /**
   * идентификатор заявления.
   * @return statementId
  */
  @NotNull @Valid @Pattern(regexp = "^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$") 
  @Schema(name = "statementId", example = "3422b448-2460-4fd2-9183-8000de6f8343", description = "идентификатор заявления.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("statementId")
  public UUID getStatementId() {
    return statementId;
  }

  public void setStatementId(UUID statementId) {
    this.statementId = statementId;
  }

  public LoanOfferDTO requestedAmount(java.math.BigDecimal requestedAmount) {
    this.requestedAmount = requestedAmount;
    return this;
  }

  /**
   * Запрашиваемая сумма кредита.
   * minimum: 30000.0
   * @return requestedAmount
  */
  @NotNull @Valid @DecimalMin("30000.0") 
  @Schema(name = "requestedAmount", example = "1000000.0", description = "Запрашиваемая сумма кредита.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("requestedAmount")
  public java.math.BigDecimal getRequestedAmount() {
    return requestedAmount;
  }

  public void setRequestedAmount(java.math.BigDecimal requestedAmount) {
    this.requestedAmount = requestedAmount;
  }

  public LoanOfferDTO totalAmount(java.math.BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Общая сумма кредита (с учетом услуг, страховки и т.д.).
   * minimum: 30000.0
   * @return totalAmount
  */
  @NotNull @Valid @DecimalMin("30000.0") 
  @Schema(name = "totalAmount", example = "1000000.0", description = "Общая сумма кредита (с учетом услуг, страховки и т.д.).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalAmount")
  public java.math.BigDecimal getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(java.math.BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
  }

  public LoanOfferDTO term(Integer term) {
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

  public LoanOfferDTO monthlyPayment(java.math.BigDecimal monthlyPayment) {
    this.monthlyPayment = monthlyPayment;
    return this;
  }

  /**
   * Ежемесячный платеж.
   * @return monthlyPayment
  */
  @NotNull @Valid 
  @Schema(name = "monthlyPayment", example = "10000.1", description = "Ежемесячный платеж.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("monthlyPayment")
  public java.math.BigDecimal getMonthlyPayment() {
    return monthlyPayment;
  }

  public void setMonthlyPayment(java.math.BigDecimal monthlyPayment) {
    this.monthlyPayment = monthlyPayment;
  }

  public LoanOfferDTO rate(java.math.BigDecimal rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Ставка по кредиту
   * @return rate
  */
  @NotNull @Valid 
  @Schema(name = "rate", example = "12.5", description = "Ставка по кредиту", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rate")
  public java.math.BigDecimal getRate() {
    return rate;
  }

  public void setRate(java.math.BigDecimal rate) {
    this.rate = rate;
  }

  public LoanOfferDTO isInsuranceEnabled(Boolean isInsuranceEnabled) {
    this.isInsuranceEnabled = isInsuranceEnabled;
    return this;
  }

  /**
   * Включена ли страховка?
   * @return isInsuranceEnabled
  */
  @NotNull 
  @Schema(name = "isInsuranceEnabled", example = "true", description = "Включена ли страховка?", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isInsuranceEnabled")
  public Boolean getIsInsuranceEnabled() {
    return isInsuranceEnabled;
  }

  public void setIsInsuranceEnabled(Boolean isInsuranceEnabled) {
    this.isInsuranceEnabled = isInsuranceEnabled;
  }

  public LoanOfferDTO isSalaryClient(Boolean isSalaryClient) {
    this.isSalaryClient = isSalaryClient;
    return this;
  }

  /**
   * Является ли зарплатный клиент?
   * @return isSalaryClient
  */
  @NotNull 
  @Schema(name = "isSalaryClient", example = "true", description = "Является ли зарплатный клиент?", requiredMode = Schema.RequiredMode.REQUIRED)
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
    LoanOfferDTO loanOfferDTO = (LoanOfferDTO) o;
    return Objects.equals(this.statementId, loanOfferDTO.statementId) &&
        Objects.equals(this.requestedAmount, loanOfferDTO.requestedAmount) &&
        Objects.equals(this.totalAmount, loanOfferDTO.totalAmount) &&
        Objects.equals(this.term, loanOfferDTO.term) &&
        Objects.equals(this.monthlyPayment, loanOfferDTO.monthlyPayment) &&
        Objects.equals(this.rate, loanOfferDTO.rate) &&
        Objects.equals(this.isInsuranceEnabled, loanOfferDTO.isInsuranceEnabled) &&
        Objects.equals(this.isSalaryClient, loanOfferDTO.isSalaryClient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statementId, requestedAmount, totalAmount, term, monthlyPayment, rate, isInsuranceEnabled, isSalaryClient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanOfferDTO {\n");
    sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
    sb.append("    requestedAmount: ").append(toIndentedString(requestedAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    monthlyPayment: ").append(toIndentedString(monthlyPayment)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

