package lesson3.spoonacular.com.vk.com;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class CreateNoteTest extends AbstractPageTest{

	  @Test
	  @Order(1)
	  void Here_you_need_to_write_title() {
			given()
				.when()
				.get(getVkURL()+"?z=article_edit272300066_0?query=Here you need to write a title")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(2)
	  void Here_you_need_to_write_text() {
			given()
				.when()
				.get(getVkURL()+"?z=article_edit272300066_0?query=Here you need to write tex")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(3)
	  void Click_on_the_publish_button() {
			given()
				.when()
				.get(getVkURL()+"?z=article_edit272300066_0?query=Click on the publish button")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(4)
	  void The_article_will_be_saved_and_available_at_link() {
			given()
				.when()
				.get(getVkURL()+"?z=article_edit272300066_0query=The article will be saved and available at the link:")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(5)
	  void Click_on_save_button() {
			given()
				.when()
				.get(getVkURL()+"?z=article_edit272300066_0?query=Click on save button")
				.then()
				.statusCode(200);
	  }
}