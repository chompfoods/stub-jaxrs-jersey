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
import javax.validation.constraints.*;

/**
 * An object containing photos of this item&#x27;s nutrition label
 */
@Schema(description = "An object containing photos of this item's nutrition label")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-01-18T04:55:10.866Z[GMT]")public class BrandedFoodObjectPackagingPhotosNutrition   {
  @JsonProperty("small")
  private String small = null;

  @JsonProperty("thumb")
  private String thumb = null;

  @JsonProperty("display")
  private String display = null;

  public BrandedFoodObjectPackagingPhotosNutrition small(String small) {
    this.small = small;
    return this;
  }

  /**
   * Small photo of this item&#x27;s nutrition label
   * @return small
   **/
  @JsonProperty("small")
  @Schema(description = "Small photo of this item's nutrition label")
  public String getSmall() {
    return small;
  }

  public void setSmall(String small) {
    this.small = small;
  }

  public BrandedFoodObjectPackagingPhotosNutrition thumb(String thumb) {
    this.thumb = thumb;
    return this;
  }

  /**
   * Thumbnail photo of this item&#x27;s nutrition label
   * @return thumb
   **/
  @JsonProperty("thumb")
  @Schema(description = "Thumbnail photo of this item's nutrition label")
  public String getThumb() {
    return thumb;
  }

  public void setThumb(String thumb) {
    this.thumb = thumb;
  }

  public BrandedFoodObjectPackagingPhotosNutrition display(String display) {
    this.display = display;
    return this;
  }

  /**
   * Full-sized photo of this item&#x27;s nutrition label
   * @return display
   **/
  @JsonProperty("display")
  @Schema(description = "Full-sized photo of this item's nutrition label")
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectPackagingPhotosNutrition brandedFoodObjectPackagingPhotosNutrition = (BrandedFoodObjectPackagingPhotosNutrition) o;
    return Objects.equals(this.small, brandedFoodObjectPackagingPhotosNutrition.small) &&
        Objects.equals(this.thumb, brandedFoodObjectPackagingPhotosNutrition.thumb) &&
        Objects.equals(this.display, brandedFoodObjectPackagingPhotosNutrition.display);
  }

  @Override
  public int hashCode() {
    return Objects.hash(small, thumb, display);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectPackagingPhotosNutrition {\n");
    
    sb.append("    small: ").append(toIndentedString(small)).append("\n");
    sb.append("    thumb: ").append(toIndentedString(thumb)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
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
