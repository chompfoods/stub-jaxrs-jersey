package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.RecipeApiService;
import io.swagger.api.factories.RecipeApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.RecipeObject;

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


@Path("/recipe")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-03-09T22:27:18.219Z[GMT]")public class RecipeApi  {
   private final RecipeApiService delegate;

   public RecipeApi(@Context ServletConfig servletContext) {
      RecipeApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("RecipeApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (RecipeApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = RecipeApiServiceFactory.getRecipeApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/id.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a recipe by ID", description = "## Get a specific recipe using an ID.  **You must have a Recipe API key to use this endpoint.** Get a [Recipe API key](https://chompthis.com/api/recipes/).  **Example** > ```https://chompthis.com/api/v2/recipe/id.php?api_key=API_KEY&id=RECIPE_ID``` ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching recipes.  ", content = @Content(schema = @Schema(implementation = RecipeObject.class))),
        
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items were found. "),
        
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public Response recipeIdPhpGet(@Parameter(in = ParameterIn.QUERY, description = "#### A recipe ID. Recipe IDs are exposed in the /recipe/search and /recipe/ingredient endpoints.  **Example** > ```&list=tdm_1143_0459d0028fcf8990724785b9e6775037``` ",required=true) @QueryParam("id") String id
,@Parameter(in = ParameterIn.QUERY, description = "#### **Only required for Premium subscribers.** The unique identifier assigned to each user on your platform. This can be any string of letters or numbers and doesn't have to relate to your own database. [Learn more](https://desk.zoho.com/portal/chompthis/en/kb/articles/monthly-active-users)  **Example** > ```&user_id=fehef8w4ha``` ") @QueryParam("user_id") String userId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.recipeIdPhpGet(id,userId,securityContext);
    }
    @GET
    @Path("/ingredient.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get recipes using a list of ingredients", description = "## Get recipes that include all ingredients from a list.  **You must have a Recipe API key to use this endpoint.** Get a [Recipe API key](https://chompthis.com/api/recipes/).  **Example #1** > ```https://chompthis.com/api/v2/recipe/ingredient.php?api_key=API_KEY&list=INGREDIENT```  **Example #2** > ```https://chompthis.com/api/v2/recipe/ingredient.php?api_key=API_KEY&list=INGREDIENT,INGREDIENT,INGREDIENT``` ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching recipes.  ", content = @Content(schema = @Schema(implementation = RecipeObject.class))),
        
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items were found. "),
        
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public Response recipeIngredientPhpGet(@Parameter(in = ParameterIn.QUERY, description = "#### A single ingredient, or a comma-separated list of up to 3 ingredients. Recipes with each of these ingredients will be returned. **You can pass in up to 3 ingredients at a time.**  **Example** > ```&list=cheese,tomato,milk``` ",required=true) @QueryParam("list") String list
,@Parameter(in = ParameterIn.QUERY, description = "#### Set maximum number of records you want the API to return. The default value is \"**3**.\"  **Example** > ```&limit=3``` ", schema=@Schema(allowableValues={ "1", "2", "3" })
) @QueryParam("limit") Integer limit
,@Parameter(in = ParameterIn.QUERY, description = "#### This is how you paginate the search result. By default, you will see the first 3 records. You must increment the page number to access the next 3 records, and so on. The default value is \"**1**.\"  **Example** > ```&page=1``` ") @QueryParam("page") Integer page
,@Parameter(in = ParameterIn.QUERY, description = "#### **Only required for Premium subscribers.** The unique identifier assigned to each user on your platform. This can be any string of letters or numbers and doesn't have to relate to your own database. [Learn more](https://desk.zoho.com/portal/chompthis/en/kb/articles/monthly-active-users)  **Example** > ```&user_id=fehef8w4ha``` ") @QueryParam("user_id") String userId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.recipeIngredientPhpGet(list,limit,page,userId,securityContext);
    }
    @GET
    @Path("/random.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get random popular recipes", description = "## Get random recipes that have instructions and nutrients  **You must have a Recipe API key to use this endpoint.** Get a [Recipe API key](https://chompthis.com/api/recipes/).  **Example** > ```https://chompthis.com/api/v2/recipe/random.php?api_key=API_KEY``` ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching recipes.  ", content = @Content(schema = @Schema(implementation = RecipeObject.class))),
        
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items were found. "),
        
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public Response recipeRandomPhpGet(@Parameter(in = ParameterIn.QUERY, description = "#### Set maximum number of records you want the API to return. The default value is \"**5**.\"  **Example** > ```&limit=5``` ", schema=@Schema(allowableValues={ "1", "2", "3", "4", "5" })
) @QueryParam("limit") Integer limit
,@Parameter(in = ParameterIn.QUERY, description = "#### **Only required for Premium subscribers.** The unique identifier assigned to each user on your platform. This can be any string of letters or numbers and doesn't have to relate to your own database. [Learn more](https://desk.zoho.com/portal/chompthis/en/kb/articles/monthly-active-users)  **Example** > ```&user_id=fehef8w4ha``` ") @QueryParam("user_id") String userId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.recipeRandomPhpGet(limit,userId,securityContext);
    }
    @GET
    @Path("/search.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get recipes using a title and optional filters", description = "## Get recipes using a title and optional filters.  **You must have a Recipe API key to use this endpoint.** Get a [Recipe API key](https://chompthis.com/api/recipes/).  **Example**  > ```https://chompthis.com/api/v2/recipe/search.php?api_key=API_KEY&title=TITLE``` ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching recipes.  ", content = @Content(schema = @Schema(implementation = RecipeObject.class))),
        
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items were found. "),
        
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public Response recipeSearchPhpGet(@Parameter(in = ParameterIn.QUERY, description = "#### A recipe title  **Example** > ```&title=Banana Bread``` ",required=true) @QueryParam("title") String title
,@Parameter(in = ParameterIn.QUERY, description = "#### A specific cuisine you want excluded from results  **Example** > ```&excluded_cuisine=Italian``` ") @QueryParam("excluded_cuisine") String excludedCuisine
,@Parameter(in = ParameterIn.QUERY, description = "#### A specific cuisine you want included in results  **Example** > ```&included_cuisine=Chinese``` ") @QueryParam("included_cuisine") String includedCuisine
,@Parameter(in = ParameterIn.QUERY, description = "#### Recipes with this ingredient will be excluded from results  **Example** > ```&excluded_ingredient=egg``` ") @QueryParam("excluded_ingredient") String excludedIngredient
,@Parameter(in = ParameterIn.QUERY, description = "#### Only recipes with this ingredient will be returned  **Example** > ```&included_ingredient=apple``` ") @QueryParam("included_ingredient") String includedIngredient
,@Parameter(in = ParameterIn.QUERY, description = "#### Optionally require all recipes to include nutrition info. Recipes with, or without, nutrition info are returned by default.  **Example** > ```&nutrients_required=1``` ", schema=@Schema(allowableValues={ "1", "0" })
) @QueryParam("nutrients_required") Integer nutrientsRequired
,@Parameter(in = ParameterIn.QUERY, description = "#### Set maximum number of records you want the API to return. The default value is \"**5**.\"  **Example** > ```&limit=3``` ", schema=@Schema(allowableValues={ "1", "2", "3", "4", "5" })
) @QueryParam("limit") Integer limit
,@Parameter(in = ParameterIn.QUERY, description = "#### This is how you paginate the search result. By default, you will see the first 5 records. You must increment the page number to access the next 5 records, and so on. The default value is \"**1**.\"  **Example** > ```&page=1``` ") @QueryParam("page") Integer page
,@Parameter(in = ParameterIn.QUERY, description = "#### **Only required for Premium subscribers.** The unique identifier assigned to each user on your platform. This can be any string of letters or numbers and doesn't have to relate to your own database. [Learn more](https://desk.zoho.com/portal/chompthis/en/kb/articles/monthly-active-users)  **Example** > ```&user_id=fehef8w4ha``` ") @QueryParam("user_id") String userId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.recipeSearchPhpGet(title,excludedCuisine,includedCuisine,excludedIngredient,includedIngredient,nutrientsRequired,limit,page,userId,securityContext);
    }
}
