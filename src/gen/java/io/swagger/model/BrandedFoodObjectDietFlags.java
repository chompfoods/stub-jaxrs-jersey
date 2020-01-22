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
 * An object containing information on an individual ingredient that was flagged as potentially not being compatible with a certain diet
 */
@Schema(description = "An object containing information on an individual ingredient that was flagged as potentially not being compatible with a certain diet")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-01-22T14:07:33.797Z[GMT]")public class BrandedFoodObjectDietFlags   {
  @JsonProperty("ingredient")
  private String ingredient = null;

  @JsonProperty("ingredient_description")
  private String ingredientDescription = null;

  @JsonProperty("diet_label")
  private String dietLabel = null;

  @JsonProperty("is_compatible")
  private String isCompatible = null;

  @JsonProperty("compatibility_level")
  private Integer compatibilityLevel = null;

  @JsonProperty("compatibility_description")
  private String compatibilityDescription = null;

  @JsonProperty("is_allergen")
  private Boolean isAllergen = null;

  public BrandedFoodObjectDietFlags ingredient(String ingredient) {
    this.ingredient = ingredient;
    return this;
  }

  /**
   * Ingredient name
   * @return ingredient
   **/
  @JsonProperty("ingredient")
  @Schema(description = "Ingredient name")
  public String getIngredient() {
    return ingredient;
  }

  public void setIngredient(String ingredient) {
    this.ingredient = ingredient;
  }

  public BrandedFoodObjectDietFlags ingredientDescription(String ingredientDescription) {
    this.ingredientDescription = ingredientDescription;
    return this;
  }

  /**
   * Description of the ingredient
   * @return ingredientDescription
   **/
  @JsonProperty("ingredient_description")
  @Schema(description = "Description of the ingredient")
  public String getIngredientDescription() {
    return ingredientDescription;
  }

  public void setIngredientDescription(String ingredientDescription) {
    this.ingredientDescription = ingredientDescription;
  }

  public BrandedFoodObjectDietFlags dietLabel(String dietLabel) {
    this.dietLabel = dietLabel;
    return this;
  }

  /**
   * Name of the diet with which this ingredient may not be compatible
   * @return dietLabel
   **/
  @JsonProperty("diet_label")
  @Schema(description = "Name of the diet with which this ingredient may not be compatible")
  public String getDietLabel() {
    return dietLabel;
  }

  public void setDietLabel(String dietLabel) {
    this.dietLabel = dietLabel;
  }

  public BrandedFoodObjectDietFlags isCompatible(String isCompatible) {
    this.isCompatible = isCompatible;
    return this;
  }

  /**
   * A description of if we believe this ingredient is compatible with the diet
   * @return isCompatible
   **/
  @JsonProperty("is_compatible")
  @Schema(description = "A description of if we believe this ingredient is compatible with the diet")
  public String getIsCompatible() {
    return isCompatible;
  }

  public void setIsCompatible(String isCompatible) {
    this.isCompatible = isCompatible;
  }

  public BrandedFoodObjectDietFlags compatibilityLevel(Integer compatibilityLevel) {
    this.compatibilityLevel = compatibilityLevel;
    return this;
  }

  /**
   * A numeric representation of if we believe this ingredient is compatible with the diet. Higher values indicate more compatibility
   * @return compatibilityLevel
   **/
  @JsonProperty("compatibility_level")
  @Schema(description = "A numeric representation of if we believe this ingredient is compatible with the diet. Higher values indicate more compatibility")
  public Integer getCompatibilityLevel() {
    return compatibilityLevel;
  }

  public void setCompatibilityLevel(Integer compatibilityLevel) {
    this.compatibilityLevel = compatibilityLevel;
  }

  public BrandedFoodObjectDietFlags compatibilityDescription(String compatibilityDescription) {
    this.compatibilityDescription = compatibilityDescription;
    return this;
  }

  /**
   * A description of how we graded this ingredient for compatibility with the diet
   * @return compatibilityDescription
   **/
  @JsonProperty("compatibility_description")
  @Schema(description = "A description of how we graded this ingredient for compatibility with the diet")
  public String getCompatibilityDescription() {
    return compatibilityDescription;
  }

  public void setCompatibilityDescription(String compatibilityDescription) {
    this.compatibilityDescription = compatibilityDescription;
  }

  public BrandedFoodObjectDietFlags isAllergen(Boolean isAllergen) {
    this.isAllergen = isAllergen;
    return this;
  }

  /**
   * Boolean representing if the ingredient is a known allergen
   * @return isAllergen
   **/
  @JsonProperty("is_allergen")
  @Schema(description = "Boolean representing if the ingredient is a known allergen")
  public Boolean isIsAllergen() {
    return isAllergen;
  }

  public void setIsAllergen(Boolean isAllergen) {
    this.isAllergen = isAllergen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectDietFlags brandedFoodObjectDietFlags = (BrandedFoodObjectDietFlags) o;
    return Objects.equals(this.ingredient, brandedFoodObjectDietFlags.ingredient) &&
        Objects.equals(this.ingredientDescription, brandedFoodObjectDietFlags.ingredientDescription) &&
        Objects.equals(this.dietLabel, brandedFoodObjectDietFlags.dietLabel) &&
        Objects.equals(this.isCompatible, brandedFoodObjectDietFlags.isCompatible) &&
        Objects.equals(this.compatibilityLevel, brandedFoodObjectDietFlags.compatibilityLevel) &&
        Objects.equals(this.compatibilityDescription, brandedFoodObjectDietFlags.compatibilityDescription) &&
        Objects.equals(this.isAllergen, brandedFoodObjectDietFlags.isAllergen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingredient, ingredientDescription, dietLabel, isCompatible, compatibilityLevel, compatibilityDescription, isAllergen);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectDietFlags {\n");
    
    sb.append("    ingredient: ").append(toIndentedString(ingredient)).append("\n");
    sb.append("    ingredientDescription: ").append(toIndentedString(ingredientDescription)).append("\n");
    sb.append("    dietLabel: ").append(toIndentedString(dietLabel)).append("\n");
    sb.append("    isCompatible: ").append(toIndentedString(isCompatible)).append("\n");
    sb.append("    compatibilityLevel: ").append(toIndentedString(compatibilityLevel)).append("\n");
    sb.append("    compatibilityDescription: ").append(toIndentedString(compatibilityDescription)).append("\n");
    sb.append("    isAllergen: ").append(toIndentedString(isAllergen)).append("\n");
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
