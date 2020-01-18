package io.swagger.api.factories;

import io.swagger.api.IngredientApiService;
import io.swagger.api.impl.IngredientApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-01-18T16:45:46.877Z[GMT]")public class IngredientApiServiceFactory {
    private final static IngredientApiService service = new IngredientApiServiceImpl();

    public static IngredientApiService getIngredientApi() {
        return service;
    }
}
