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
import io.swagger.model.BrandedFoodObjectPackagingPhotosFront;
import io.swagger.model.BrandedFoodObjectPackagingPhotosIngredients;
import io.swagger.model.BrandedFoodObjectPackagingPhotosNutrition;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;

/**
 * A object containing a collection of photos of this item&#x27;s packaging
 */
@Schema(description = "A object containing a collection of photos of this item's packaging")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-01-21T14:14:30.629Z[GMT]")public class BrandedFoodObjectPackagingPhotos   {
  @JsonProperty("front")
  private BrandedFoodObjectPackagingPhotosFront front = null;

  @JsonProperty("nutrition")
  private BrandedFoodObjectPackagingPhotosNutrition nutrition = null;

  @JsonProperty("ingredients")
  private BrandedFoodObjectPackagingPhotosIngredients ingredients = null;

  public BrandedFoodObjectPackagingPhotos front(BrandedFoodObjectPackagingPhotosFront front) {
    this.front = front;
    return this;
  }

  /**
   * Get front
   * @return front
   **/
  @JsonProperty("front")
  @Schema(description = "")
  public BrandedFoodObjectPackagingPhotosFront getFront() {
    return front;
  }

  public void setFront(BrandedFoodObjectPackagingPhotosFront front) {
    this.front = front;
  }

  public BrandedFoodObjectPackagingPhotos nutrition(BrandedFoodObjectPackagingPhotosNutrition nutrition) {
    this.nutrition = nutrition;
    return this;
  }

  /**
   * Get nutrition
   * @return nutrition
   **/
  @JsonProperty("nutrition")
  @Schema(description = "")
  public BrandedFoodObjectPackagingPhotosNutrition getNutrition() {
    return nutrition;
  }

  public void setNutrition(BrandedFoodObjectPackagingPhotosNutrition nutrition) {
    this.nutrition = nutrition;
  }

  public BrandedFoodObjectPackagingPhotos ingredients(BrandedFoodObjectPackagingPhotosIngredients ingredients) {
    this.ingredients = ingredients;
    return this;
  }

  /**
   * Get ingredients
   * @return ingredients
   **/
  @JsonProperty("ingredients")
  @Schema(description = "")
  public BrandedFoodObjectPackagingPhotosIngredients getIngredients() {
    return ingredients;
  }

  public void setIngredients(BrandedFoodObjectPackagingPhotosIngredients ingredients) {
    this.ingredients = ingredients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectPackagingPhotos brandedFoodObjectPackagingPhotos = (BrandedFoodObjectPackagingPhotos) o;
    return Objects.equals(this.front, brandedFoodObjectPackagingPhotos.front) &&
        Objects.equals(this.nutrition, brandedFoodObjectPackagingPhotos.nutrition) &&
        Objects.equals(this.ingredients, brandedFoodObjectPackagingPhotos.ingredients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(front, nutrition, ingredients);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectPackagingPhotos {\n");
    
    sb.append("    front: ").append(toIndentedString(front)).append("\n");
    sb.append("    nutrition: ").append(toIndentedString(nutrition)).append("\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
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
