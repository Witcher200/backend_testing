package lesson4.spoonacular;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;

public class RecipesCuisineTest extends AbstractPageTest {

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
	  void Top_18_to_Grill_ChickenTes() {
			given()
				.expect()
				.when()
				.post(getRecipes_cuisine()+"?query=Top18&number=35&limitLicense=true#");
	  }

	  @Test
	  @Order(2)
	  void How_to_Make_ChillTest() {
			given()
				.expect()
				.when()
				.post(getRecipes_cuisine()+"?query=Make&number=28&limitLicense=true#");
	  }

	  @Test
	  @Order(3)
	  void Trying_the_Top_Rated_PastaTest() {
			given()
				.expect()
				.when()
				.post(getRecipes_cuisine()+"?query=Pasta&number=27&limitLicense=true#");
	  }

	  @Test
	  @Order(4)
	  void How_to_Make_Mug_CakeTest() {
			given()
				.expect()
				.when()
				.post(getRecipes_cuisine()+"?query=How to Make Mug Cake&limitLicense=true#");
	  }

	  @Test
	  @Order(5)
	  void How_Make_RossetesTest() {
			given()
				.expect()
				.when()
				.post(getRecipes_cuisine()+"?query=How to Make Rossetes&limitLicense=true#");
	  }

	  @Test
	  @Order(6)
	  void How_make_MannicottiTest() {
			given()
				.expect()
				.when()
				.post(getRecipes_cuisine()+"?query=How to make Mannicotti&limitLicense=true#");
	  }

	  @Test
	  @Order(7)
	  void How_to_Make_Braised_BeefTest() {
			given()
				.expect()
				.when()
				.post(getRecipes_cuisine()+"?quary=How to Make Braised&limitLicense=true#");
	  }

	  @Test
	  @Order(8)
	  void Cream_CornTest() {
			given()
				.expect()
				.when()
				.post(getRecipes_cuisine()+"?quary=Cream Corn Like No Other&limitLicense=true#");
	  }

	  @Test
	  @Order(9)
	  void How_to_Make_Bannana_CakeTest() {
			given()
				.expect()
				.when()
				.post(getRecipes_cuisine()+"?quary=How to Make Bannana Cake&limitLicense=true#");
	  }

	  @Test
	  @Order(10)
	  void Mom_s_Beast_Peanut_BrittleTest() {
			given()
				.expect()
				.when()
				.post(getRecipes_cuisine()+"?query=Mom's Beast Peanut Brittle&limitLicense=true#");
	  }
}