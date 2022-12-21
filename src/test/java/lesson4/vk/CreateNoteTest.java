package lesson4.vk;

import org.asynchttpclient.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class CreateNoteTest extends AbstractPageTest{

	  @BeforeEach
	  void setUp() {
			System.out.println(" ");
			System.out.println("Start running tests");
	  }

	  @Test
	  @Order(1)
	  void Here_you_need_to_write_title() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Here you need to write a title")
				.get(getVkURL()+"?query=Here you need to write a title").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Here you need to write a title"));
	  }

	  @Test
	  @Order(2)
	  void Here_you_need_to_write_text() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Here you need to write tex")
				.get(getVkURL()+"?query=Here you need to write tex").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Here you need to write tex"));
	  }

	  @Test
	  @Order(3)
	  void Click_on_the_publish_button() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Click on the publish button")
				.get(getVkURL()+"?query=Click on the publish button").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Click on the publish button"));
	  }

	  @Test
	  @Order(4)
	  void The_article_will_be_saved_and_available_at_link() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "The article will be saved and available at the link:")
				.get(getVkURL()+"?query=The article will be saved and available at the link:").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("The article will be saved and available at the link:"));
	  }

	  @Test
	  @Order(5)
	  void Click_on_save_button() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Click on save button")
				.get(getVkURL()+"?query=Click on save button").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Click on save button"));
	  }
}
