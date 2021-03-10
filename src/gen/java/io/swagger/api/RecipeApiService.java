package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.RecipeObject;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-03-09T22:27:18.219Z[GMT]")public abstract class RecipeApiService {
    public abstract Response recipeIdPhpGet( @NotNull String id, String userId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response recipeIngredientPhpGet( @NotNull String list, Integer limit, Integer page, String userId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response recipeRandomPhpGet( Integer limit, String userId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response recipeSearchPhpGet( @NotNull String title, String excludedCuisine, String includedCuisine, String excludedIngredient, String includedIngredient, Integer nutrientsRequired, Integer limit, Integer page, String userId,SecurityContext securityContext) throws NotFoundException;
}
