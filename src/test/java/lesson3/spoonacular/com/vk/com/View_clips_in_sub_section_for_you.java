package lesson3.spoonacular.com.vk.com;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class View_clips_in_sub_section_for_you extends AbstractPageTest{

	  @Test
	  @Order(1)
	  void Opening_clips_section() {
			given()
				.when()
				.get(getVkURL()+"?query=Opening clips section")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(2)
	  void Click_on_date() {
			given()
				.when()
				.get(getVkURL()+"?query=Click on date&tes")
				.then()
				.statusCode(200);
	  }
}
