/*
 * Chomp Food Database API Documentation
 * ## Important An **[API key](https://chompthis.com/api/)** is required for access to this API. Get yours at **[https://chompthis.com/api](https://chompthis.com/api/)**.  ### Getting Started   * **[Subscribe](https://chompthis.com/api/#pricing)** to the API.   * Scroll down and click the \"**Authorize**\" button.   * Enter your API key into the \"**value**\" input, click the \"**Authorize**\" button, then click the \"**Close**\" button.   * Scroll down to the section titled \"**default**\" and click on the API endpoint you wish to use.   * Click the \"**Try it out**\" button.   * Enter the information the endpoint requires.   * Click the \"**Execute**\" button.  ### Example    * Branded food response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/branded-food-response-object.json)**   * Ingredient response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/ingredient-response-object.json)**   * Error response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/error-response-object.json)**  ### How Do I Find My API Key?   * Your API key was sent to the email address you used to create your subscription.   * You will also find your API key in the **[Client Center](https://chompthis.com/api/manage.php)**.   * Read **[this article](https://desk.zoho.com/portal/chompthis/kb/articles/how-do-i-find-my-api-key)** for more information.  ### Helpful Links   * **Help & Support**     * [Knowledge Base &raquo;](https://desk.zoho.com/portal/chompthis/kb/chomp)     * [Support &raquo;](https://chompthis.com/api/ticket-new.php)     * [Client Center &raquo;](https://chompthis.com/api/manage.php)   * **Pricing**     * [Subscription Options &raquo;](https://chompthis.com/api/)     * [Cost Calculator &raquo;](https://chompthis.com/api/cost-calculator.php)   * **Guidelines**     * [Terms & License &raquo;](https://chompthis.com/api/terms.php)     * [Attribution &raquo;](https://chompthis.com/api/docs/attribution.php) 
 *
 * OpenAPI spec version: 1.0.0-oas3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import javax.validation.constraints.*;

/**
 * An object containing information on a specific food portion found in this item
 */
@Schema(description = "An object containing information on a specific food portion found in this item")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-01-25T22:35:03.310Z[GMT]")public class IngredientObjectPortions   {
  @JsonProperty("measurement_unit")
  private String measurementUnit = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("modifier")
  private String modifier = null;

  @JsonProperty("gram_weight")
  private BigDecimal gramWeight = null;

  @JsonProperty("data_points")
  private Integer dataPoints = null;

  @JsonProperty("footnote")
  private String footnote = null;

  public IngredientObjectPortions measurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
    return this;
  }

  /**
   * The unit used for measure (e.g. if mesure is 3 tsp, the unit is tsp)
   * @return measurementUnit
   **/
  @JsonProperty("measurement_unit")
  @Schema(description = "The unit used for measure (e.g. if mesure is 3 tsp, the unit is tsp)")
  public String getMeasurementUnit() {
    return measurementUnit;
  }

  public void setMeasurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
  }

  public IngredientObjectPortions description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Comments that provide more specificity on the measure. For example, for a pizza measure the dissemination text might be 1 slice is 1/8th of a 14 inch pizza.
   * @return description
   **/
  @JsonProperty("description")
  @Schema(description = "Comments that provide more specificity on the measure. For example, for a pizza measure the dissemination text might be 1 slice is 1/8th of a 14 inch pizza.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IngredientObjectPortions modifier(String modifier) {
    this.modifier = modifier;
    return this;
  }

  /**
   * Qualifier of the measure (e.g. related to food shape or form) (e.g. melted, crushed, diced)
   * @return modifier
   **/
  @JsonProperty("modifier")
  @Schema(description = "Qualifier of the measure (e.g. related to food shape or form) (e.g. melted, crushed, diced)")
  public String getModifier() {
    return modifier;
  }

  public void setModifier(String modifier) {
    this.modifier = modifier;
  }

  public IngredientObjectPortions gramWeight(BigDecimal gramWeight) {
    this.gramWeight = gramWeight;
    return this;
  }

  /**
   * The weight of the measure in grams
   * @return gramWeight
   **/
  @JsonProperty("gram_weight")
  @Schema(description = "The weight of the measure in grams")
  public BigDecimal getGramWeight() {
    return gramWeight;
  }

  public void setGramWeight(BigDecimal gramWeight) {
    this.gramWeight = gramWeight;
  }

  public IngredientObjectPortions dataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
    return this;
  }

  /**
   * The number of observations on which the measure is based
   * @return dataPoints
   **/
  @JsonProperty("data_points")
  @Schema(description = "The number of observations on which the measure is based")
  public Integer getDataPoints() {
    return dataPoints;
  }

  public void setDataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
  }

  public IngredientObjectPortions footnote(String footnote) {
    this.footnote = footnote;
    return this;
  }

  /**
   * Comments on any unusual aspects of the measure. Examples might includes caveats on the usage of a measure, or reasons why a measure gram weight is an unexpected value.
   * @return footnote
   **/
  @JsonProperty("footnote")
  @Schema(description = "Comments on any unusual aspects of the measure. Examples might includes caveats on the usage of a measure, or reasons why a measure gram weight is an unexpected value.")
  public String getFootnote() {
    return footnote;
  }

  public void setFootnote(String footnote) {
    this.footnote = footnote;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngredientObjectPortions ingredientObjectPortions = (IngredientObjectPortions) o;
    return Objects.equals(this.measurementUnit, ingredientObjectPortions.measurementUnit) &&
        Objects.equals(this.description, ingredientObjectPortions.description) &&
        Objects.equals(this.modifier, ingredientObjectPortions.modifier) &&
        Objects.equals(this.gramWeight, ingredientObjectPortions.gramWeight) &&
        Objects.equals(this.dataPoints, ingredientObjectPortions.dataPoints) &&
        Objects.equals(this.footnote, ingredientObjectPortions.footnote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measurementUnit, description, modifier, gramWeight, dataPoints, footnote);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientObjectPortions {\n");
    
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
    sb.append("    gramWeight: ").append(toIndentedString(gramWeight)).append("\n");
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
    sb.append("    footnote: ").append(toIndentedString(footnote)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
