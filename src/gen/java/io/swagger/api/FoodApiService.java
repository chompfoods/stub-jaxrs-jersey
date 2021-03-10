package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.BrandedFoodObject;
import io.swagger.model.IngredientObject;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-03-09T22:27:18.219Z[GMT]")public abstract class FoodApiService {
    public abstract Response foodBrandedBarcodePhpGet( @NotNull String code, String userId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response foodBrandedNamePhpGet( @NotNull String name, Integer limit, Integer page, String userId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response foodBrandedSearchPhpGet( String allergen, String brand, String category, String country, String diet, String ingredient, String keyword, String mineral, String nutrient, String palmOil, String trace, String vitamin, Integer limit, Integer page, String userId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response foodIngredientSearchPhpGet( @NotNull String find, Integer limit, String userId,SecurityContext securityContext) throws NotFoundException;
}
