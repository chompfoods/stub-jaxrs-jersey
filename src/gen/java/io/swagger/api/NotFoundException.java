package io.swagger.api;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-01-27T21:18:02.311Z[GMT]")public class NotFoundException extends ApiException {
    private int code;
    public NotFoundException (int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}
