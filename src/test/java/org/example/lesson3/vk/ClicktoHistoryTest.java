package org.example.lesson3.vk;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class ClicktoHistoryTest extends AbstractPageTest {

	  @BeforeEach
	  void setUp() {
			System.out.println(" ");
			System.out.println("Start running tests");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	  }

	  @Test
	  @Order(1)
	  void Click_on_history() {
			given()
				.log()
				.all()
				.when()
				.get(getVkURL()+"?query=Click on history")
				.then()
				.statusCode(403);
	  }
}
