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
 * An object containing information for a specific nutrient found in this food item
 */
@Schema(description = "An object containing information for a specific nutrient found in this food item")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-01-28T13:53:56.487Z[GMT]")public class BrandedFoodObjectNutrients   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("per_100g")
  private BigDecimal per100g = null;

  @JsonProperty("measurement_unit")
  private String measurementUnit = null;

  @JsonProperty("rank")
  private Integer rank = null;

  @JsonProperty("data_points")
  private Integer dataPoints = null;

  @JsonProperty("description")
  private String description = null;

  public BrandedFoodObjectNutrients name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nutrient name
   * @return name
   **/
  @JsonProperty("name")
  @Schema(description = "Nutrient name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BrandedFoodObjectNutrients per100g(BigDecimal per100g) {
    this.per100g = per100g;
    return this;
  }

  /**
   * Amount of the nutrient per 100g of food
   * @return per100g
   **/
  @JsonProperty("per_100g")
  @Schema(description = "Amount of the nutrient per 100g of food")
  public BigDecimal getPer100g() {
    return per100g;
  }

  public void setPer100g(BigDecimal per100g) {
    this.per100g = per100g;
  }

  public BrandedFoodObjectNutrients measurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
    return this;
  }

  /**
   * The unit used for the measure of this nutrient
   * @return measurementUnit
   **/
  @JsonProperty("measurement_unit")
  @Schema(description = "The unit used for the measure of this nutrient")
  public String getMeasurementUnit() {
    return measurementUnit;
  }

  public void setMeasurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
  }

  public BrandedFoodObjectNutrients rank(Integer rank) {
    this.rank = rank;
    return this;
  }

  /**
   * Nutrient rank
   * @return rank
   **/
  @JsonProperty("rank")
  @Schema(description = "Nutrient rank")
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }

  public BrandedFoodObjectNutrients dataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
    return this;
  }

  /**
   * Number of observations on which the value is based
   * @return dataPoints
   **/
  @JsonProperty("data_points")
  @Schema(description = "Number of observations on which the value is based")
  public Integer getDataPoints() {
    return dataPoints;
  }

  public void setDataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
  }

  public BrandedFoodObjectNutrients description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the nutrient source
   * @return description
   **/
  @JsonProperty("description")
  @Schema(description = "Description of the nutrient source")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectNutrients brandedFoodObjectNutrients = (BrandedFoodObjectNutrients) o;
    return Objects.equals(this.name, brandedFoodObjectNutrients.name) &&
        Objects.equals(this.per100g, brandedFoodObjectNutrients.per100g) &&
        Objects.equals(this.measurementUnit, brandedFoodObjectNutrients.measurementUnit) &&
        Objects.equals(this.rank, brandedFoodObjectNutrients.rank) &&
        Objects.equals(this.dataPoints, brandedFoodObjectNutrients.dataPoints) &&
        Objects.equals(this.description, brandedFoodObjectNutrients.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, per100g, measurementUnit, rank, dataPoints, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectNutrients {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    per100g: ").append(toIndentedString(per100g)).append("\n");
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
