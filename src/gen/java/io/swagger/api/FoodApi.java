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


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-01-21T14:14:30.629Z[GMT]")public class FoodApi  {
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
    public Response foodBrandedBarcodePhpGet(@Parameter(description = "UPC/EAN barcode  __Example:__ 0842234000988  __Resources:__ [Database search](https://chompthis.com/api/lookup.php)  _Read [this article](https://desk.zoho.com/portal/chompthis/kb/articles/im-having-trouble-getting-matches-for-barcodes-what-can-id-do) for tips and tricks._ ",required=true) @QueryParam("code") String code
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
    public Response foodBrandedIdPhpGet(@Parameter(description = "Chomp branded food ID.  _Set \"source=USDA\" if you wish to pass in the food's FoodData Central ID (fdc_id)._  __Example #1:__ 15  __Resources:__ [Find branded food IDs](https://chompthis.com/api/lookup.php) ",required=true) @QueryParam("id") Integer id
,@Parameter(description = "Specify the data source (optional).  You must pass in \"USDA\" if you want to look up a food item using a USDA FDC ID.  __Example:__ USDA _(defaults to \"Chomp\")_ ") @QueryParam("source") String source
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.foodBrandedIdPhpGet(id,source,securityContext);
    }
    @GET
    @Path("/branded/name.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a branded food item by name", description = "# Search for branded food items by name.  __Example:__ ```https://chompthis.com/api/v2/food/branded/name.php?api_key=API_KEY&name=NAME``` ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "__Valid__ - Will return an object containing any matching foods.", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        
        @ApiResponse(responseCode = "400", description = "__Validation error__ - Invalid parameters or request."),
        
        @ApiResponse(responseCode = "401", description = "__Unauthorized__ - Invalid API key or usage limits exceeded. _[More information](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)_"),
        
        @ApiResponse(responseCode = "403", description = "__Forbidden__ - Disallowed entity."),
        
        @ApiResponse(responseCode = "404", description = "__Not found__ - No food items exist that match your query parameters."),
        
        @ApiResponse(responseCode = "500", description = "__Server error__ - Internal server error, request failed, or base error. _[Contact us](https://chompthis.com/api/ticket-new.php) if you see this._") })
    public Response foodBrandedNamePhpGet(@Parameter(description = "Branded food name  __Example:__ Starburst  __Resources:__ [Find branded food names](https://chompthis.com/api/lookup.php) ",required=true) @QueryParam("name") String name
,@Parameter(description = "Set maximum number of records you want the API to return.  ___Note:__ The maximum value is 10._  __Example:__ 3 _(defaults to 10)_ ", schema=@Schema(allowableValues={ "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" })
) @QueryParam("limit") Integer limit
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.foodBrandedNamePhpGet(name,limit,securityContext);
    }
    @GET
    @Path("/branded/search.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get data for branded food items using various search parameters", description = "# Search for branded food items using various parameters.  __Example:__ ```https://chompthis.com/api/v2/food/branded/search.php?api_key=API_KEY&brand=BRAND&country=COUNTRY&page=1```  ___Tip:__ Get started by using the [Query Builder](https://chompthis.com/api/build.php)._ ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "__Valid__ - Will return an object containing any matching foods.", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        
        @ApiResponse(responseCode = "400", description = "__Validation error__ - Invalid parameters or request."),
        
        @ApiResponse(responseCode = "401", description = "__Unauthorized__ - Invalid API key or usage limits exceeded. _[More information](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)_"),
        
        @ApiResponse(responseCode = "403", description = "__Forbidden__ - Disallowed entity."),
        
        @ApiResponse(responseCode = "404", description = "__Not found__ - No food items exist that match your query parameters."),
        
        @ApiResponse(responseCode = "500", description = "__Server error__ - Internal server error, request failed, or base error. _[Contact us](https://chompthis.com/api/ticket-new.php) if you see this._") })
    public Response foodBrandedSearchPhpGet(@Parameter(description = "Specify a required allergen ingredient (optional)  __Example__: Peanuts  __Resources__: [List of allergens](https://chompthis.com/api/data/allergen.php) ") @QueryParam("allergen") String allergen
,@Parameter(description = "Specify a required brand (optional)  __Example__: Starbucks  __Resources__: [List of brands](https://chompthis.com/api/data/brand.php) ") @QueryParam("brand") String brand
,@Parameter(description = "Specify a required category (optional)  __Example__: Pasta Dishes  __Resources__: [List of categories](https://chompthis.com/api/data/category.php) ") @QueryParam("category") String category
,@Parameter(description = "Specify a required country (optional)  __Example__: United States  __Resources__: [List of countries](https://chompthis.com/api/data/country.php) ") @QueryParam("country") String country
,@Parameter(description = "Specify a required diet (optional)  _Filters the search to only include food items that are considered compatible with the following diets: Vegan, Vegetarian, Gluten Free_  __Example__: Gluten Free  __Resources__: [List of diets](https://chompthis.com/api/data/lifestyle.php) ") @QueryParam("diet") String diet
,@Parameter(description = "Specify a required ingredient (optional)  __Example__: Salt  __Resources__: [List of ingredients](https://chompthis.com/api/data/ingredient.php) ") @QueryParam("ingredient") String ingredient
,@Parameter(description = "Specify a required keyword (optional)  __Example__: Starbucks  __Resources__: [List of brands](https://chompthis.com/api/data/brand.php) ") @QueryParam("keyword") String keyword
,@Parameter(description = "Specify a required mineral (optional)  __Example__: Potassium  __Resources__: [List of minerals](https://chompthis.com/api/data/mineral.php) ") @QueryParam("mineral") String mineral
,@Parameter(description = "Specify a required nutrition label item (optional)  __Example__: Caffeine  __Resources__: [List of nutrition label items](https://chompthis.com/api/data/nutrition.php) ") @QueryParam("nutrient") String nutrient
,@Parameter(description = "Specify a required palm oil ingredient (optional)  __Example__: E160a Beta Carotene  __Resources__: [List of palm oil ingredients](https://chompthis.com/api/data/palm-oil.php) ") @QueryParam("palm_oil") String palmOil
,@Parameter(description = "Specify a required trace ingredient (optional)  __Example__: Tree Nuts  __Resources__: [List of trace ingredients](https://chompthis.com/api/data/trace.php) ") @QueryParam("trace") String trace
,@Parameter(description = "Specify a required vitamin (optional)  __Example__: Biotin  __Resources__: [List of vitamins](https://chompthis.com/api/data/vitamin.php) ") @QueryParam("vitamin") String vitamin
,@Parameter(description = "Set maximum number of records you want the API to return.  ___Note:__ The maximum value is 10._  __Example:__ 3 _(defaults to 10)_ ", schema=@Schema(allowableValues={ "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" })
) @QueryParam("limit") Integer limit
,@Parameter(description = "Specify the search response page number.  _Each page will contain up to 10 items._  __Example__: 1 _(default)_ ") @QueryParam("page") Integer page
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.foodBrandedSearchPhpGet(allergen,brand,category,country,diet,ingredient,keyword,mineral,nutrient,palmOil,trace,vitamin,limit,page,securityContext);
    }
    @GET
    @Path("/ingredient/search.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get raw/generic food ingredient item(s)", description = "# Get data for a specific ingredient or a specific set of ingredients.  __Example:__ ```https://chompthis.com/api/v2/ingredient/search.php?api_key=API_KEY&find=STRING/LIST&list=BOOLEAN&raw=BOOLEAN``` ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "__Valid__ - Will return an object containing any matching ingredient foods.", content = @Content(schema = @Schema(implementation = IngredientObject.class))),
        
        @ApiResponse(responseCode = "400", description = "__Validation error__ - Invalid parameters or request."),
        
        @ApiResponse(responseCode = "401", description = "__Unauthorized__ - Invalid API key or usage limits exceeded. _[More information](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)_"),
        
        @ApiResponse(responseCode = "403", description = "__Forbidden__ - Disallowed entity."),
        
        @ApiResponse(responseCode = "404", description = "__Not found__ - No food items exist that match your query parameters."),
        
        @ApiResponse(responseCode = "500", description = "__Server error__ - Internal server error, request failed, or base error. _[Contact us](https://chompthis.com/api/ticket-new.php) if you see this._") })
    public Response foodIngredientSearchPhpGet(@Parameter(description = "Specify the ingredient name(s).  __Example #1:__ broccoli  __Example #2:__ broccoli,cauliflower,spinach  ___Important Note:__ Set the \"is_list\" parameter to true before passing in a comma-separated list of ingredients._ ",required=true) @QueryParam("find") Integer find
,@Parameter(description = "Specify if you are searching for multiple ingredients.  _Setting this to true will configure this endpoint so that it accepts a comma-separated list of ingredients._  _By default, this endpoint expects a single ingredient._  __Example:__ true _(defaults to false)_ ",required=true) @QueryParam("list") Boolean list
,@Parameter(description = "Specify if you only want data for raw ingredients.  __Example:__ true _(defaults to true)_ ") @QueryParam("raw") Boolean raw
,@Parameter(description = "Set maximum number of records you want the API to return.  ___Important Note:__ Setting this to \"1\" will return 1 record per search term._  __Example:__ 1 _(defaults to 1, max is 3)_ ", schema=@Schema(allowableValues={ "1", "2", "3" })
) @QueryParam("limit") Integer limit
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.foodIngredientSearchPhpGet(find,list,raw,limit,securityContext);
    }
}
