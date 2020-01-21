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
 * An object containing the multiplication factors to be used when calculating energy from macronutrients for a specific food.
 */
@Schema(description = "An object containing the multiplication factors to be used when calculating energy from macronutrients for a specific food.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-01-21T14:14:30.629Z[GMT]")public class BrandedFoodObjectCalorieConversionFactor   {
  @JsonProperty("protein_value")
  private BigDecimal proteinValue = null;

  @JsonProperty("fat_value")
  private BigDecimal fatValue = null;

  @JsonProperty("carbohydrate_value")
  private BigDecimal carbohydrateValue = null;

  public BrandedFoodObjectCalorieConversionFactor proteinValue(BigDecimal proteinValue) {
    this.proteinValue = proteinValue;
    return this;
  }

  /**
   * The multiplication factor for protein
   * @return proteinValue
   **/
  @JsonProperty("protein_value")
  @Schema(description = "The multiplication factor for protein")
  public BigDecimal getProteinValue() {
    return proteinValue;
  }

  public void setProteinValue(BigDecimal proteinValue) {
    this.proteinValue = proteinValue;
  }

  public BrandedFoodObjectCalorieConversionFactor fatValue(BigDecimal fatValue) {
    this.fatValue = fatValue;
    return this;
  }

  /**
   * The multiplication factor for fat
   * @return fatValue
   **/
  @JsonProperty("fat_value")
  @Schema(description = "The multiplication factor for fat")
  public BigDecimal getFatValue() {
    return fatValue;
  }

  public void setFatValue(BigDecimal fatValue) {
    this.fatValue = fatValue;
  }

  public BrandedFoodObjectCalorieConversionFactor carbohydrateValue(BigDecimal carbohydrateValue) {
    this.carbohydrateValue = carbohydrateValue;
    return this;
  }

  /**
   * The multiplication factor for carbohydrates
   * @return carbohydrateValue
   **/
  @JsonProperty("carbohydrate_value")
  @Schema(description = "The multiplication factor for carbohydrates")
  public BigDecimal getCarbohydrateValue() {
    return carbohydrateValue;
  }

  public void setCarbohydrateValue(BigDecimal carbohydrateValue) {
    this.carbohydrateValue = carbohydrateValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectCalorieConversionFactor brandedFoodObjectCalorieConversionFactor = (BrandedFoodObjectCalorieConversionFactor) o;
    return Objects.equals(this.proteinValue, brandedFoodObjectCalorieConversionFactor.proteinValue) &&
        Objects.equals(this.fatValue, brandedFoodObjectCalorieConversionFactor.fatValue) &&
        Objects.equals(this.carbohydrateValue, brandedFoodObjectCalorieConversionFactor.carbohydrateValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proteinValue, fatValue, carbohydrateValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectCalorieConversionFactor {\n");
    
    sb.append("    proteinValue: ").append(toIndentedString(proteinValue)).append("\n");
    sb.append("    fatValue: ").append(toIndentedString(fatValue)).append("\n");
    sb.append("    carbohydrateValue: ").append(toIndentedString(carbohydrateValue)).append("\n");
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
