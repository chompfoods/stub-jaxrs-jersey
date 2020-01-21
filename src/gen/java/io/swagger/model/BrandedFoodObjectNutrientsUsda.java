/*
 * Chomp Food Database API Documentation
 * __Important:__   - An __[API key](https://chompthis.com/api/)__ is required for access to this API.   - Get yours at __[https://chompthis.com/api](https://chompthis.com/api/)__.  -----  __Getting Started:__   - __[Subscribe](https://chompthis.com/api/#pricing)__ to the API.   - Scroll down and click the \"__Authorize__\" button.   - Enter your API key into the \"__value__\" input, click the \"__Authorize__\" button, then click the \"__Close__\" button.   - Scroll down to the section titled \"__default__\" and click on the API endpoint you wish to use.   - Click the \"__Try it out__\" button.   - Enter the information the endpoint requires.   - Click the \"__Execute__\" button.  __Example:__    - Branded Food: __[View example](https://raw.githubusercontent.com/chompfoods/examples/master/branded-food-response-object.json)__ API response object.   - Ingredient: __[View example](https://raw.githubusercontent.com/chompfoods/examples/master/ingredient-response-object.json)__ API response object.  -----  __How Do I Find My API Key?__   - Your API key was sent to the email address you used to create your subscription.   - You will also find your API key in the __[Client Center](https://chompthis.com/api/manage.php)__.   - _Read __[this article](https://desk.zoho.com/portal/chompthis/kb/articles/how-do-i-find-my-api-key)__ for more information._  ||| | ------- | -------- | | [Knowledge Base](https://desk.zoho.com/portal/chompthis/kb/chomp) | [Pricing](https://chompthis.com/api/) | | [Attribution](https://chompthis.com/api/docs/attribution.php) | [Cost Calculator](https://chompthis.com/api/cost-calculator.php) | | [Terms & License](https://chompthis.com/api/terms.php) | [Database Search](https://chompthis.com/api/lookup.php) | | [Support](https://chompthis.com/api/ticket-new.php) | [Query Builder](https://chompthis.com/api/build.php) | | [Client Center](https://chompthis.com/api/manage.php) | | 
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
 * BrandedFoodObjectNutrientsUsda
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-01-21T23:19:12.763Z[GMT]")public class BrandedFoodObjectNutrientsUsda   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("per_100g")
  private BigDecimal per100g = null;

  @JsonProperty("measurement_unit")
  private String measurementUnit = null;

  @JsonProperty("min")
  private BigDecimal min = null;

  @JsonProperty("max")
  private BigDecimal max = null;

  @JsonProperty("median")
  private BigDecimal median = null;

  @JsonProperty("rank")
  private Integer rank = null;

  @JsonProperty("data_points")
  private Integer dataPoints = null;

  @JsonProperty("footnote")
  private String footnote = null;

  @JsonProperty("description")
  private String description = null;

  public BrandedFoodObjectNutrientsUsda id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Nutrient ID
   * @return id
   **/
  @JsonProperty("id")
  @Schema(description = "Nutrient ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public BrandedFoodObjectNutrientsUsda name(String name) {
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

  public BrandedFoodObjectNutrientsUsda per100g(BigDecimal per100g) {
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

  public BrandedFoodObjectNutrientsUsda measurementUnit(String measurementUnit) {
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

  public BrandedFoodObjectNutrientsUsda min(BigDecimal min) {
    this.min = min;
    return this;
  }

  /**
   * Minimum nutrient value
   * @return min
   **/
  @JsonProperty("min")
  @Schema(description = "Minimum nutrient value")
  public BigDecimal getMin() {
    return min;
  }

  public void setMin(BigDecimal min) {
    this.min = min;
  }

  public BrandedFoodObjectNutrientsUsda max(BigDecimal max) {
    this.max = max;
    return this;
  }

  /**
   * Maximum nutrient value
   * @return max
   **/
  @JsonProperty("max")
  @Schema(description = "Maximum nutrient value")
  public BigDecimal getMax() {
    return max;
  }

  public void setMax(BigDecimal max) {
    this.max = max;
  }

  public BrandedFoodObjectNutrientsUsda median(BigDecimal median) {
    this.median = median;
    return this;
  }

  /**
   * Median nutrient value
   * @return median
   **/
  @JsonProperty("median")
  @Schema(description = "Median nutrient value")
  public BigDecimal getMedian() {
    return median;
  }

  public void setMedian(BigDecimal median) {
    this.median = median;
  }

  public BrandedFoodObjectNutrientsUsda rank(Integer rank) {
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

  public BrandedFoodObjectNutrientsUsda dataPoints(Integer dataPoints) {
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

  public BrandedFoodObjectNutrientsUsda footnote(String footnote) {
    this.footnote = footnote;
    return this;
  }

  /**
   * Comments on any unusual aspect of the food nutrient. Examples might include why a nutrient value is different than typically expected.
   * @return footnote
   **/
  @JsonProperty("footnote")
  @Schema(description = "Comments on any unusual aspect of the food nutrient. Examples might include why a nutrient value is different than typically expected.")
  public String getFootnote() {
    return footnote;
  }

  public void setFootnote(String footnote) {
    this.footnote = footnote;
  }

  public BrandedFoodObjectNutrientsUsda description(String description) {
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
    BrandedFoodObjectNutrientsUsda brandedFoodObjectNutrientsUsda = (BrandedFoodObjectNutrientsUsda) o;
    return Objects.equals(this.id, brandedFoodObjectNutrientsUsda.id) &&
        Objects.equals(this.name, brandedFoodObjectNutrientsUsda.name) &&
        Objects.equals(this.per100g, brandedFoodObjectNutrientsUsda.per100g) &&
        Objects.equals(this.measurementUnit, brandedFoodObjectNutrientsUsda.measurementUnit) &&
        Objects.equals(this.min, brandedFoodObjectNutrientsUsda.min) &&
        Objects.equals(this.max, brandedFoodObjectNutrientsUsda.max) &&
        Objects.equals(this.median, brandedFoodObjectNutrientsUsda.median) &&
        Objects.equals(this.rank, brandedFoodObjectNutrientsUsda.rank) &&
        Objects.equals(this.dataPoints, brandedFoodObjectNutrientsUsda.dataPoints) &&
        Objects.equals(this.footnote, brandedFoodObjectNutrientsUsda.footnote) &&
        Objects.equals(this.description, brandedFoodObjectNutrientsUsda.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, per100g, measurementUnit, min, max, median, rank, dataPoints, footnote, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectNutrientsUsda {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    per100g: ").append(toIndentedString(per100g)).append("\n");
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    median: ").append(toIndentedString(median)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
    sb.append("    footnote: ").append(toIndentedString(footnote)).append("\n");
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
