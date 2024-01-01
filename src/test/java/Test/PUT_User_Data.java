package Test;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PUT_User_Data extends Setup{

    @Test
    public void CheckUpdateUserResponse()
    {
        JSONObject userData = new JSONObject();
        userData.put("id", 1);
        userData.put("username", "hadel");
        userData.put("firstName", "Janna");
        userData.put("lastName", "Ibrahim");
        userData.put("email", "jana@test.com");
        userData.put("password", "2323");
        userData.put("phone", "2323");
        userData.put("userStatus", 1);
        given().
                spec(requestSpec).
                pathParam("username", "heba").
                contentType(ContentType.JSON).
                body(userData).
                log().all().
        when().
                put("{username}").
        then().
                spec(responseSpec);
    }
}
