package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.IngredientApiService;
import io.swagger.api.factories.IngredientApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

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


@Path("/ingredient")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-01-18T16:48:43.301Z[GMT]")public class IngredientApi  {
   private final IngredientApiService delegate;

   public IngredientApi(@Context ServletConfig servletContext) {
      IngredientApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("IngredientApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (IngredientApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = IngredientApiServiceFactory.getIngredientApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/search.php")
    
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
    public Response ingredientSearchPhpGet(@Parameter(description = "Specify the ingredient name(s).  __Example #1:__ broccoli  __Example #2:__ broccoli,cauliflower,spinach  ___Important Note:__ Set the \"is_list\" parameter to true before passing in a comma-separated list of ingredients._ ",required=true) @QueryParam("find") Integer find
,@Parameter(description = "Specify if you are searching for multiple ingredients.  _Setting this to true will configure this endpoint so that it accepts a comma-separated list of ingredients._  _By default, this endpoint expects a single ingredient._  __Example:__ true _(defaults to false)_ ",required=true) @QueryParam("list") Boolean list
,@Parameter(description = "Specify if you only want data for raw ingredients.  __Example:__ true _(defaults to true)_ ") @QueryParam("raw") Boolean raw
,@Parameter(description = "Set maximum number of records you want the API to return.  ___Important Note:__ Setting this to \"1\" will return 1 record per search term._  __Example:__ 1 _(defaults to 1, max is 3)_ ", schema=@Schema(allowableValues={ "1", "2", "3" })
) @QueryParam("limit") Integer limit
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.ingredientSearchPhpGet(find,list,raw,limit,securityContext);
    }
}
