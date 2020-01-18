/*
 * Chomp Food Database API Documentation
 * __Important:__   - An __[API key](https://chompthis.com/api/)__ is required for access to this API.   - Get yours at __[https://chompthis.com/api](https://chompthis.com/api/)__.  -----  __Getting Started:__   - __[Subscribe](https://chompthis.com/api/#pricing)__ to the API.   - Scroll down and click the \"__Authorize__\" button.   - Enter your API key into the \"__value__\" input, click the \"__Authorize__\" button, then click the \"__Close__\" button.   - Scroll down to the section titled \"__default__\" and click on the API endpoint you wish to use.   - Click the \"__Try it out__\" button.   - Enter the information the endpoint requires.   - Click the \"__Execute__\" button.  __Example:__    - __[View example](https://raw.githubusercontent.com/chompfoods/examples/master/response-object.json)__ API response object.  -----  __How Do I Find My API Key?__   - Your API key was sent to the email address you used to create your subscription.   - You will also find your API key in the __[Client Center](https://chompthis.com/api/manage.php)__.   - _Read __[this article](https://desk.zoho.com/portal/chompthis/kb/articles/how-do-i-find-my-api-key)__ for more information._  ||| | ------- | -------- | | [Knowledge Base](https://desk.zoho.com/portal/chompthis/kb/chomp) | [Pricing](https://chompthis.com/api/) | | [Attribution](https://chompthis.com/api/docs/attribution.php) | [Cost Calculator](https://chompthis.com/api/cost-calculator.php) | | [Terms & License](https://chompthis.com/api/terms.php) | [Database Search](https://chompthis.com/api/lookup.php) | | [Support](https://chompthis.com/api/ticket-new.php) | [Query Builder](https://chompthis.com/api/build.php) | | [Client Center](https://chompthis.com/api/manage.php) | | 
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
 * An object containing information on a specific component of this food item
 */
@Schema(description = "An object containing information on a specific component of this food item")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-01-18T16:48:43.301Z[GMT]")public class BrandedFoodObjectComponents   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("pct_weight")
  private BigDecimal pctWeight = null;

  @JsonProperty("gram_weight")
  private BigDecimal gramWeight = null;

  @JsonProperty("is_refuse")
  private Boolean isRefuse = null;

  @JsonProperty("data_points")
  private Integer dataPoints = null;

  public BrandedFoodObjectComponents name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The kind of component, e.g. bone
   * @return name
   **/
  @JsonProperty("name")
  @Schema(description = "The kind of component, e.g. bone")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BrandedFoodObjectComponents pctWeight(BigDecimal pctWeight) {
    this.pctWeight = pctWeight;
    return this;
  }

  /**
   * The weight of the component as a percentage of the total weight of the food
   * @return pctWeight
   **/
  @JsonProperty("pct_weight")
  @Schema(description = "The weight of the component as a percentage of the total weight of the food")
  public BigDecimal getPctWeight() {
    return pctWeight;
  }

  public void setPctWeight(BigDecimal pctWeight) {
    this.pctWeight = pctWeight;
  }

  public BrandedFoodObjectComponents gramWeight(BigDecimal gramWeight) {
    this.gramWeight = gramWeight;
    return this;
  }

  /**
   * The weight of the component in grams
   * @return gramWeight
   **/
  @JsonProperty("gram_weight")
  @Schema(description = "The weight of the component in grams")
  public BigDecimal getGramWeight() {
    return gramWeight;
  }

  public void setGramWeight(BigDecimal gramWeight) {
    this.gramWeight = gramWeight;
  }

  public BrandedFoodObjectComponents isRefuse(Boolean isRefuse) {
    this.isRefuse = isRefuse;
    return this;
  }

  /**
   * Whether the component is refuse, i.e. not edible
   * @return isRefuse
   **/
  @JsonProperty("is_refuse")
  @Schema(description = "Whether the component is refuse, i.e. not edible")
  public Boolean isIsRefuse() {
    return isRefuse;
  }

  public void setIsRefuse(Boolean isRefuse) {
    this.isRefuse = isRefuse;
  }

  public BrandedFoodObjectComponents dataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
    return this;
  }

  /**
   * The number of obersvations on which the measure is based
   * @return dataPoints
   **/
  @JsonProperty("data_points")
  @Schema(description = "The number of obersvations on which the measure is based")
  public Integer getDataPoints() {
    return dataPoints;
  }

  public void setDataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectComponents brandedFoodObjectComponents = (BrandedFoodObjectComponents) o;
    return Objects.equals(this.name, brandedFoodObjectComponents.name) &&
        Objects.equals(this.pctWeight, brandedFoodObjectComponents.pctWeight) &&
        Objects.equals(this.gramWeight, brandedFoodObjectComponents.gramWeight) &&
        Objects.equals(this.isRefuse, brandedFoodObjectComponents.isRefuse) &&
        Objects.equals(this.dataPoints, brandedFoodObjectComponents.dataPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pctWeight, gramWeight, isRefuse, dataPoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectComponents {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pctWeight: ").append(toIndentedString(pctWeight)).append("\n");
    sb.append("    gramWeight: ").append(toIndentedString(gramWeight)).append("\n");
    sb.append("    isRefuse: ").append(toIndentedString(isRefuse)).append("\n");
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
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
