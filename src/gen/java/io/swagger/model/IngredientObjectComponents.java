/*
 * Chomp Food Database API Documentation
 * ## Important An **[API key](https://chompthis.com/api/)** is required for access to this API. Get yours at **[https://chompthis.com/api](https://chompthis.com/api/)**.  ### Getting Started   * **[Subscribe](https://chompthis.com/api/#pricing)** to the API.   * Scroll down and click the \"**Authorize**\" button.   * Enter your API key into the \"**value**\" input, click the \"**Authorize**\" button, then click the \"**Close**\" button.   * Scroll down to the section titled \"**default**\" and click on the API endpoint you wish to use.   * Click the \"**Try it out**\" button.   * Enter the information the endpoint requires.   * Click the \"**Execute**\" button.  ### Example    * Branded food response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/branded-food-response-object.json)**   * Ingredient response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/ingredient-response-object.json)**  ### How Do I Find My API Key?   * Your API key was sent to the email address you used to create your subscription.   * You will also find your API key in the **[Client Center](https://chompthis.com/api/manage.php)**.   * Read **[this article](https://desk.zoho.com/portal/chompthis/kb/articles/how-do-i-find-my-api-key)** for more information.  ||| | ------- | -------- | | [Knowledge Base](https://desk.zoho.com/portal/chompthis/kb/chomp) | [Pricing](https://chompthis.com/api/) | | [Attribution](https://chompthis.com/api/docs/attribution.php) | [Cost Calculator](https://chompthis.com/api/cost-calculator.php) | | [Terms & License](https://chompthis.com/api/terms.php) | [Database Search](https://chompthis.com/api/lookup.php) | | [Support](https://chompthis.com/api/ticket-new.php) | [Query Builder](https://chompthis.com/api/build.php) | | [Client Center](https://chompthis.com/api/manage.php) | | 
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-01-23T13:57:41.551Z[GMT]")public class IngredientObjectComponents   {
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

  public IngredientObjectComponents name(String name) {
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

  public IngredientObjectComponents pctWeight(BigDecimal pctWeight) {
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

  public IngredientObjectComponents gramWeight(BigDecimal gramWeight) {
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

  public IngredientObjectComponents isRefuse(Boolean isRefuse) {
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

  public IngredientObjectComponents dataPoints(Integer dataPoints) {
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
    IngredientObjectComponents ingredientObjectComponents = (IngredientObjectComponents) o;
    return Objects.equals(this.name, ingredientObjectComponents.name) &&
        Objects.equals(this.pctWeight, ingredientObjectComponents.pctWeight) &&
        Objects.equals(this.gramWeight, ingredientObjectComponents.gramWeight) &&
        Objects.equals(this.isRefuse, ingredientObjectComponents.isRefuse) &&
        Objects.equals(this.dataPoints, ingredientObjectComponents.dataPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pctWeight, gramWeight, isRefuse, dataPoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientObjectComponents {\n");
    
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
