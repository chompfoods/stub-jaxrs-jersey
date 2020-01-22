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


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-01-22T13:02:22.043Z[GMT]")public class FoodApi  {
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
    @Operation(summary = "Get a branded food item using a barcode", description = "# Get data for a branded food using the food's UPC/EAN barcode.  __Example:__ ```https://chompthis.com/api/v2/food/branded/barcode.php?api_key=API_KEY&code=CODE``` ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "__Valid__ - Will return an object containing any matching foods.", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        
        @ApiResponse(responseCode = "400", description = "__Validation error__ - Invalid parameters or request."),
        
        @ApiResponse(responseCode = "401", description = "__Unauthorized__ - Invalid API key or usage limits exceeded. _[More information](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)_"),
        
        @ApiResponse(responseCode = "403", description = "__Forbidden__ - Disallowed entity."),
        
        @ApiResponse(responseCode = "404", description = "__Not found__ - No food items exist that match your query parameters."),
        
        @ApiResponse(responseCode = "500", description = "__Server error__ - Internal server error, request failed, or base error. _[Contact us](https://chompthis.com/api/ticket-new.php) if you see this._") })
    public Response foodBrandedBarcodePhpGet(@Parameter(description = "UPC/EAN barcode  __Example:__ &code=0842234000988  __Tips:__    - Use our [food lookup tool](https://chompthis.com/api/lookup.php).   - Read [this article](https://desk.zoho.com/portal/chompthis/kb/articles/im-having-trouble-getting-matches-for-barcodes-what-can-id-do) for general tips and tricks. ",required=true) @QueryParam("code") String code
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.foodBrandedBarcodePhpGet(code,securityContext);
    }
    @GET
    @Path("/branded/id.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a branded food item using an ID number", description = "# Get data for a branded food using Chomp's internal ID number.  _Alternatively, set the \"source\" parameter to \"USDA\" and use the food's FDC ID._  __Example:__ ```https://chompthis.com/api/v2/food/branded/id.php?api_key=API_KEY&id=ID``` ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "__Valid__ - Will return an object containing any matching foods.", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        
        @ApiResponse(responseCode = "400", description = "__Validation error__ - Invalid parameters or request."),
        
        @ApiResponse(responseCode = "401", description = "__Unauthorized__ - Invalid API key or usage limits exceeded. _[More information](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)_"),
        
        @ApiResponse(responseCode = "403", description = "__Forbidden__ - Disallowed entity."),
        
        @ApiResponse(responseCode = "404", description = "__Not found__ - No food items exist that match your query parameters."),
        
        @ApiResponse(responseCode = "500", description = "__Server error__ - Internal server error, request failed, or base error. _[Contact us](https://chompthis.com/api/ticket-new.php) if you see this._") })
    public Response foodBrandedIdPhpGet(@Parameter(description = "The ID number of a branded food item.  __Example #1:__ &id=15  __Example #2:__ &id=FDC_ID&source=USDA  ___Tip:__ Get started by using our  [ood lookup tool](https://chompthis.com/api/lookup.php)._ ",required=true) @QueryParam("id") Integer id
,@Parameter(description = "Configure the endpoint to accept food IDs from various data sources. This endpoint defaults to Chomp but can accept FDC IDs.  __Example:__ &source=Chomp  ___Important Note:__ Pass in &source=USDA if you want to look up food items using a USDA FDC ID._ ", schema=@Schema(allowableValues={ "Chomp", "USDA" })
) @QueryParam("source") String source
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.foodBrandedIdPhpGet(id,source,securityContext);
    }
    @GET
    @Path("/branded/name.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a branded food item by name", description = "# Search for branded food items by name.  This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. _[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription) if you aren't sure how to upgrade your subscription._  __Example:__ ```https://chompthis.com/api/v2/food/branded/name.php?api_key=API_KEY&name=NAME``` ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "__Valid__ - Will return an object containing any matching foods.", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        
        @ApiResponse(responseCode = "400", description = "__Validation error__ - Invalid parameters or request."),
        
        @ApiResponse(responseCode = "401", description = "__Unauthorized__ - Invalid API key or usage limits exceeded. _[More information](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)_"),
        
        @ApiResponse(responseCode = "403", description = "__Forbidden__ - Disallowed entity."),
        
        @ApiResponse(responseCode = "404", description = "__Not found__ - No food items exist that match your query parameters."),
        
        @ApiResponse(responseCode = "500", description = "__Server error__ - Internal server error, request failed, or base error. _[Contact us](https://chompthis.com/api/ticket-new.php) if you see this._") })
    public Response foodBrandedNamePhpGet(@Parameter(description = "Search for branded food items using a general food name keyword. This does not have to exactly match the \"official\" name for the food.  __Example:__ &name=Starburst  ___Tip:__ Get started by using our [food lookup tool](https://chompthis.com/api/lookup.php)._ ",required=true) @QueryParam("name") String name
,@Parameter(description = "Set maximum number of records you want the API to return.  __Example:__ &limit=10 ", schema=@Schema(allowableValues={ "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" })
) @QueryParam("limit") Integer limit
,@Parameter(description = "This is how you paginate the search result. By default, you will see the first 10 records. You must increment the page number to access the next 10 records, and so on.  __Example__: &page=1 ") @QueryParam("page") Integer page
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.foodBrandedNamePhpGet(name,limit,page,securityContext);
    }
    @GET
    @Path("/branded/search.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get data for branded food items using various search parameters", description = "# Search for branded food items using various parameters.  This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. _[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription) if you aren't sure how to upgrade your subscription._  __Example:__ ```https://chompthis.com/api/v2/food/branded/search.php?api_key=API_KEY&brand=BRAND&country=COUNTRY&page=1```  ___Tip:__ Get started by using the [Query Builder](https://chompthis.com/api/build.php)._ ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "__Valid__ - Will return an object containing any matching foods.", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        
        @ApiResponse(responseCode = "400", description = "__Validation error__ - Invalid parameters or request."),
        
        @ApiResponse(responseCode = "401", description = "__Unauthorized__ - Invalid API key or usage limits exceeded. _[More information](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)_"),
        
        @ApiResponse(responseCode = "403", description = "__Forbidden__ - Disallowed entity."),
        
        @ApiResponse(responseCode = "404", description = "__Not found__ - No food items exist that match your query parameters."),
        
        @ApiResponse(responseCode = "500", description = "__Server error__ - Internal server error, request failed, or base error. _[Contact us](https://chompthis.com/api/ticket-new.php) if you see this._") })
    public Response foodBrandedSearchPhpGet(@Parameter(description = "Filter the search to only include branded foods that contain a specific allergen.  __Example__: &allergen=Peanuts  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._ ") @QueryParam("allergen") String allergen
,@Parameter(description = "Filter the search to only include branded foods that are owned by a specific brand.  __Example__: &brand=Starbucks ") @QueryParam("brand") String brand
,@Parameter(description = "Filter the search to only include branded foods from a specific category.  __Example__: &category=Plant Based Foods ") @QueryParam("category") String category
,@Parameter(description = "Filter the search to only include branded foods that are sold in a specific country.  __Example__: &country=United States  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._ ") @QueryParam("country") String country
,@Parameter(description = "Filter the search to only include branded foods that are considered compatible with a specific diet.  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._ ", schema=@Schema(allowableValues={ "Vegan", "Vegetarian", "Gluten Free" })
) @QueryParam("diet") String diet
,@Parameter(description = "Filter the search to only include branded foods that contain a specific ingredient.  __Example__: &ingredient=Salt ") @QueryParam("ingredient") String ingredient
,@Parameter(description = "Filter the search to only include branded foods that are associated with a specific keyword.  __Example__: &keyword=Organic  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._ ") @QueryParam("keyword") String keyword
,@Parameter(description = "Filter the search to only include branded foods that contain a specific mineral.  __Example__: &mineral=Potassium ") @QueryParam("mineral") String mineral
,@Parameter(description = "Filter the search to only include branded foods that contain a specific nutrient.  __Example__: &nutrient=Caffeine  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._ ") @QueryParam("nutrient") String nutrient
,@Parameter(description = "Filter the search to only include branded foods that contain a specific ingredient made using palm oil.  __Example__: &palm_oil=E160a Beta Carotene ") @QueryParam("palm_oil") String palmOil
,@Parameter(description = "Filter the search to only include branded foods that contain a specific trace ingredient.  __Example__: &trace=Tree Nuts  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._ ") @QueryParam("trace") String trace
,@Parameter(description = "Filter the search to only include branded foods that contain a specific vitamin.  __Example__: &vitamin=Biotin ") @QueryParam("vitamin") String vitamin
,@Parameter(description = "Set maximum number of records you want the API to return.  __Example:__ &limit=10 ", schema=@Schema(allowableValues={ "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" })
) @QueryParam("limit") Integer limit
,@Parameter(description = "This is how you paginate the search result. By default, you will see the first 10 records. You must increment the page number to access the next 10 records, and so on.  __Example__: &page=1 ") @QueryParam("page") Integer page
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.foodBrandedSearchPhpGet(allergen,brand,category,country,diet,ingredient,keyword,mineral,nutrient,palmOil,trace,vitamin,limit,page,securityContext);
    }
    @GET
    @Path("/ingredient/search.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get raw/generic food ingredient item(s)", description = "# Get data for a specific ingredient or a specific set of ingredients.  This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. _[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription) if you aren't sure how to upgrade your subscription._  __Example:__ ```https://chompthis.com/api/v2/ingredient/search.php?api_key=API_KEY&find=STRING/LIST&list=BOOLEAN&raw=BOOLEAN``` ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "__Valid__ - Will return an object containing any matching ingredient foods.", content = @Content(schema = @Schema(implementation = IngredientObject.class))),
        
        @ApiResponse(responseCode = "400", description = "__Validation error__ - Invalid parameters or request."),
        
        @ApiResponse(responseCode = "401", description = "__Unauthorized__ - Invalid API key or usage limits exceeded. _[More information](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)_"),
        
        @ApiResponse(responseCode = "403", description = "__Forbidden__ - Disallowed entity."),
        
        @ApiResponse(responseCode = "404", description = "__Not found__ - No food items exist that match your query parameters."),
        
        @ApiResponse(responseCode = "500", description = "__Server error__ - Internal server error, request failed, or base error. _[Contact us](https://chompthis.com/api/ticket-new.php) if you see this._") })
    public Response foodIngredientSearchPhpGet(@Parameter(description = "Search our database for a single ingredient or a specific set of ingredients.  __Example #1:__ &find=broccoli  __Example #2:__ &find=broccoli,cauliflower,spinach&list=true  __Important List Notes:__    - Set the \"list\" parameter to \"true\" before passing in a comma-separated list of ingredients.   - Comma-separated lists cannot contain more than __15 ingredients__. You must perform additional API calls if you are looking up more than 15 ingredients. ",required=true) @QueryParam("find") Integer find
,@Parameter(description = "Setting _&list=true_ will configure this endpoint to allow searching for ingredients using a comma-separated list. By default, this endpoint will __only__ return results for the first ingredient.  __Example:__ &list=true ",required=true) @QueryParam("list") Boolean list
,@Parameter(description = "Optionally filter the search result to only include raw ingredients.  __Example:__ &raw=true ") @QueryParam("raw") Boolean raw
,@Parameter(description = "Set maximum number of records you want the API to return, per search term.  __Example:__ &limit=3 ", schema=@Schema(allowableValues={ "1", "2", "3" })
) @QueryParam("limit") Integer limit
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.foodIngredientSearchPhpGet(find,list,raw,limit,securityContext);
    }
}
