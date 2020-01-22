/*
 * Chomp Food Database API Documentation
 * __Important:__   - An __[API key](https://chompthis.com/api/)__ is required for access to this API. Get yours at __[https://chompthis.com/api](https://chompthis.com/api/)__.  -----  __Getting Started:__   - __[Subscribe](https://chompthis.com/api/#pricing)__ to the API.   - Scroll down and click the \"__Authorize__\" button.   - Enter your API key into the \"__value__\" input, click the \"__Authorize__\" button, then click the \"__Close__\" button.   - Scroll down to the section titled \"__default__\" and click on the API endpoint you wish to use.   - Click the \"__Try it out__\" button.   - Enter the information the endpoint requires.   - Click the \"__Execute__\" button.  __Example:__    - Branded Food: __[View example](https://raw.githubusercontent.com/chompfoods/examples/master/branded-food-response-object.json)__ API response object.   - Ingredient: __[View example](https://raw.githubusercontent.com/chompfoods/examples/master/ingredient-response-object.json)__ API response object.  -----  __How Do I Find My API Key?__   - Your API key was sent to the email address you used to create your subscription.   - You will also find your API key in the __[Client Center](https://chompthis.com/api/manage.php)__.   - _Read __[this article](https://desk.zoho.com/portal/chompthis/kb/articles/how-do-i-find-my-api-key)__ for more information._  ||| | ------- | -------- | | [Knowledge Base](https://desk.zoho.com/portal/chompthis/kb/chomp) | [Pricing](https://chompthis.com/api/) | | [Attribution](https://chompthis.com/api/docs/attribution.php) | [Cost Calculator](https://chompthis.com/api/cost-calculator.php) | | [Terms & License](https://chompthis.com/api/terms.php) | [Database Search](https://chompthis.com/api/lookup.php) | | [Support](https://chompthis.com/api/ticket-new.php) | [Query Builder](https://chompthis.com/api/build.php) | | [Client Center](https://chompthis.com/api/manage.php) | | 
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
import javax.validation.constraints.*;

/**
 * Serving information from the USDA
 */
@Schema(description = "Serving information from the USDA")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-01-22T15:36:20.619Z[GMT]")public class BrandedFoodObjectServingUsda   {
  @JsonProperty("size")
  private String size = null;

  @JsonProperty("measurement_unit")
  private String measurementUnit = null;

  @JsonProperty("size_fulltext")
  private String sizeFulltext = null;

  public BrandedFoodObjectServingUsda size(String size) {
    this.size = size;
    return this;
  }

  /**
   * Serving size
   * @return size
   **/
  @JsonProperty("size")
  @Schema(description = "Serving size")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public BrandedFoodObjectServingUsda measurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
    return this;
  }

  /**
   * Measurement unit for each serving (e.g. if measure is 3 tsp, the unit is tsp)
   * @return measurementUnit
   **/
  @JsonProperty("measurement_unit")
  @Schema(description = "Measurement unit for each serving (e.g. if measure is 3 tsp, the unit is tsp)")
  public String getMeasurementUnit() {
    return measurementUnit;
  }

  public void setMeasurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
  }

  public BrandedFoodObjectServingUsda sizeFulltext(String sizeFulltext) {
    this.sizeFulltext = sizeFulltext;
    return this;
  }

  /**
   * Serving size description
   * @return sizeFulltext
   **/
  @JsonProperty("size_fulltext")
  @Schema(description = "Serving size description")
  public String getSizeFulltext() {
    return sizeFulltext;
  }

  public void setSizeFulltext(String sizeFulltext) {
    this.sizeFulltext = sizeFulltext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectServingUsda brandedFoodObjectServingUsda = (BrandedFoodObjectServingUsda) o;
    return Objects.equals(this.size, brandedFoodObjectServingUsda.size) &&
        Objects.equals(this.measurementUnit, brandedFoodObjectServingUsda.measurementUnit) &&
        Objects.equals(this.sizeFulltext, brandedFoodObjectServingUsda.sizeFulltext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, measurementUnit, sizeFulltext);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectServingUsda {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    sizeFulltext: ").append(toIndentedString(sizeFulltext)).append("\n");
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
