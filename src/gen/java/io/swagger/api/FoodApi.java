package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.FoodApiService;
import io.swagger.api.factories.FoodApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
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


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-01-23T13:13:51.415Z[GMT]")public class FoodApi  {
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
    @Operation(summary = "Get a branded food item using a barcode", description = "## Get data for a branded food using the food's UPC/EAN barcode.  **Example**  > ```https://chompthis.com/api/v2/food/branded/barcode.php?api_key=API_KEY&code=CODE```  **Tips**   * Read our **[Knowledge Base article](https://desk.zoho.com/portal/chompthis/kb/articles/im-having-trouble-getting-matches-for-barcodes-what-can-id-do)** for helpful tips and tricks. ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching foods.  ", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        
        @ApiResponse(responseCode = "403", description = "**Forbidden** - Disallowed entity. "),
        
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items exist that match your query parameters. "),
        
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public Response foodBrandedBarcodePhpGet(@Parameter(description = "#### UPC/EAN barcode  **Example** > ```&code=0842234000988``` ",required=true) @QueryParam("code") String code
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.foodBrandedBarcodePhpGet(code,securityContext);
    }
    @GET
    @Path("/branded/id.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a branded food item using an ID number", description = "## Get data for a branded food using Chomp's internal ID number.  **Example** > ```https://chompthis.com/api/v2/food/branded/id.php?api_key=API_KEY&id=ID```  **Tips**   * Find a food's ID by using our **[food lookup tool](https://chompthis.com/api/lookup.php)**.   * Alternatively, set the \"source\" parameter to \"USDA\" and use the food's FDC ID. ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching foods.  ", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        
        @ApiResponse(responseCode = "403", description = "**Forbidden** - Disallowed entity. "),
        
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items exist that match your query parameters. "),
        
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public Response foodBrandedIdPhpGet(@Parameter(description = "#### The ID number of a branded food item.  **Example #1: Using Chomp ID** > ```&id=15```  **Example #2: Using FDC ID** > ```&id=FDC_ID&source=USDA``` ",required=true) @QueryParam("id") Integer id
,@Parameter(description = "#### Configure the endpoint to accept food IDs from various data sources. This endpoint defaults to Chomp but can accept FDC IDs.  **Example** > ```&source=Chomp```  **Tips**   * Pass in ```&source=USDA``` if you want to look up food items using a USDA FDC ID. ", schema=@Schema(allowableValues={ "Chomp", "USDA" })
) @QueryParam("source") String source
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.foodBrandedIdPhpGet(id,source,securityContext);
    }
    @GET
    @Path("/branded/name.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a branded food item by name", description = "## Search for branded food items by name.  **Example** > ```https://chompthis.com/api/v2/food/branded/name.php?api_key=API_KEY&name=NAME```  **Tips**   * Get started by using our **[food lookup tool](https://chompthis.com/api/lookup.php)**.  > This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. **[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription)** if you aren't sure how to upgrade your subscription. ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching foods.  ", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        
        @ApiResponse(responseCode = "403", description = "**Forbidden** - Disallowed entity. "),
        
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items exist that match your query parameters. "),
        
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public Response foodBrandedNamePhpGet(@Parameter(description = "#### Search for branded food items using a general food name keyword. This does not have to exactly match the \"official\" name for the food.  **Example** > ```&name=Starburst``` ",required=true) @QueryParam("name") String name
,@Parameter(description = "#### Set maximum number of records you want the API to return.  **Example** > ```&limit=10``` ", schema=@Schema(allowableValues={ "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" })
) @QueryParam("limit") Integer limit
,@Parameter(description = "#### This is how you paginate the search result. By default, you will see the first 10 records. You must increment the page number to access the next 10 records, and so on.  **Example** > ```&page=1``` ") @QueryParam("page") Integer page
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.foodBrandedNamePhpGet(name,limit,page,securityContext);
    }
    @GET
    @Path("/branded/search.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get data for branded food items using various search parameters", description = "## Search for branded food items using various parameters.  **Example** > ```https://chompthis.com/api/v2/food/branded/search.php?api_key=API_KEY&brand=BRAND&country=COUNTRY&page=1```  **Tips**    * Get started by using the **[Query Builder](https://chompthis.com/api/build.php)**.  > This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. **[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription)** if you aren't sure how to upgrade your subscription. ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching foods.  ", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        
        @ApiResponse(responseCode = "403", description = "**Forbidden** - Disallowed entity. "),
        
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items exist that match your query parameters. "),
        
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public Response foodBrandedSearchPhpGet(@Parameter(description = "#### Filter the search to only include branded foods that contain a specific allergen.  **Example** > ```&allergen=Peanuts```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. ") @QueryParam("allergen") String allergen
,@Parameter(description = "#### Filter the search to only include branded foods that are owned by a specific brand.  **Example** > ```&brand=Starbucks``` ") @QueryParam("brand") String brand
,@Parameter(description = "#### Filter the search to only include branded foods from a specific category.  **Example** > ```&category=Plant Based Foods``` ") @QueryParam("category") String category
,@Parameter(description = "#### Filter the search to only include branded foods that are sold in a specific country.  **Example** > ```&country=United States```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. ") @QueryParam("country") String country
,@Parameter(description = "#### Filter the search to only include branded foods that are considered compatible with a specific diet.  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. ", schema=@Schema(allowableValues={ "Vegan", "Vegetarian", "Gluten Free" })
) @QueryParam("diet") String diet
,@Parameter(description = "#### Filter the search to only include branded foods that contain a specific ingredient.  **Example** > ```&ingredient=Salt``` ") @QueryParam("ingredient") String ingredient
,@Parameter(description = "#### Filter the search to only include branded foods that are associated with a specific keyword.  **Example** > ```&keyword=Organic```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. ") @QueryParam("keyword") String keyword
,@Parameter(description = "#### Filter the search to only include branded foods that contain a specific mineral.  **Example** > ```&mineral=Potassium``` ") @QueryParam("mineral") String mineral
,@Parameter(description = "#### Filter the search to only include branded foods that contain a specific nutrient.  **Example** > ```&nutrient=Caffeine```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. ") @QueryParam("nutrient") String nutrient
,@Parameter(description = "#### Filter the search to only include branded foods that contain a specific ingredient made using palm oil.  **Example** > ```&palm_oil=E160a Beta Carotene``` ") @QueryParam("palm_oil") String palmOil
,@Parameter(description = "### Filter the search to only include branded foods that contain a specific trace ingredient.  **Example** > ```&trace=Tree Nuts```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. ") @QueryParam("trace") String trace
,@Parameter(description = "#### Filter the search to only include branded foods that contain a specific vitamin.  **Example** > ```&vitamin=Biotin``` ") @QueryParam("vitamin") String vitamin
,@Parameter(description = "#### Set maximum number of records you want the API to return.  **Example** > ```&limit=10``` ", schema=@Schema(allowableValues={ "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" })
) @QueryParam("limit") Integer limit
,@Parameter(description = "#### This is how you paginate the search result. By default, you will see the first 10 records. You must increment the page number to access the next 10 records, and so on.  **Example** > ```&page=1``` ") @QueryParam("page") Integer page
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.foodBrandedSearchPhpGet(allergen,brand,category,country,diet,ingredient,keyword,mineral,nutrient,palmOil,trace,vitamin,limit,page,securityContext);
    }
    @GET
    @Path("/ingredient/search.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get raw/generic food ingredient item(s)", description = "## Get data for a specific ingredient or a specific set of ingredients.  **Example #1: Single Ingredient** > ```https://chompthis.com/api/v2/ingredient/search.php?api_key=API_KEY&find=broccoli&raw=true```  **Example #2: Set of Ingredients** > ```https://chompthis.com/api/v2/ingredient/search.php?api_key=API_KEY&find=broccoli,cauliflower,spinach&list=true&raw=true```  **Tips**   * Expose ingredient endpoints by using our **[food lookup tool](https://chompthis.com/api/lookup.php)**.  > This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. **[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription)** if you aren't sure how to upgrade your subscription. ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching ingredient foods.  ", content = @Content(schema = @Schema(implementation = IngredientObject.class))),
        
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        
        @ApiResponse(responseCode = "403", description = "**Forbidden** - Disallowed entity. "),
        
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items exist that match your query parameters. "),
        
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public Response foodIngredientSearchPhpGet(@Parameter(description = "Search our database for a single ingredient or a specific set of ingredients.  **Example #1: Single Ingredient** > ```&find=broccoli```  **Example #2: Set of Ingredients** > ```&find=broccoli,cauliflower,spinach&list=true```  **Important Notes**    * Set the \"list\" parameter to \"true\" before passing in a comma-separated list of ingredients.   * Comma-separated lists cannot contain more than **15 ingredients**. You must perform additional API calls if you are looking up more than 15 ingredients. ",required=true) @QueryParam("find") Integer find
,@Parameter(description = "#### Setting ```&list=true``` will configure this endpoint to allow searching for ingredients using a comma-separated list. By default, this endpoint will **only** return results for the first ingredient.  **Example** > ```&list=true``` ",required=true) @QueryParam("list") Boolean list
,@Parameter(description = "#### Optionally filter the search result to only include raw ingredients.  **Example** > ```&raw=true``` ") @QueryParam("raw") Boolean raw
,@Parameter(description = "#### Set maximum number of records you want the API to return, per search term.  **Example** > ```&limit=3``` ", schema=@Schema(allowableValues={ "1", "2", "3" })
) @QueryParam("limit") Integer limit
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.foodIngredientSearchPhpGet(find,list,raw,limit,securityContext);
    }
}
