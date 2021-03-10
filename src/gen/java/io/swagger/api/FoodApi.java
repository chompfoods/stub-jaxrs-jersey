package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.FoodApiService;
import io.swagger.api.factories.FoodApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.BrandedFoodObject;
import io.swagger.model.IngredientObject;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/food")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-03-09T22:27:18.219Z[GMT]")public class FoodApi  {
   private final FoodApiService delegate;

   public FoodApi(@Context ServletConfig servletContext) {
      FoodApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("FoodApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (FoodApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = FoodApiServiceFactory.getFoodApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/branded/barcode.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a branded food item using a barcode", description = "## Get data for a branded food using the food's UPC/EAN barcode.  **You must have a Food API key to use this endpoint.** Get a [Food API key](https://chompthis.com/api/).  **Example**  > ```https://chompthis.com/api/v2/food/branded/barcode.php?api_key=API_KEY&code=CODE```  **Tips**   * Read our **[Knowledge Base article](https://desk.zoho.com/portal/chompthis/kb/articles/im-having-trouble-getting-matches-for-barcodes-what-can-id-do)** for helpful tips and tricks.   * Perform a [check-digit](https://en.wikipedia.org/wiki/Check_digit#UPC) on the barcode you are using.   * Use a barcode from our website [ChompThis.com](https://chompthis.com/?r=api). Search for a food and use the barcode shown in the search results.   * It is possible that our database contains the food you're looking for, but does not have the same barcode you are using. This can happen if a manufacturer introduces a variation of the same food, or the barcode you got was from a 2 oz bag of chips when our database has the food packaged in a 4 oz bag.   * [Contact us](https://chompthis.com/contact.php?api=y) if you are having trouble. ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching foods.  ", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items were found. "),
        
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public Response foodBrandedBarcodePhpGet(@Parameter(in = ParameterIn.QUERY, description = "#### UPC/EAN barcode  **Example** > ```&code=0842234000988``` ",required=true) @QueryParam("code") String code
,@Parameter(in = ParameterIn.QUERY, description = "#### **Only required for Premium subscribers.** The unique identifier assigned to each user on your platform. This can be any string of letters or numbers and doesn't have to relate to your own database. [Learn more](https://desk.zoho.com/portal/chompthis/en/kb/articles/monthly-active-users)  **Example** > ```&user_id=fehef8w4ha``` ") @QueryParam("user_id") String userId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.foodBrandedBarcodePhpGet(code,userId,securityContext);
    }
    @GET
    @Path("/branded/name.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a branded food item by name", description = "## Search for branded food items by name.  **You must have a Food API key to use this endpoint.** Get a [Food API key](https://chompthis.com/api/).  **Example** > ```https://chompthis.com/api/v2/food/branded/name.php?api_key=API_KEY&name=NAME```  **Tips**   * Get started by using our **[food lookup tool](https://chompthis.com/api/lookup.php)**.  > This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. **[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription)** if you aren't sure how to upgrade your subscription. ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching foods.  ", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items were found. "),
        
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public Response foodBrandedNamePhpGet(@Parameter(in = ParameterIn.QUERY, description = "#### Search for branded food items using a general food name keyword. This does not have to exactly match the \"official\" name for the food.  **Example** > ```&name=Starburst``` ",required=true) @QueryParam("name") String name
,@Parameter(in = ParameterIn.QUERY, description = "#### Set maximum number of records you want the API to return. The default value is \"**10**.\"  **Example** > ```&limit=10``` ", schema=@Schema(allowableValues={ "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" })
) @QueryParam("limit") Integer limit
,@Parameter(in = ParameterIn.QUERY, description = "#### This is how you paginate the search result. By default, you will see the first 10 records. You must increment the page number to access the next 10 records, and so on. The default value is \"**1**.\"  **Example** > ```&page=1``` ") @QueryParam("page") Integer page
,@Parameter(in = ParameterIn.QUERY, description = "#### **Only required for Premium subscribers.** The unique identifier assigned to each user on your platform. This can be any string of letters or numbers and doesn't have to relate to your own database. [Learn more](https://desk.zoho.com/portal/chompthis/en/kb/articles/monthly-active-users)  **Example** > ```&user_id=fehef8w4ha``` ") @QueryParam("user_id") String userId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.foodBrandedNamePhpGet(name,limit,page,userId,securityContext);
    }
    @GET
    @Path("/branded/search.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get data for branded food items using various search parameters", description = "## Search for branded food items using various parameters.  **You must have a Food API key to use this endpoint.** Get a [Food API key](https://chompthis.com/api/).  **Example** > ```https://chompthis.com/api/v2/food/branded/search.php?api_key=API_KEY&brand=BRAND&country=COUNTRY&page=1```  **Tips**    * Get started by using the **[Query Builder](https://chompthis.com/api/build.php)**.  > This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. **[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription)** if you aren't sure how to upgrade your subscription. ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching foods.  ", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items were found. "),
        
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public Response foodBrandedSearchPhpGet(@Parameter(in = ParameterIn.QUERY, description = "#### Filter the search to only include branded foods that contain a specific allergen.  **Example** > ```&allergen=Peanuts```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. ") @QueryParam("allergen") String allergen
,@Parameter(in = ParameterIn.QUERY, description = "#### Filter the search to only include branded foods that are owned by a specific brand.  **Example** > ```&brand=Starbucks``` ") @QueryParam("brand") String brand
,@Parameter(in = ParameterIn.QUERY, description = "#### Filter the search to only include branded foods from a specific category.  **Example** > ```&category=Plant Based Foods``` ") @QueryParam("category") String category
,@Parameter(in = ParameterIn.QUERY, description = "#### Filter the search to only include branded foods that are sold in a specific country.  **Example** > ```&country=United States```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. ") @QueryParam("country") String country
,@Parameter(in = ParameterIn.QUERY, description = "#### Filter the search to only include branded foods that are considered compatible with a specific diet.  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. ", schema=@Schema(allowableValues={ "Vegan", "Vegetarian", "Gluten Free" })
) @QueryParam("diet") String diet
,@Parameter(in = ParameterIn.QUERY, description = "#### Filter the search to only include branded foods that contain a specific ingredient.  **Example** > ```&ingredient=Salt``` ") @QueryParam("ingredient") String ingredient
,@Parameter(in = ParameterIn.QUERY, description = "#### Filter the search to only include branded foods that are associated with a specific keyword.  **Example** > ```&keyword=Organic```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. ") @QueryParam("keyword") String keyword
,@Parameter(in = ParameterIn.QUERY, description = "#### Filter the search to only include branded foods that contain a specific mineral.  **Example** > ```&mineral=Potassium``` ") @QueryParam("mineral") String mineral
,@Parameter(in = ParameterIn.QUERY, description = "#### Filter the search to only include branded foods that contain a specific nutrient.  **Example** > ```&nutrient=Caffeine```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. ") @QueryParam("nutrient") String nutrient
,@Parameter(in = ParameterIn.QUERY, description = "#### Filter the search to only include branded foods that contain a specific ingredient made using palm oil.  **Example** > ```&palm_oil=E160a Beta Carotene``` ") @QueryParam("palm_oil") String palmOil
,@Parameter(in = ParameterIn.QUERY, description = "### Filter the search to only include branded foods that contain a specific trace ingredient.  **Example** > ```&trace=Tree Nuts```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. ") @QueryParam("trace") String trace
,@Parameter(in = ParameterIn.QUERY, description = "#### Filter the search to only include branded foods that contain a specific vitamin.  **Example** > ```&vitamin=Biotin``` ") @QueryParam("vitamin") String vitamin
,@Parameter(in = ParameterIn.QUERY, description = "#### Set maximum number of records you want the API to return. The default value is \"**10**.\"  **Example** > ```&limit=10``` ", schema=@Schema(allowableValues={ "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" })
) @QueryParam("limit") Integer limit
,@Parameter(in = ParameterIn.QUERY, description = "#### This is how you paginate the search result. By default, you will see the first 10 records. You must increment the page number to access the next 10 records, and so on. The default value is \"**1**.\"  **Example** > ```&page=1``` ") @QueryParam("page") Integer page
,@Parameter(in = ParameterIn.QUERY, description = "#### **Only required for Premium subscribers.** The unique identifier assigned to each user on your platform. This can be any string of letters or numbers and doesn't have to relate to your own database. [Learn more](https://desk.zoho.com/portal/chompthis/en/kb/articles/monthly-active-users)  **Example** > ```&user_id=fehef8w4ha``` ") @QueryParam("user_id") String userId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.foodBrandedSearchPhpGet(allergen,brand,category,country,diet,ingredient,keyword,mineral,nutrient,palmOil,trace,vitamin,limit,page,userId,securityContext);
    }
    @GET
    @Path("/ingredient/search.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get raw/generic food ingredient item(s)", description = "## Get data for a specific ingredient or a specific set of ingredients.  **You must have a Food API key to use this endpoint.** Get a [Food API key](https://chompthis.com/api/).  **Example #1: Single Ingredient** > ```https://chompthis.com/api/v2/food/ingredient/search.php?api_key=API_KEY&find=raw broccoli```  **Example #2: Set of Ingredients** > ```https://chompthis.com/api/v2/food/ingredient/search.php?api_key=API_KEY&find=raw broccoli,mashed potatoes,chicken drumstick```  **Tips**   * Expose ingredient endpoints by using our **[food lookup tool](https://chompthis.com/api/lookup.php)**.  > This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. **[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription)** if you aren't sure how to upgrade your subscription. ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching ingredient foods.  ", content = @Content(schema = @Schema(implementation = IngredientObject.class))),
        
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items were found. "),
        
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public Response foodIngredientSearchPhpGet(@Parameter(in = ParameterIn.QUERY, description = "Search our database for a single ingredient or a specific set of ingredients.  **Example #1: Single Ingredient** > ```&find=raw broccoli```  **Example #2: Set of Ingredients** > ```&find=raw broccoli,buttermilk waffle,mashed potatoes```  **Important Notes**    * Comma-separated lists cannot contain more than **10 ingredients**. You must perform additional API calls if you are looking up more than 10 ingredients. ",required=true) @QueryParam("find") String find
,@Parameter(in = ParameterIn.QUERY, description = "#### Set maximum number of records you want the API to return, per search term. The default value is \"**1**.\"  **Example** > ```&limit=3``` ", schema=@Schema(allowableValues={ "1", "2", "3" })
) @QueryParam("limit") Integer limit
,@Parameter(in = ParameterIn.QUERY, description = "#### **Only required for Premium subscribers.** The unique identifier assigned to each user on your platform. This can be any string of letters or numbers and doesn't have to relate to your own database. [Learn more](https://desk.zoho.com/portal/chompthis/en/kb/articles/monthly-active-users)  **Example** > ```&user_id=fehef8w4ha``` ") @QueryParam("user_id") String userId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.foodIngredientSearchPhpGet(find,limit,userId,securityContext);
    }
}
