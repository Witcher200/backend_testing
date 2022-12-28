package lesson4.vk;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class VideoViewingsTest extends AbstractPageTest {

	  @BeforeEach
	  void setUp() {
			System.out.println(" ");
			System.out.println("Start running tests");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();

			responseSpecification = new ResponseSpecBuilder()
				.expectStatusCode(404)
				.expectStatusLine("HTTP/1.1 404 Not Found")
				.expectResponseTime(Matchers.lessThan(5000L))
				.build();

			requestSpecification = new RequestSpecBuilder()
				.addQueryParam("limitLicense", true)
				.addQueryParam("user_ides", 272300066)
				.addQueryParam("access_token", "vk1.a.Eugk_qW0_GoB124t1iG6zjM_hfe7GF50_f1v_V97BY-lW7B3bq-gTubaZp3JdWB2bWpCn_wL6MjWEATUPWPYjVCOLc" +
					"GR9GqxdOHm1RJnWvGITDSRn17Y2wpY7ZWvAUAlNvagWcW7ls9DwaAKgJTERYZtE4ctdjTqrVbQZ023L7zc1_n4WkxivVcmk_2dW4WNllmeHyJP0riAwsfOim68Q")
				.addQueryParam("v", 5.131)
				.build();
	  }

	  @Test
	  @Order(1)
	  void Click_to_record() {
			given()
				.expect()
				.when()
				.post(getVkURL()+"Click to record");
	  }

	  @Test
	  @Order(2)
	  void Video_viewing() {
			given()
				.expect()
				.when()
				.post(getVkURL()+"Video viewing");
	  }
}
