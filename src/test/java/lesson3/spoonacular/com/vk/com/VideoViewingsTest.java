package lesson3.spoonacular.com.vk.com;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class VideoViewingsTest extends AbstractPageTest {

	  @Test
	  @Order(1)
	  void Click_to_record() {
			given()
				.when()
				.get(getVkURL()+"?query=Click to record")
				.then()
				.statusCode(403);
	  }

	  @Test
	  @Order(2)
	  void Video_viewing() {
			given()
				.when()
				.get(getVkURL()+"?query=Video viewing")
				.then()
				.statusCode(403);
	  }
}
