package lesson4.vk;

import org.asynchttpclient.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class VideoViewingsTest extends AbstractPageTest{

	  @BeforeEach
	  void setUp() {
			System.out.println(" ");
			System.out.println("Start running tests");
	  }

	  @Test
	  @Order(1)
	  void Click_to_record() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Click to record")
				.get(getVkURL()+"?query=Click to record").prettyPeek()
				.then()
				.assertThat().statusCode(200)
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Click to record"));
	  }

	  @Test
	  @Order(2)
	  void Video_viewing() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Video viewing")
				.get(getVkURL()+"?query=Video viewing").prettyPeek()
				.then()
				.assertThat().statusCode(200)
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Video viewing"));
	  }
}
