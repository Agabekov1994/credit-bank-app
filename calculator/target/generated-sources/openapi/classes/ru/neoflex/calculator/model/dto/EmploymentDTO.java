package ru.neoflex.calculator.model.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Информация о трудоустройстве клиента.
 */

@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder(toBuilder = true)
@lombok.Data

@Schema(name = "EmploymentDTO", description = "Информация о трудоустройстве клиента.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-20T01:26:53.519840700+04:00[Europe/Saratov]")
public class EmploymentDTO {

  /**
   * Статус занятости клиента.
   */
  public enum EmploymentStatusEnum {
    UNEMPLOYED("UNEMPLOYED"),
    
    SELF_EMPLOYED("SELF_EMPLOYED"),
    
    EMPLOYED("EMPLOYED"),
    
    BUSINESS_OWNER("BUSINESS_OWNER");

    private String value;

    EmploymentStatusEnum(String value) {
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
    public static EmploymentStatusEnum fromValue(String value) {
      for (EmploymentStatusEnum b : EmploymentStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private EmploymentStatusEnum employmentStatus;

  private String employerINN;

  private java.math.BigDecimal salary;

  /**
   * Должность клиента по найму.
   */
  public enum PositionEnum {
    WORKER("WORKER"),
    
    MID_MANAGER("MID_MANAGER"),
    
    TOP_MANAGER("TOP_MANAGER"),
    
    OWNER("OWNER");

    private String value;

    PositionEnum(String value) {
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
    public static PositionEnum fromValue(String value) {
      for (PositionEnum b : PositionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PositionEnum position;

  private Integer workExperienceTotal;

  private Integer workExperienceCurrent;

  public EmploymentDTO employmentStatus(EmploymentStatusEnum employmentStatus) {
    this.employmentStatus = employmentStatus;
    return this;
  }

  /**
   * Статус занятости клиента.
   * @return employmentStatus
  */
  @NotNull 
  @Schema(name = "employmentStatus", example = "EMPLOYED", description = "Статус занятости клиента.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("employmentStatus")
  public EmploymentStatusEnum getEmploymentStatus() {
    return employmentStatus;
  }

  public void setEmploymentStatus(EmploymentStatusEnum employmentStatus) {
    this.employmentStatus = employmentStatus;
  }

  public EmploymentDTO employerINN(String employerINN) {
    this.employerINN = employerINN;
    return this;
  }

  /**
   * ИНН работодателя клиента.
   * @return employerINN
  */
  @NotNull @Pattern(regexp = "[0-9]{12}") 
  @Schema(name = "employerINN", example = "123456789012", description = "ИНН работодателя клиента.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("employerINN")
  public String getEmployerINN() {
    return employerINN;
  }

  public void setEmployerINN(String employerINN) {
    this.employerINN = employerINN;
  }

  public EmploymentDTO salary(java.math.BigDecimal salary) {
    this.salary = salary;
    return this;
  }

  /**
   * Зарплата клиента.
   * @return salary
  */
  @NotNull @Valid 
  @Schema(name = "salary", example = "100000.0", description = "Зарплата клиента.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("salary")
  public java.math.BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(java.math.BigDecimal salary) {
    this.salary = salary;
  }

  public EmploymentDTO position(PositionEnum position) {
    this.position = position;
    return this;
  }

  /**
   * Должность клиента по найму.
   * @return position
  */
  @NotNull 
  @Schema(name = "position", example = "WORKER", description = "Должность клиента по найму.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("position")
  public PositionEnum getPosition() {
    return position;
  }

  public void setPosition(PositionEnum position) {
    this.position = position;
  }

  public EmploymentDTO workExperienceTotal(Integer workExperienceTotal) {
    this.workExperienceTotal = workExperienceTotal;
    return this;
  }

  /**
   * Общий стаж работы клиента.
   * @return workExperienceTotal
  */
  @NotNull 
  @Schema(name = "workExperienceTotal", example = "5", description = "Общий стаж работы клиента.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("workExperienceTotal")
  public Integer getWorkExperienceTotal() {
    return workExperienceTotal;
  }

  public void setWorkExperienceTotal(Integer workExperienceTotal) {
    this.workExperienceTotal = workExperienceTotal;
  }

  public EmploymentDTO workExperienceCurrent(Integer workExperienceCurrent) {
    this.workExperienceCurrent = workExperienceCurrent;
    return this;
  }

  /**
   * Опыт работы клиента на текущей работе.
   * @return workExperienceCurrent
  */
  @NotNull 
  @Schema(name = "workExperienceCurrent", example = "2", description = "Опыт работы клиента на текущей работе.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("workExperienceCurrent")
  public Integer getWorkExperienceCurrent() {
    return workExperienceCurrent;
  }

  public void setWorkExperienceCurrent(Integer workExperienceCurrent) {
    this.workExperienceCurrent = workExperienceCurrent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmploymentDTO employmentDTO = (EmploymentDTO) o;
    return Objects.equals(this.employmentStatus, employmentDTO.employmentStatus) &&
        Objects.equals(this.employerINN, employmentDTO.employerINN) &&
        Objects.equals(this.salary, employmentDTO.salary) &&
        Objects.equals(this.position, employmentDTO.position) &&
        Objects.equals(this.workExperienceTotal, employmentDTO.workExperienceTotal) &&
        Objects.equals(this.workExperienceCurrent, employmentDTO.workExperienceCurrent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employmentStatus, employerINN, salary, position, workExperienceTotal, workExperienceCurrent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmploymentDTO {\n");
    sb.append("    employmentStatus: ").append(toIndentedString(employmentStatus)).append("\n");
    sb.append("    employerINN: ").append(toIndentedString(employerINN)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    workExperienceTotal: ").append(toIndentedString(workExperienceTotal)).append("\n");
    sb.append("    workExperienceCurrent: ").append(toIndentedString(workExperienceCurrent)).append("\n");
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

