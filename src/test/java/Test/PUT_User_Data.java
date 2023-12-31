package Test;

import Data.User;
import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PUT_User_Data extends Setup{

    @Test
    public void CheckUpdateUserResponse()
    {
        User user = new User();
        given().
                spec(requestSpec).
                pathParam("username", "jadel").
                contentType(ContentType.JSON).
                body(user).
                log().all().
        when().
                put("{username}").
        then().
                spec(responseSpec).
        and().
                assertThat().
                body("email", equalTo("janna@test.com"));
    }
}
