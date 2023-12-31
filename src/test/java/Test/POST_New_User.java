package Test;
import Data.User;

import io.restassured.http.ContentType;
import com.tngtech.java.junit.dataprovider.*;
import static io.restassured.RestAssured.*;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import static org.hamcrest.Matchers.equalTo;

@RunWith(DataProviderRunner.class)
public class POST_New_User extends Setup {

    @Test
    public void CheckCreateNewUserResponse()
    {
        User user = new User();
        given().
                spec(requestSpec).
                contentType(ContentType.JSON).
                body(user).
                log().all().
        when().
                post("").
        then().
                spec(responseSpec).
        and().
                assertThat().
                body("email", equalTo("janna@test.com"));
    }
}
