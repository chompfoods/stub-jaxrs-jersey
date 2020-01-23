/*
 * Chomp Food Database API Documentation
 * ## Important An **[API key](https://chompthis.com/api/)** is required for access to this API. Get yours at **[https://chompthis.com/api](https://chompthis.com/api/)**.  ### Getting Started   * **[Subscribe](https://chompthis.com/api/#pricing)** to the API.   * Scroll down and click the \"**Authorize**\" button.   * Enter your API key into the \"**value**\" input, click the \"**Authorize**\" button, then click the \"**Close**\" button.   * Scroll down to the section titled \"**default**\" and click on the API endpoint you wish to use.   * Click the \"**Try it out**\" button.   * Enter the information the endpoint requires.   * Click the \"**Execute**\" button.  ### Example    * Branded food response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/branded-food-response-object.json)**   * Ingredient response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/ingredient-response-object.json)**  ### How Do I Find My API Key?   * Your API key was sent to the email address you used to create your subscription.   * You will also find your API key in the **[Client Center](https://chompthis.com/api/manage.php)**.   * Read **[this article](https://desk.zoho.com/portal/chompthis/kb/articles/how-do-i-find-my-api-key)** for more information.  ### Helpful Links   * **Help & Support**     * [Knowledge Base &raquo;](https://desk.zoho.com/portal/chompthis/kb/chomp)     * [Support &raquo;](https://chompthis.com/api/ticket-new.php)     * [Client Center &raquo;](https://chompthis.com/api/manage.php)   * **Pricing**     * [Subscription Options &raquo;](https://chompthis.com/api/)     * [Cost Calculator &raquo;](https://chompthis.com/api/cost-calculator.php)   * **Guidelines**     * [Terms & License &raquo;](https://chompthis.com/api/terms.php)     * [Attribution &raquo;](https://chompthis.com/api/docs/attribution.php) 
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
import io.swagger.model.BrandedFoodObjectDietLabelsGlutenFree;
import io.swagger.model.BrandedFoodObjectDietLabelsVegan;
import io.swagger.model.BrandedFoodObjectDietLabelsVegetarian;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;

/**
 * An object containing this item&#x27;s compatibility grades for each supported diet
 */
@Schema(description = "An object containing this item's compatibility grades for each supported diet")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-01-23T17:11:27.834Z[GMT]")public class BrandedFoodObjectDietLabels   {
  @JsonProperty("vegan")
  private BrandedFoodObjectDietLabelsVegan vegan = null;

  @JsonProperty("vegetarian")
  private BrandedFoodObjectDietLabelsVegetarian vegetarian = null;

  @JsonProperty("gluten_free")
  private BrandedFoodObjectDietLabelsGlutenFree glutenFree = null;

  public BrandedFoodObjectDietLabels vegan(BrandedFoodObjectDietLabelsVegan vegan) {
    this.vegan = vegan;
    return this;
  }

  /**
   * Get vegan
   * @return vegan
   **/
  @JsonProperty("vegan")
  @Schema(description = "")
  public BrandedFoodObjectDietLabelsVegan getVegan() {
    return vegan;
  }

  public void setVegan(BrandedFoodObjectDietLabelsVegan vegan) {
    this.vegan = vegan;
  }

  public BrandedFoodObjectDietLabels vegetarian(BrandedFoodObjectDietLabelsVegetarian vegetarian) {
    this.vegetarian = vegetarian;
    return this;
  }

  /**
   * Get vegetarian
   * @return vegetarian
   **/
  @JsonProperty("vegetarian")
  @Schema(description = "")
  public BrandedFoodObjectDietLabelsVegetarian getVegetarian() {
    return vegetarian;
  }

  public void setVegetarian(BrandedFoodObjectDietLabelsVegetarian vegetarian) {
    this.vegetarian = vegetarian;
  }

  public BrandedFoodObjectDietLabels glutenFree(BrandedFoodObjectDietLabelsGlutenFree glutenFree) {
    this.glutenFree = glutenFree;
    return this;
  }

  /**
   * Get glutenFree
   * @return glutenFree
   **/
  @JsonProperty("gluten_free")
  @Schema(description = "")
  public BrandedFoodObjectDietLabelsGlutenFree getGlutenFree() {
    return glutenFree;
  }

  public void setGlutenFree(BrandedFoodObjectDietLabelsGlutenFree glutenFree) {
    this.glutenFree = glutenFree;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectDietLabels brandedFoodObjectDietLabels = (BrandedFoodObjectDietLabels) o;
    return Objects.equals(this.vegan, brandedFoodObjectDietLabels.vegan) &&
        Objects.equals(this.vegetarian, brandedFoodObjectDietLabels.vegetarian) &&
        Objects.equals(this.glutenFree, brandedFoodObjectDietLabels.glutenFree);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vegan, vegetarian, glutenFree);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectDietLabels {\n");
    
    sb.append("    vegan: ").append(toIndentedString(vegan)).append("\n");
    sb.append("    vegetarian: ").append(toIndentedString(vegetarian)).append("\n");
    sb.append("    glutenFree: ").append(toIndentedString(glutenFree)).append("\n");
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
