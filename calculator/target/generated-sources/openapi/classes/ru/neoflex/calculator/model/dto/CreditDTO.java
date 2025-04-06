package ru.neoflex.calculator.model.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ru.neoflex.calculator.model.dto.PaymentScheduleElementDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Информация о кредите
 */

@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder(toBuilder = true)
@lombok.Data

@Schema(name = "CreditDTO", description = "Информация о кредите")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-20T01:26:53.519840700+04:00[Europe/Saratov]")
public class CreditDTO {

  private java.math.BigDecimal amount;

  private Integer term;

  private java.math.BigDecimal monthlyPayment;

  private java.math.BigDecimal rate;

  private java.math.BigDecimal psk;

  private Boolean isInsuranceEnabled;

  private Boolean isSalaryClient;

  @Valid
  private List<@Valid PaymentScheduleElementDTO> paymentSchedule;

  public CreditDTO amount(java.math.BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Запрашиваемая сумма кредита.
   * @return amount
  */
  @Valid 
  @Schema(name = "amount", example = "1000000.0", description = "Запрашиваемая сумма кредита.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amount")
  public java.math.BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(java.math.BigDecimal amount) {
    this.amount = amount;
  }

  public CreditDTO term(Integer term) {
    this.term = term;
    return this;
  }

  /**
   * Запрашиваемый срок кредитования (месяцы).
   * @return term
  */
  
  @Schema(name = "term", example = "24", description = "Запрашиваемый срок кредитования (месяцы).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("term")
  public Integer getTerm() {
    return term;
  }

  public void setTerm(Integer term) {
    this.term = term;
  }

  public CreditDTO monthlyPayment(java.math.BigDecimal monthlyPayment) {
    this.monthlyPayment = monthlyPayment;
    return this;
  }

  /**
   * Ежемесячный платеж.
   * @return monthlyPayment
  */
  @Valid 
  @Schema(name = "monthlyPayment", example = "10000.1", description = "Ежемесячный платеж.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("monthlyPayment")
  public java.math.BigDecimal getMonthlyPayment() {
    return monthlyPayment;
  }

  public void setMonthlyPayment(java.math.BigDecimal monthlyPayment) {
    this.monthlyPayment = monthlyPayment;
  }

  public CreditDTO rate(java.math.BigDecimal rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Ставка по кредиту
   * @return rate
  */
  @Valid 
  @Schema(name = "rate", example = "12.5", description = "Ставка по кредиту", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rate")
  public java.math.BigDecimal getRate() {
    return rate;
  }

  public void setRate(java.math.BigDecimal rate) {
    this.rate = rate;
  }

  public CreditDTO psk(java.math.BigDecimal psk) {
    this.psk = psk;
    return this;
  }

  /**
   * Полная стоимость кредита
   * @return psk
  */
  @Valid 
  @Schema(name = "psk", example = "12.5", description = "Полная стоимость кредита", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("psk")
  public java.math.BigDecimal getPsk() {
    return psk;
  }

  public void setPsk(java.math.BigDecimal psk) {
    this.psk = psk;
  }

  public CreditDTO isInsuranceEnabled(Boolean isInsuranceEnabled) {
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

  public CreditDTO isSalaryClient(Boolean isSalaryClient) {
    this.isSalaryClient = isSalaryClient;
    return this;
  }

  /**
   * Является зарплатным клиентом
   * @return isSalaryClient
  */
  
  @Schema(name = "isSalaryClient", example = "true", description = "Является зарплатным клиентом", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isSalaryClient")
  public Boolean getIsSalaryClient() {
    return isSalaryClient;
  }

  public void setIsSalaryClient(Boolean isSalaryClient) {
    this.isSalaryClient = isSalaryClient;
  }

  public CreditDTO paymentSchedule(List<@Valid PaymentScheduleElementDTO> paymentSchedule) {
    this.paymentSchedule = paymentSchedule;
    return this;
  }

  public CreditDTO addPaymentScheduleItem(PaymentScheduleElementDTO paymentScheduleItem) {
    if (this.paymentSchedule == null) {
      this.paymentSchedule = new ArrayList<>();
    }
    this.paymentSchedule.add(paymentScheduleItem);
    return this;
  }

  /**
   * График платежей
   * @return paymentSchedule
  */
  @Valid 
  @Schema(name = "paymentSchedule", description = "График платежей", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentSchedule")
  public List<@Valid PaymentScheduleElementDTO> getPaymentSchedule() {
    return paymentSchedule;
  }

  public void setPaymentSchedule(List<@Valid PaymentScheduleElementDTO> paymentSchedule) {
    this.paymentSchedule = paymentSchedule;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditDTO creditDTO = (CreditDTO) o;
    return Objects.equals(this.amount, creditDTO.amount) &&
        Objects.equals(this.term, creditDTO.term) &&
        Objects.equals(this.monthlyPayment, creditDTO.monthlyPayment) &&
        Objects.equals(this.rate, creditDTO.rate) &&
        Objects.equals(this.psk, creditDTO.psk) &&
        Objects.equals(this.isInsuranceEnabled, creditDTO.isInsuranceEnabled) &&
        Objects.equals(this.isSalaryClient, creditDTO.isSalaryClient) &&
        Objects.equals(this.paymentSchedule, creditDTO.paymentSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, term, monthlyPayment, rate, psk, isInsuranceEnabled, isSalaryClient, paymentSchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditDTO {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    monthlyPayment: ").append(toIndentedString(monthlyPayment)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    psk: ").append(toIndentedString(psk)).append("\n");
    sb.append("    isInsuranceEnabled: ").append(toIndentedString(isInsuranceEnabled)).append("\n");
    sb.append("    isSalaryClient: ").append(toIndentedString(isSalaryClient)).append("\n");
    sb.append("    paymentSchedule: ").append(toIndentedString(paymentSchedule)).append("\n");
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

