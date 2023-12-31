package Test;
import com.tngtech.java.junit.dataprovider.*;
import static io.restassured.RestAssured.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.hamcrest.Matchers.equalTo;

@RunWith(DataProviderRunner.class)
public class GET_User_Data extends Setup{

    @DataProvider
    public static Object[][] usernames() {
        return new Object[][] {
                { "theUser" , "John"},
                { "hadel" , "Heba" },
                { "jadel" , "Janna" }
        };
    }

    @Test
    @UseDataProvider("usernames")
    public void CheckFirstNameInResponse(String username, String expectedFirstName){
        given().
                spec(requestSpec).
                pathParam("username", username).
        when().
                get("{username}").
        then().
                spec(responseSpec).
        and().
                assertThat().
                body("firstName", equalTo(expectedFirstName));
    }
}
