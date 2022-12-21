package lesson3.vk;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class CommunitySubscriptionTest extends AbstractPageTest {

	  @BeforeEach
	  void setUp() {
			System.out.println(" ");
			System.out.println("Start running tests");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	  }

	  @Test
	  @Order(1)
	  void Go_to_the_games_section() {
			given()
				.log()
				.all()
				.when()
				.get(getVkURL()+"?query=Go to the games section")
				.then()
				.statusCode(403);
	  }

	  @Test
	  @Order(2)
	  void Click_on_the_game_Hedgehogs() {
			given()
				.log()
				.all()
				.when()
				.get(getVkURL()+"?query=Click on the game Hedgehogs")
				.then()
				.statusCode(403);
	  }
}
