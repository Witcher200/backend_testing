package lesson3.spoonacular;

import io.restassured.RestAssured;
import org.junit.jupiter.api.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;

public class ActionTest extends AbstractPageTest {

	  @BeforeEach
	  void setUp() {
			System.out.println(" ");
			System.out.println("Start running tests");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	  }

	  @Test
	  @Order(1)
	  void Click_on_MealPlannerTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.expect()
				.when()
				.get(getMealURL()+"?query=MealPlanner&number=28&limitLicense=true")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(2)
	  void Click_in_plusTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.expect()
				.when()
				.get(getPlusURL()+"?query=plus&limitLicense=true	")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(3)
	  void Search_boxTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.expect()
				.when()
				.get(getMealURL()+"?query=search&limitLicense=true")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(4)
	  void Click_in_pictureTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.expect()
				.when()
				.get(getMealURL()+"?query=picture&limitLicense=true")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(5)
	  void Click_on_delete_recipesTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.expect()
				.when()
				.get(getMealURL()+"?query=delit_resipes&limitLicense=true")
				.then()
				.statusCode(200);
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

