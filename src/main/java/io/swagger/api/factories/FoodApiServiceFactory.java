package io.swagger.api.factories;

import io.swagger.api.FoodApiService;
import io.swagger.api.impl.FoodApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-01-23T13:12:53.239Z[GMT]")public class FoodApiServiceFactory {
    private final static FoodApiService service = new FoodApiServiceImpl();

    public static FoodApiService getFoodApi() {
        return service;
    }
}
