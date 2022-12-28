package lesson4.spoonacular;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;
import static io.restassured.RestAssured.*;

public class ActionTest extends AbstractPageTest {

	  @BeforeEach
	  void setUp() {
			System.out.println(" ");
			System.out.println("Start running tests");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();

			responseSpecification = new ResponseSpecBuilder()
				.expectStatusCode(200)
				.expectStatusLine("HTTP/1.1 200 OK")
				.expectResponseTime(Matchers.lessThan(5000L))
				.build();

			requestSpecification = new RequestSpecBuilder()
				.addQueryParam("apiKey", getSponacularAPI())
				.addQueryParam("limitLicense", true)
				.log(LogDetail.ALL)
				.build();
	  }

	  @Test
	  @Order(1)
	  void Click_on_MealPlannerTest() {
			given()
				.expect()
				.when()
				.get(getMealURL()+"?query=MealPlanner&number=28&limitLicense=true");
	  }

	  @Test
	  @Order(2)
	  void Click_in_plusTest() {
			given()
				.expect()
				.when()
				.get(getPlusURL()+"?query=plus&limitLicense=true");
	  }

	  @Test
	  @Order(3)
	  void Search_boxTest() {
			given()
				.expect()
				.when()
				.get(getMealURL()+"?query=search&limitLicense=true");
	  }

	  @Test
	  @Order(4)
	  void Click_in_pictureTest() {
			given()
				.expect()
				.when()
				.get(getMealURL()+"?query=picture&limitLicense=true");
	  }

	  @Test
	  @Order(5)
	  void Click_on_delete_recipesTest() {
			given()
				.expect()
				.when()
				.get(getMealURL()+"?query=delit_resipes&limitLicense=true");
	  }

	  @AfterAll
	  static void cleanUp() {
			System.out.println("After All cleanUp() method called");
	  }

	  @AfterEach
	  void tearDown() {
			System.out.println("End of test execution");
			System.out.println(" ");
	  }
}


