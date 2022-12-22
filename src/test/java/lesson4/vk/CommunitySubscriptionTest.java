package lesson4.vk;

import org.asynchttpclient.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class CommunitySubscriptionTest extends AbstractPageTest{

	  @BeforeEach
	  void setUp() {
			System.out.println(" ");
			System.out.println("Start running tests");
	  }

	  @Test
	  @Order(1)
	  void Go_to_the_games_sectionTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Go to the games section")
				.get(getVkURL()+"?query=Go to the games section").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Go to the games section"));
	  }

	  @Test
	  @Order(2)
	  void Click_on_the_game_HedgehogsTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Click on the game Hedgehogs")
				.get(getVkURL()+"?query=Click on the game Hedgehogs").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Click on the game Hedgehogs"));
	  }
}
