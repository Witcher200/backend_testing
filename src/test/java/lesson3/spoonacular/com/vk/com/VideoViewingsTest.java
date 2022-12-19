package lesson3.spoonacular.com.vk.com;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class VideoViewingsTest extends AbstractPageTest {

	  @BeforeEach
	  void setUp() {
			System.out.println(" ");
			System.out.println("Start running tests");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	  }

	  @Test
	  @Order(1)
	  void Click_to_record() {
			given()
				.log()
				.all()
				.when()
				.get(getVkURL()+"?query=Click to record")
				.then()
				.statusCode(403);
	  }

	  @Test
	  @Order(2)
	  void Video_viewing() {
			given()
				.log()
				.all()
				.when()
				.get(getVkURL()+"?query=Video viewing")
				.then()
				.statusCode(403);
	  }
}
