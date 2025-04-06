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
 * Элемент графика платежей.
 */

@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder(toBuilder = true)
@lombok.Data

@Schema(name = "PaymentScheduleElementDTO", description = "Элемент графика платежей.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-20T01:26:53.519840700+04:00[Europe/Saratov]")
public class PaymentScheduleElementDTO {

  private Integer number;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate date;

  private java.math.BigDecimal totalPayment;

  private java.math.BigDecimal interestPayment;

  private java.math.BigDecimal debtPayment;

  private java.math.BigDecimal remainingDebt;

  public PaymentScheduleElementDTO number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Порядковый номер платежа.
   * @return number
  */
  
  @Schema(name = "number", example = "1", description = "Порядковый номер платежа.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public PaymentScheduleElementDTO date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Дата платежа.
   * @return date
  */
  @Valid 
  @Schema(name = "date", example = "Wed Jun 01 04:00:00 GMT+04:00 2022", description = "Дата платежа.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public PaymentScheduleElementDTO totalPayment(java.math.BigDecimal totalPayment) {
    this.totalPayment = totalPayment;
    return this;
  }

  /**
   * Общая сумма платежа.
   * @return totalPayment
  */
  @Valid 
  @Schema(name = "totalPayment", example = "12000.0", description = "Общая сумма платежа.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalPayment")
  public java.math.BigDecimal getTotalPayment() {
    return totalPayment;
  }

  public void setTotalPayment(java.math.BigDecimal totalPayment) {
    this.totalPayment = totalPayment;
  }

  public PaymentScheduleElementDTO interestPayment(java.math.BigDecimal interestPayment) {
    this.interestPayment = interestPayment;
    return this;
  }

  /**
   * Сумма выплаты процентов.
   * @return interestPayment
  */
  @Valid 
  @Schema(name = "interestPayment", example = "12000.0", description = "Сумма выплаты процентов.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("interestPayment")
  public java.math.BigDecimal getInterestPayment() {
    return interestPayment;
  }

  public void setInterestPayment(java.math.BigDecimal interestPayment) {
    this.interestPayment = interestPayment;
  }

  public PaymentScheduleElementDTO debtPayment(java.math.BigDecimal debtPayment) {
    this.debtPayment = debtPayment;
    return this;
  }

  /**
   * Сумма выплаты по основному долгу.
   * @return debtPayment
  */
  @Valid 
  @Schema(name = "debtPayment", example = "5000.0", description = "Сумма выплаты по основному долгу.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("debtPayment")
  public java.math.BigDecimal getDebtPayment() {
    return debtPayment;
  }

  public void setDebtPayment(java.math.BigDecimal debtPayment) {
    this.debtPayment = debtPayment;
  }

  public PaymentScheduleElementDTO remainingDebt(java.math.BigDecimal remainingDebt) {
    this.remainingDebt = remainingDebt;
    return this;
  }

  /**
   * Оставшаяся сумма долга.
   * @return remainingDebt
  */
  @Valid 
  @Schema(name = "remainingDebt", example = "95000.0", description = "Оставшаяся сумма долга.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("remainingDebt")
  public java.math.BigDecimal getRemainingDebt() {
    return remainingDebt;
  }

  public void setRemainingDebt(java.math.BigDecimal remainingDebt) {
    this.remainingDebt = remainingDebt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentScheduleElementDTO paymentScheduleElementDTO = (PaymentScheduleElementDTO) o;
    return Objects.equals(this.number, paymentScheduleElementDTO.number) &&
        Objects.equals(this.date, paymentScheduleElementDTO.date) &&
        Objects.equals(this.totalPayment, paymentScheduleElementDTO.totalPayment) &&
        Objects.equals(this.interestPayment, paymentScheduleElementDTO.interestPayment) &&
        Objects.equals(this.debtPayment, paymentScheduleElementDTO.debtPayment) &&
        Objects.equals(this.remainingDebt, paymentScheduleElementDTO.remainingDebt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, date, totalPayment, interestPayment, debtPayment, remainingDebt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentScheduleElementDTO {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    totalPayment: ").append(toIndentedString(totalPayment)).append("\n");
    sb.append("    interestPayment: ").append(toIndentedString(interestPayment)).append("\n");
    sb.append("    debtPayment: ").append(toIndentedString(debtPayment)).append("\n");
    sb.append("    remainingDebt: ").append(toIndentedString(remainingDebt)).append("\n");
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

