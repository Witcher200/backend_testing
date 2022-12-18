package lesson3.spoonacular.com.vk.com;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class Community_Subscription extends AbstractPageTest{

	  @Test
	  @Order(1)
	  void Go_to_the_games_section() {
			given()
				.when()
				.get(getVkURL()+"?query=Go to the games section")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(2)
	  void Click_on_history() {
			given()
				.when()
				.get(getVkURL()+"?query=Click on the game Hedgehogs")
				.then()
				.statusCode(200);
	  }
}
