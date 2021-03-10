package io.swagger.api.factories;

import io.swagger.api.RecipeApiService;
import io.swagger.api.impl.RecipeApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-03-09T22:27:18.219Z[GMT]")public class RecipeApiServiceFactory {
    private final static RecipeApiService service = new RecipeApiServiceImpl();

    public static RecipeApiService getRecipeApi() {
        return service;
    }
}
