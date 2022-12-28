package lesson3.spoonacular;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class RecipesCuisineTest extends AbstractPageTest {

	  @BeforeEach
	  void setUp() {
			System.out.println(" ");
			System.out.println("Start running tests");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	  }

	  @Test
	  @Order(1)
	  void Top_18_to_Grill_ChickenTes() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.expect()
				.when()
				.post(getRecipes_cuisine()+"?query=Top18&number=35&limitLicense=true#")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(2)
	  void How_to_Make_ChillTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.expect()
				.when()
				.post(getRecipes_cuisine()+"?query=Make&number=28&limitLicense=true#")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(3)
	  void Trying_the_Top_Rated_PastaTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.expect()
				.when()
				.post(getRecipes_cuisine()+"?query=Pasta&number=27&limitLicense=true#")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(4)
	  void How_to_Make_Mug_CakeTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.expect()
				.when()
				.post(getRecipes_cuisine()+"?query=How to Make Mug Cake&limitLicense=true#")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(5)
	  void How_Make_RossetesTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.expect()
				.when()
				.post(getRecipes_cuisine()+"?query=How to Make Rossetes&limitLicense=true#")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(6)
	  void How_make_MannicottiTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.expect()
				.when()
				.post(getRecipes_cuisine()+"?query=How to make Mannicotti&limitLicense=true#")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(7)
	  void How_to_Make_Braised_BeefTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.expect()
				.when()
				.post(getRecipes_cuisine()+"?quary=How to Make Braised&limitLicense=true#")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(8)
	  void Cream_CornTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.expect()
				.when()
				.post(getRecipes_cuisine()+"?quary=Cream Corn Like No Other&limitLicense=true#")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(9)
	  void How_to_Make_Bannana_CakeTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.expect()
				.when()
				.post(getRecipes_cuisine()+"?quary=How to Make Bannana Cake&limitLicense=true#")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(10)
	  void Mom_s_Beast_Peanut_BrittleTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.expect()
				.when()
				.post(getRecipes_cuisine()+"?query=Mom's Beast Peanut Brittle&limitLicense=true#")
				.then()
				.statusCode(200);
	  }
}

