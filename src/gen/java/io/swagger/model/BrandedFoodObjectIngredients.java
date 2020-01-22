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
import javax.validation.constraints.*;

/**
 * An object containing this item&#x27;s ingredients in order of highest value to least
 */
@Schema(description = "An object containing this item's ingredients in order of highest value to least")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-01-22T12:55:44.028Z[GMT]")public class BrandedFoodObjectIngredients   {
  @JsonProperty("chomp")
  private String chomp = null;

  @JsonProperty("usda")
  private String usda = null;

  public BrandedFoodObjectIngredients chomp(String chomp) {
    this.chomp = chomp;
    return this;
  }

  /**
   * This item&#x27;s ingredients as seen on ChompThis.com
   * @return chomp
   **/
  @JsonProperty("chomp")
  @Schema(description = "This item's ingredients as seen on ChompThis.com")
  public String getChomp() {
    return chomp;
  }

  public void setChomp(String chomp) {
    this.chomp = chomp;
  }

  public BrandedFoodObjectIngredients usda(String usda) {
    this.usda = usda;
    return this;
  }

  /**
   * This branded food item&#x27;s ingredients according to the USDA
   * @return usda
   **/
  @JsonProperty("usda")
  @Schema(description = "This branded food item's ingredients according to the USDA")
  public String getUsda() {
    return usda;
  }

  public void setUsda(String usda) {
    this.usda = usda;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectIngredients brandedFoodObjectIngredients = (BrandedFoodObjectIngredients) o;
    return Objects.equals(this.chomp, brandedFoodObjectIngredients.chomp) &&
        Objects.equals(this.usda, brandedFoodObjectIngredients.usda);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chomp, usda);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectIngredients {\n");
    
    sb.append("    chomp: ").append(toIndentedString(chomp)).append("\n");
    sb.append("    usda: ").append(toIndentedString(usda)).append("\n");
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
