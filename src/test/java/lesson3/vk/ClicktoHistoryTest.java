package lesson3.vk;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class ClicktoHistoryTest extends AbstractPageTest {

	  @BeforeEach
	  void setUp() {
			System.out.println(" ");
			System.out.println("Start running tests");
			/*RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();*/
	  }

	  @Test
	  @Order(1)
	  void Click_on_historyTest() {
			given()
				.log()
				.all()
				.queryParam("limitLicense", true)
				.queryParam("user_ides", 272300066)
				.queryParam("query", "Click to history")
				.queryParam("access_token", "vk1.a.Eugk_qW0_GoB124t1iG6zjM_hfe7GF50_f1v_V97BY-lW7B3bq-gTubaZp3JdWB2bWpCn_wL6MjWEATUPWPYjVCOLc" +
					"GR9GqxdOHm1RJnWvGITDSRn17Y2wpY7ZWvAUAlNvagWcW7ls9DwaAKgJTERYZtE4ctdjTqrVbQZ023L7zc1_n4WkxivVcmk_2dW4WNllmeHyJP0riAwsfOim68Q")
				.queryParam("v", 5.131)
				.expect()
				.when()
				.get(getVkURL()+"Click to history")
				.then()
				.statusCode(404);
	  }
}