package Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.junit.Test;

public class POST_New_User extends Setup {

    @Test
    public void CheckCreateNewUserResponse()
    {
        JSONObject userData = new JSONObject();
        userData.put("id", 1);
        userData.put("username", "hadel");
        userData.put("firstName", "Heba");
        userData.put("lastName", "Adel");
        userData.put("email", "hadel@test.com");
        userData.put("password", "1234");
        userData.put("phone", "1234");
        userData.put("userStatus", 1);

        given().
                spec(requestSpec).
                contentType(ContentType.JSON).
                body(userData).
                log().all().
        when().
                post("").
        then().
                spec(responseSpec);
    }
}
