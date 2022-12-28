package lesson3.vk;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class CreateNoteTest extends AbstractPageTest {

	  @BeforeEach
	  void setUp() {
			System.out.println(" ");
			System.out.println("Start running tests");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	  }

	  @Test
	  @Order(1)
	  void Here_you_need_to_write_titleTest() {
			given()
				.log()
				.all()
				.queryParam("limitLicense", true)
				.queryParam("user_ides", 272300066)
				.queryParam("query", "Here you need to write a title")
				.queryParam("access_token", "vk1.a.Eugk_qW0_GoB124t1iG6zjM_hfe7GF50_f1v_V97BY-lW7B3bq-gTubaZp3JdWB2bWpCn_wL6MjWEATUPWPYjVCOLc" +
					"GR9GqxdOHm1RJnWvGITDSRn17Y2wpY7ZWvAUAlNvagWcW7ls9DwaAKgJTERYZtE4ctdjTqrVbQZ023L7zc1_n4WkxivVcmk_2dW4WNllmeHyJP0riAwsfOim68Q")
				.queryParam("v", 5.131)
				.expect()
				.when()
				.post(getVkURL()+"Here you need to write a title")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(2)
	  void Here_you_need_to_write_textTest() {
			given()
				.log()
				.all()
				.queryParam("limitLicense", true)
				.queryParam("user_ides", 272300066)
				.queryParam("query", "Here you need to write text")
				.queryParam("access_token", "vk1.a.Eugk_qW0_GoB124t1iG6zjM_hfe7GF50_f1v_V97BY-lW7B3bq-gTubaZp3JdWB2bWpCn_wL6MjWEATUPWPYjVCOLc" +
					"GR9GqxdOHm1RJnWvGITDSRn17Y2wpY7ZWvAUAlNvagWcW7ls9DwaAKgJTERYZtE4ctdjTqrVbQZ023L7zc1_n4WkxivVcmk_2dW4WNllmeHyJP0riAwsfOim68Q")
				.queryParam("v", 5.131)
				.expect()
				.when()
				.post(getVkURL()+"Here you need to write text")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(3)
	  void Click_on_the_publish_buttonTest() {
			given()
				.log()
				.all()
				.queryParam("limitLicense", true)
				.queryParam("user_ides", 272300066)
				.queryParam("query", "Click on the publish button")
				.queryParam("access_token", "vk1.a.Eugk_qW0_GoB124t1iG6zjM_hfe7GF50_f1v_V97BY-lW7B3bq-gTubaZp3JdWB2bWpCn_wL6MjWEATUPWPYjVCOLc" +
					"GR9GqxdOHm1RJnWvGITDSRn17Y2wpY7ZWvAUAlNvagWcW7ls9DwaAKgJTERYZtE4ctdjTqrVbQZ023L7zc1_n4WkxivVcmk_2dW4WNllmeHyJP0riAwsfOim68Q")
				.queryParam("v", 5.131)
				.expect()
				.when()
				.post(getVkURL()+"Click on the publish button")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(4)
	  void The_article_will_be_saved_and_available_at_linkTest() {
			given()
				.log()
				.all()
				.queryParam("limitLicense", true)
				.queryParam("user_ides", 272300066)
				.queryParam("query", "Click on the publish button")
				.queryParam("access_token", "vk1.a.Eugk_qW0_GoB124t1iG6zjM_hfe7GF50_f1v_V97BY-lW7B3bq-gTubaZp3JdWB2bWpCn_wL6MjWEATUPWPYjVCOLc" +
					"GR9GqxdOHm1RJnWvGITDSRn17Y2wpY7ZWvAUAlNvagWcW7ls9DwaAKgJTERYZtE4ctdjTqrVbQZ023L7zc1_n4WkxivVcmk_2dW4WNllmeHyJP0riAwsfOim68Q")
				.queryParam("v", 5.131)
				.expect()
				.when()
				.post(getVkURL()+"Click on the publish button")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(5)
	  void Click_on_save_buttonTest() {
			given()
				.log()
				.all()
				.queryParam("limitLicense", true)
				.queryParam("user_ides", 272300066)
				.queryParam("query", "Click on save button")
				.queryParam("access_token", "vk1.a.Eugk_qW0_GoB124t1iG6zjM_hfe7GF50_f1v_V97BY-lW7B3bq-gTubaZp3JdWB2bWpCn_wL6MjWEATUPWPYjVCOLc" +
					"GR9GqxdOHm1RJnWvGITDSRn17Y2wpY7ZWvAUAlNvagWcW7ls9DwaAKgJTERYZtE4ctdjTqrVbQZ023L7zc1_n4WkxivVcmk_2dW4WNllmeHyJP0riAwsfOim68Q")
				.queryParam("v", 5.131)
				.expect()
				.when()
				.post(getVkURL()+"Click on save button")
				.then()
				.statusCode(404);
	  }
}
