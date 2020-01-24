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
import io.swagger.model.BrandedFoodObjectCountryDetails;
import io.swagger.model.BrandedFoodObjectDietFlags;
import io.swagger.model.BrandedFoodObjectDietLabels;
import io.swagger.model.BrandedFoodObjectNutrients;
import io.swagger.model.BrandedFoodObjectPackage;
import io.swagger.model.BrandedFoodObjectPackagingPhotos;
import io.swagger.model.BrandedFoodObjectServing;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * An object containing information for this specific item.
 */
@Schema(description = "An object containing information for this specific item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-01-24T14:21:11.988Z[GMT]")public class BrandedFoodObjectItems   {
  @JsonProperty("barcode")
  private String barcode = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("brand")
  private String brand = null;

  @JsonProperty("ingredients")
  private String ingredients = null;

  @JsonProperty("package")
  private BrandedFoodObjectPackage _package = null;

  @JsonProperty("serving")
  private BrandedFoodObjectServing serving = null;

  @JsonProperty("categories")
  private List<String> categories = null;

  @JsonProperty("nutrients")
  private List<BrandedFoodObjectNutrients> nutrients = null;

  @JsonProperty("diet_labels")
  private BrandedFoodObjectDietLabels dietLabels = null;

  @JsonProperty("diet_flags")
  private List<BrandedFoodObjectDietFlags> dietFlags = null;

  @JsonProperty("packaging_photos")
  private BrandedFoodObjectPackagingPhotos packagingPhotos = null;

  @JsonProperty("allergens")
  private List<String> allergens = null;

  @JsonProperty("brand_list")
  private List<String> brandList = null;

  @JsonProperty("countries")
  private List<String> countries = null;

  @JsonProperty("country_details")
  private BrandedFoodObjectCountryDetails countryDetails = null;

  @JsonProperty("palm_oil_ingredients")
  private List<String> palmOilIngredients = null;

  @JsonProperty("ingredient_list")
  private List<String> ingredientList = null;

  @JsonProperty("has_english_ingredients")
  private Boolean hasEnglishIngredients = null;

  @JsonProperty("minerals")
  private List<String> minerals = null;

  @JsonProperty("traces")
  private List<String> traces = null;

  @JsonProperty("vitamins")
  private List<String> vitamins = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("keywords")
  private List<String> keywords = null;

  public BrandedFoodObjectItems barcode(String barcode) {
    this.barcode = barcode;
    return this;
  }

  /**
   * EAN/UPC barcode
   * @return barcode
   **/
  @JsonProperty("barcode")
  @Schema(description = "EAN/UPC barcode")
  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  public BrandedFoodObjectItems name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Item name as provided by brand owner or as shown on packaging
   * @return name
   **/
  @JsonProperty("name")
  @Schema(description = "Item name as provided by brand owner or as shown on packaging")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BrandedFoodObjectItems brand(String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * The brand name that owns this item
   * @return brand
   **/
  @JsonProperty("brand")
  @Schema(description = "The brand name that owns this item")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public BrandedFoodObjectItems ingredients(String ingredients) {
    this.ingredients = ingredients;
    return this;
  }

  /**
   * This food item&#x27;s ingredients from greatest quantity to least
   * @return ingredients
   **/
  @JsonProperty("ingredients")
  @Schema(description = "This food item's ingredients from greatest quantity to least")
  public String getIngredients() {
    return ingredients;
  }

  public void setIngredients(String ingredients) {
    this.ingredients = ingredients;
  }

  public BrandedFoodObjectItems _package(BrandedFoodObjectPackage _package) {
    this._package = _package;
    return this;
  }

  /**
   * Get _package
   * @return _package
   **/
  @JsonProperty("package")
  @Schema(description = "")
  public BrandedFoodObjectPackage getPackage() {
    return _package;
  }

  public void setPackage(BrandedFoodObjectPackage _package) {
    this._package = _package;
  }

  public BrandedFoodObjectItems serving(BrandedFoodObjectServing serving) {
    this.serving = serving;
    return this;
  }

  /**
   * Get serving
   * @return serving
   **/
  @JsonProperty("serving")
  @Schema(description = "")
  public BrandedFoodObjectServing getServing() {
    return serving;
  }

  public void setServing(BrandedFoodObjectServing serving) {
    this.serving = serving;
  }

  public BrandedFoodObjectItems categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public BrandedFoodObjectItems addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<String>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
   **/
  @JsonProperty("categories")
  @Schema(description = "")
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public BrandedFoodObjectItems nutrients(List<BrandedFoodObjectNutrients> nutrients) {
    this.nutrients = nutrients;
    return this;
  }

  public BrandedFoodObjectItems addNutrientsItem(BrandedFoodObjectNutrients nutrientsItem) {
    if (this.nutrients == null) {
      this.nutrients = new ArrayList<BrandedFoodObjectNutrients>();
    }
    this.nutrients.add(nutrientsItem);
    return this;
  }

  /**
   * An array containing nutrient informatio objects for this food item
   * @return nutrients
   **/
  @JsonProperty("nutrients")
  @Schema(description = "An array containing nutrient informatio objects for this food item")
  public List<BrandedFoodObjectNutrients> getNutrients() {
    return nutrients;
  }

  public void setNutrients(List<BrandedFoodObjectNutrients> nutrients) {
    this.nutrients = nutrients;
  }

  public BrandedFoodObjectItems dietLabels(BrandedFoodObjectDietLabels dietLabels) {
    this.dietLabels = dietLabels;
    return this;
  }

  /**
   * Get dietLabels
   * @return dietLabels
   **/
  @JsonProperty("diet_labels")
  @Schema(description = "")
  public BrandedFoodObjectDietLabels getDietLabels() {
    return dietLabels;
  }

  public void setDietLabels(BrandedFoodObjectDietLabels dietLabels) {
    this.dietLabels = dietLabels;
  }

  public BrandedFoodObjectItems dietFlags(List<BrandedFoodObjectDietFlags> dietFlags) {
    this.dietFlags = dietFlags;
    return this;
  }

  public BrandedFoodObjectItems addDietFlagsItem(BrandedFoodObjectDietFlags dietFlagsItem) {
    if (this.dietFlags == null) {
      this.dietFlags = new ArrayList<BrandedFoodObjectDietFlags>();
    }
    this.dietFlags.add(dietFlagsItem);
    return this;
  }

  /**
   * An array of ingredient objects that were flagged while grading this item for compatibility with each diet
   * @return dietFlags
   **/
  @JsonProperty("diet_flags")
  @Schema(description = "An array of ingredient objects that were flagged while grading this item for compatibility with each diet")
  public List<BrandedFoodObjectDietFlags> getDietFlags() {
    return dietFlags;
  }

  public void setDietFlags(List<BrandedFoodObjectDietFlags> dietFlags) {
    this.dietFlags = dietFlags;
  }

  public BrandedFoodObjectItems packagingPhotos(BrandedFoodObjectPackagingPhotos packagingPhotos) {
    this.packagingPhotos = packagingPhotos;
    return this;
  }

  /**
   * Get packagingPhotos
   * @return packagingPhotos
   **/
  @JsonProperty("packaging_photos")
  @Schema(description = "")
  public BrandedFoodObjectPackagingPhotos getPackagingPhotos() {
    return packagingPhotos;
  }

  public void setPackagingPhotos(BrandedFoodObjectPackagingPhotos packagingPhotos) {
    this.packagingPhotos = packagingPhotos;
  }

  public BrandedFoodObjectItems allergens(List<String> allergens) {
    this.allergens = allergens;
    return this;
  }

  public BrandedFoodObjectItems addAllergensItem(String allergensItem) {
    if (this.allergens == null) {
      this.allergens = new ArrayList<String>();
    }
    this.allergens.add(allergensItem);
    return this;
  }

  /**
   * An array of ingredients in this item that may cause allergic reactions in people
   * @return allergens
   **/
  @JsonProperty("allergens")
  @Schema(description = "An array of ingredients in this item that may cause allergic reactions in people")
  public List<String> getAllergens() {
    return allergens;
  }

  public void setAllergens(List<String> allergens) {
    this.allergens = allergens;
  }

  public BrandedFoodObjectItems brandList(List<String> brandList) {
    this.brandList = brandList;
    return this;
  }

  public BrandedFoodObjectItems addBrandListItem(String brandListItem) {
    if (this.brandList == null) {
      this.brandList = new ArrayList<String>();
    }
    this.brandList.add(brandListItem);
    return this;
  }

  /**
   * An array of brands we have associated with this item. Some items are sold by more than 1 brand.
   * @return brandList
   **/
  @JsonProperty("brand_list")
  @Schema(description = "An array of brands we have associated with this item. Some items are sold by more than 1 brand.")
  public List<String> getBrandList() {
    return brandList;
  }

  public void setBrandList(List<String> brandList) {
    this.brandList = brandList;
  }

  public BrandedFoodObjectItems countries(List<String> countries) {
    this.countries = countries;
    return this;
  }

  public BrandedFoodObjectItems addCountriesItem(String countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<String>();
    }
    this.countries.add(countriesItem);
    return this;
  }

  /**
   * An array of countries where this item is sold
   * @return countries
   **/
  @JsonProperty("countries")
  @Schema(description = "An array of countries where this item is sold")
  public List<String> getCountries() {
    return countries;
  }

  public void setCountries(List<String> countries) {
    this.countries = countries;
  }

  public BrandedFoodObjectItems countryDetails(BrandedFoodObjectCountryDetails countryDetails) {
    this.countryDetails = countryDetails;
    return this;
  }

  /**
   * Get countryDetails
   * @return countryDetails
   **/
  @JsonProperty("country_details")
  @Schema(description = "")
  public BrandedFoodObjectCountryDetails getCountryDetails() {
    return countryDetails;
  }

  public void setCountryDetails(BrandedFoodObjectCountryDetails countryDetails) {
    this.countryDetails = countryDetails;
  }

  public BrandedFoodObjectItems palmOilIngredients(List<String> palmOilIngredients) {
    this.palmOilIngredients = palmOilIngredients;
    return this;
  }

  public BrandedFoodObjectItems addPalmOilIngredientsItem(String palmOilIngredientsItem) {
    if (this.palmOilIngredients == null) {
      this.palmOilIngredients = new ArrayList<String>();
    }
    this.palmOilIngredients.add(palmOilIngredientsItem);
    return this;
  }

  /**
   * An array of ingredients made from palm oil
   * @return palmOilIngredients
   **/
  @JsonProperty("palm_oil_ingredients")
  @Schema(description = "An array of ingredients made from palm oil")
  public List<String> getPalmOilIngredients() {
    return palmOilIngredients;
  }

  public void setPalmOilIngredients(List<String> palmOilIngredients) {
    this.palmOilIngredients = palmOilIngredients;
  }

  public BrandedFoodObjectItems ingredientList(List<String> ingredientList) {
    this.ingredientList = ingredientList;
    return this;
  }

  public BrandedFoodObjectItems addIngredientListItem(String ingredientListItem) {
    if (this.ingredientList == null) {
      this.ingredientList = new ArrayList<String>();
    }
    this.ingredientList.add(ingredientListItem);
    return this;
  }

  /**
   * An array of this item&#x27;s ingredients
   * @return ingredientList
   **/
  @JsonProperty("ingredient_list")
  @Schema(description = "An array of this item's ingredients")
  public List<String> getIngredientList() {
    return ingredientList;
  }

  public void setIngredientList(List<String> ingredientList) {
    this.ingredientList = ingredientList;
  }

  public BrandedFoodObjectItems hasEnglishIngredients(Boolean hasEnglishIngredients) {
    this.hasEnglishIngredients = hasEnglishIngredients;
    return this;
  }

  /**
   * A boolean indicating if we have English ingredients for this item
   * @return hasEnglishIngredients
   **/
  @JsonProperty("has_english_ingredients")
  @Schema(description = "A boolean indicating if we have English ingredients for this item")
  public Boolean isHasEnglishIngredients() {
    return hasEnglishIngredients;
  }

  public void setHasEnglishIngredients(Boolean hasEnglishIngredients) {
    this.hasEnglishIngredients = hasEnglishIngredients;
  }

  public BrandedFoodObjectItems minerals(List<String> minerals) {
    this.minerals = minerals;
    return this;
  }

  public BrandedFoodObjectItems addMineralsItem(String mineralsItem) {
    if (this.minerals == null) {
      this.minerals = new ArrayList<String>();
    }
    this.minerals.add(mineralsItem);
    return this;
  }

  /**
   * An array of minerals that this item contains
   * @return minerals
   **/
  @JsonProperty("minerals")
  @Schema(description = "An array of minerals that this item contains")
  public List<String> getMinerals() {
    return minerals;
  }

  public void setMinerals(List<String> minerals) {
    this.minerals = minerals;
  }

  public BrandedFoodObjectItems traces(List<String> traces) {
    this.traces = traces;
    return this;
  }

  public BrandedFoodObjectItems addTracesItem(String tracesItem) {
    if (this.traces == null) {
      this.traces = new ArrayList<String>();
    }
    this.traces.add(tracesItem);
    return this;
  }

  /**
   * An array of trace ingredients that may be found in this item
   * @return traces
   **/
  @JsonProperty("traces")
  @Schema(description = "An array of trace ingredients that may be found in this item")
  public List<String> getTraces() {
    return traces;
  }

  public void setTraces(List<String> traces) {
    this.traces = traces;
  }

  public BrandedFoodObjectItems vitamins(List<String> vitamins) {
    this.vitamins = vitamins;
    return this;
  }

  public BrandedFoodObjectItems addVitaminsItem(String vitaminsItem) {
    if (this.vitamins == null) {
      this.vitamins = new ArrayList<String>();
    }
    this.vitamins.add(vitaminsItem);
    return this;
  }

  /**
   * An array of vitamins that are found in this item
   * @return vitamins
   **/
  @JsonProperty("vitamins")
  @Schema(description = "An array of vitamins that are found in this item")
  public List<String> getVitamins() {
    return vitamins;
  }

  public void setVitamins(List<String> vitamins) {
    this.vitamins = vitamins;
  }

  public BrandedFoodObjectItems description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of this item
   * @return description
   **/
  @JsonProperty("description")
  @Schema(description = "A description of this item")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BrandedFoodObjectItems keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public BrandedFoodObjectItems addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<String>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

  /**
   * An array of keywords that can be used to describe this item
   * @return keywords
   **/
  @JsonProperty("keywords")
  @Schema(description = "An array of keywords that can be used to describe this item")
  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectItems brandedFoodObjectItems = (BrandedFoodObjectItems) o;
    return Objects.equals(this.barcode, brandedFoodObjectItems.barcode) &&
        Objects.equals(this.name, brandedFoodObjectItems.name) &&
        Objects.equals(this.brand, brandedFoodObjectItems.brand) &&
        Objects.equals(this.ingredients, brandedFoodObjectItems.ingredients) &&
        Objects.equals(this._package, brandedFoodObjectItems._package) &&
        Objects.equals(this.serving, brandedFoodObjectItems.serving) &&
        Objects.equals(this.categories, brandedFoodObjectItems.categories) &&
        Objects.equals(this.nutrients, brandedFoodObjectItems.nutrients) &&
        Objects.equals(this.dietLabels, brandedFoodObjectItems.dietLabels) &&
        Objects.equals(this.dietFlags, brandedFoodObjectItems.dietFlags) &&
        Objects.equals(this.packagingPhotos, brandedFoodObjectItems.packagingPhotos) &&
        Objects.equals(this.allergens, brandedFoodObjectItems.allergens) &&
        Objects.equals(this.brandList, brandedFoodObjectItems.brandList) &&
        Objects.equals(this.countries, brandedFoodObjectItems.countries) &&
        Objects.equals(this.countryDetails, brandedFoodObjectItems.countryDetails) &&
        Objects.equals(this.palmOilIngredients, brandedFoodObjectItems.palmOilIngredients) &&
        Objects.equals(this.ingredientList, brandedFoodObjectItems.ingredientList) &&
        Objects.equals(this.hasEnglishIngredients, brandedFoodObjectItems.hasEnglishIngredients) &&
        Objects.equals(this.minerals, brandedFoodObjectItems.minerals) &&
        Objects.equals(this.traces, brandedFoodObjectItems.traces) &&
        Objects.equals(this.vitamins, brandedFoodObjectItems.vitamins) &&
        Objects.equals(this.description, brandedFoodObjectItems.description) &&
        Objects.equals(this.keywords, brandedFoodObjectItems.keywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barcode, name, brand, ingredients, _package, serving, categories, nutrients, dietLabels, dietFlags, packagingPhotos, allergens, brandList, countries, countryDetails, palmOilIngredients, ingredientList, hasEnglishIngredients, minerals, traces, vitamins, description, keywords);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectItems {\n");
    
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    serving: ").append(toIndentedString(serving)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    nutrients: ").append(toIndentedString(nutrients)).append("\n");
    sb.append("    dietLabels: ").append(toIndentedString(dietLabels)).append("\n");
    sb.append("    dietFlags: ").append(toIndentedString(dietFlags)).append("\n");
    sb.append("    packagingPhotos: ").append(toIndentedString(packagingPhotos)).append("\n");
    sb.append("    allergens: ").append(toIndentedString(allergens)).append("\n");
    sb.append("    brandList: ").append(toIndentedString(brandList)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    countryDetails: ").append(toIndentedString(countryDetails)).append("\n");
    sb.append("    palmOilIngredients: ").append(toIndentedString(palmOilIngredients)).append("\n");
    sb.append("    ingredientList: ").append(toIndentedString(ingredientList)).append("\n");
    sb.append("    hasEnglishIngredients: ").append(toIndentedString(hasEnglishIngredients)).append("\n");
    sb.append("    minerals: ").append(toIndentedString(minerals)).append("\n");
    sb.append("    traces: ").append(toIndentedString(traces)).append("\n");
    sb.append("    vitamins: ").append(toIndentedString(vitamins)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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
