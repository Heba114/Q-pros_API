package Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.BeforeClass;

public class Setup {

    public static RequestSpecification requestSpec;
    public static ResponseSpecification responseSpec;

    @BeforeClass
    public static void createRequestSpecification() {

        requestSpec = new RequestSpecBuilder().
                setBaseUri("https://petstore3.swagger.io/api/v3/user").
                addHeader("Content-Type", "application/json").
                build();
    }

    @BeforeClass
    public static void createResponseSpecification(){
        responseSpec = new ResponseSpecBuilder().
                expectStatusCode(200).
                build();
    }
}
