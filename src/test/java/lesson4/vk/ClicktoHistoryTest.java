package lesson4.vk;

import org.asynchttpclient.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class ClicktoHistoryTest extends AbstractPageTest{

	  @BeforeEach
	  void setUp() {
			System.out.println(" ");
			System.out.println("Start running tests");
	  }

	  @Test
	  @Order(1)
	  void Click_on_historyTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Click on history")
				.get(getVkURL()+"?query=Click on history").prettyPeek()
				.then()
				.assertThat().statusCode(200)
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Click on history"));
	  }
}
