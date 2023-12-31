package Test;
import Test.Setup;
import Data.User;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import org.junit.runner.RunWith;

import static io.restassured.RestAssured.given;

@RunWith(DataProviderRunner.class)
public class DELETE_User extends Setup {

    @Test
    public void CheckDeleteResponse(){
        User user = new User();
        //Step 1 : POST new user data
        Response response =
        given().
                spec(requestSpec).
                contentType(ContentType.JSON).
                body(user).log().all().
        when().
                post("");

        //Step 2 : Get username of the new added user
        String usernameAdded = response.jsonPath().get("username");

        //Step 3 : Delete user using username
        given().
                spec(requestSpec).
                pathParam("username", usernameAdded).
                contentType(ContentType.JSON).
        when().
                delete("{username}").
        then().
                spec(responseSpec).log().all();
    }
}
