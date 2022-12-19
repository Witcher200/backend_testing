package lesson3.spoonacular.com.spoonacular.com;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class RecipesCuisineTest extends AbstractPageTest {

	  @BeforeEach
	  void setUp() {
			System.out.println("Start running tests");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
			System.out.println(" ");
	  }

	  @Test
	  @Order(1)
	  void Top_18_to_Grill_Chicken() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.request(Method.POST, getBaseURL()+"?query=Top 18 to Grill Chicken&test" +
					"includeNutrition={Nutrition}&apiKey={apiKey}", false, getSponacularAPI())
				.then()
				.statusCode(301);
	  }

	  @Test
	  @Order(2)
	  void How_to_Make_Chill() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.request(Method.POST,getBaseURL()+"?query=How to Make Chill&tes" +
					"includeNutrition={Nutrition}&apiKey={apiKey}", false, getSponacularAPI())
				.then()
				.statusCode(301);
	  }

	  @Test
	  @Order(3)
	  void Trying_the_Top_Rated_Pasta() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.request(Method.POST,getBaseURL()+"?query=Trying the Top Rated Pasta&test" +
					"includeNutrition={Nutrition}&apiKey={apiKey}", false, getSponacularAPI())
				.then()
				.statusCode(301);
	  }

	  @Test
	  @Order(4)
	  void How_to_Make_Mug_Cake() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.request(Method.POST,getBaseURL()+"?query=How to Make Mug Cake&test" +
					"includeNutrition={Nutrition}&apiKey={apiKey}", false, getSponacularAPI())
				.then()
				.statusCode(301);
	  }

	  @Test
	  @Order(5)
	  void How_Make_Rossetes() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.request(Method.POST,getBaseURL()+"?query=How to Make Rossetes&tes" +
					"includeNutrition={Nutrition}&apiKey={apiKey}", false, getSponacularAPI())
				.then()
				.statusCode(301);
	  }

	  @Test
	  @Order(6)
	  void How_make_Mannicotti() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.request(Method.POST,getBaseURL()+"?query=How to make Mannicotti&test" +
					"includeNutrition={Nutrition}&apiKey={apiKey}", false, getSponacularAPI())
				.then()
				.statusCode(301);
	  }

	  @Test
	  @Order(7)
	  void How_to_Make_Braised_Beef() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.request(Method.POST,getBaseURL()+"?quary=How to Make Braised Beef&test" +
					"includeNutrition={Nutrition}&apiKey={apiKey}", false, getSponacularAPI())
				.then()
				.statusCode(301);
	  }

	  @Test
	  @Order(8)
	  void Cream_Corn() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.request(Method.POST,getBaseURL()+"?quary=Cream Corn Like No Other&test" +
					"includeNutrition={Nutrition}&apiKey={apiKey}", false, getSponacularAPI())
				.then()
				.statusCode(301);
	  }

	  @Test
	  @Order(9)
	  void How_to_Make_Bannana_Cake() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.request(Method.POST,getBaseURL()+"?quary=How to Make Bannana Cake&test" +
					"includeNutrition={Nutrition}&apiKey={apiKey}", false, getSponacularAPI())
				.then()
				.statusCode(301);
	  }

	  @Test
	  @Order(10)
	  void Mom_s_Beast_Peanut_Brittle() {
			given()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.request(Method.POST,getBaseURL()+"?query=Mom's Beast Peanut Brittle&tes" +
					"includeNutrition={Nutrition}&apiKey={apiKey}", false, getSponacularAPI())
				.then()
				.statusCode(301);
	  }
}
