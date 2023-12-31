package Test;

import io.restassured.http.ContentType;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class POST_ListOfUsers extends Setup{

    @Test
    public void PostListOfUsers(){
        Map<String , Object> user1 = new HashMap<>();
        user1.put("id", 1);
        user1.put("username", "samarr");
        user1.put("firstName", "Samar");
        user1.put("lastName", "Mohamed");
        user1.put("email", "smohamed@test.com");
        user1.put("password", "12345");
        user1.put("phone", "12345");
        user1.put("userStatus", 1);

        Map<String , Object> user2 = new HashMap<>();
        user2.put("id", 2);
        user2.put("username", "mariamm");
        user2.put("firstName", "Mariam");
        user2.put("lastName", "Mohamed");
        user2.put("email", "mmohamed@test.com");
        user2.put("password", "12345");
        user2.put("phone", "12345");
        user2.put("userStatus", 1);

        Map<String , Object> user3 = new HashMap<>();
        user3.put("id", 3);
        user3.put("username", "alaaa");
        user3.put("firstName", "Alaa");
        user3.put("lastName", "Helal");
        user3.put("email", "ahelel@test.com");
        user3.put("password", "12345");
        user3.put("phone", "12345");
        user3.put("userStatus", 1);


        List<Map<String, Object>> jsonArray = new ArrayList<>();
        jsonArray.add(user1);
        jsonArray.add(user2);
        jsonArray.add(user3);


        given().
                spec(requestSpec).
                contentType(ContentType.JSON).
                body(jsonArray).
                log().all().
        when().
                post("/createWithList").
        then().
                spec(responseSpec);
//        and().
//                assertThat().
//                statusCode(200);
    }

}
