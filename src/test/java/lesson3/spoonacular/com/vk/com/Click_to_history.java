package lesson3.spoonacular.com.vk.com;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class Click_to_history extends AbstractPageTest{

	  @Test
	  @Order(1)
	  void Click_on_history() {
			given()
				.when()
				.get(getVkURL()+"?query=Click on history")
				.then()
				.statusCode(200);
	  }
}
