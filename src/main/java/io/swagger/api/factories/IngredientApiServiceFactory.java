package io.swagger.api.factories;

import io.swagger.api.IngredientApiService;
import io.swagger.api.impl.IngredientApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-01-18T04:55:10.866Z[GMT]")public class IngredientApiServiceFactory {
    private final static IngredientApiService service = new IngredientApiServiceImpl();

    public static IngredientApiService getIngredientApi() {
        return service;
    }
}
