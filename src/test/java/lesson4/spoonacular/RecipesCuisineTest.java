package lesson4.spoonacular;

import org.asynchttpclient.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

import static org.hamcrest.MatcherAssert.assertThat;

public class RecipesCuisineTest extends AbstractTest {

	  @BeforeEach
	  void setUp() {
			System.out.println(" ");
			System.out.println("Start running tests");
	  }

	  @Test
	  @Order(1)
	  void Top_18_to_Grill_Chicken() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Top 18 to Grill Chicken")
				.get("https://spoonacular.com/recipes.cuisine?query=Top 18 to Grill Chicken&test")
				.prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Top 18 to Grill Chicken"));
	  }

	  @Test
	  @Order(2)
	  void How_to_Make_ChillTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "How to Make Chill")
				.get("https://spoonacular.com/recipes.cuisine?query=How to Make Chill&tes")
				.prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("How to Make Chill"));
	  }

	  @Test
	  @Order(3)
	  void Trying_the_Top_Rated_PastaTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Trying the Top Rated Pasta")
				.get("https://spoonacular.com/recipes.cuisine?query=Trying the Top Rated Pasta&test")
				.prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Trying the Top Rated Pasta"));
	  }

	  @Test
	  @Order(4)
	  void How_to_Make_Mug_CakeTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "How to Make Mug Cake")
				.get("https://spoonacular.com/recipes.cuisine?query=How to Make Mug Cake&test")
				.prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("How to Make Mug Cake"));
	  }

	  @Test
	  @Order(5)
	  void How_Make_RossetesTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "How to Make Rossetes")
				.get("https://spoonacular.com/recipes.cuisine?query=How to Make Rossetes&tes")
				.prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("How to Make Rossetes"));
	  }

	  @Test
	  @Order(6)
	  void How_make_MannicottiTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "How to make Mannicotti")
				.get("https://spoonacular.com/recipes.cuisine?query=How to make Mannicotti&test")
				.prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("How to make Mannicotti"));
	  }

	  @Test
	  @Order(7)
	  void How_to_Make_Braised_BeefTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "How to Make Braised Beef")
				.get("https://spoonacular.com/recipes.cuisine?quary=How to Make Braised Beef&test")
				.prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("How to Make Braised Beef"));
	  }

	  @Test
	  @Order(8)
	  void Cream_CornTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Cream Corn Like No Other")
				.get("https://spoonacular.com/recipes.cuisine?quary=Cream Corn Like No Other&test")
				.prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Cream Corn Like No Other"));
	  }

	  @Test
	  @Order(9)
	  void How_to_Make_Bannana_CakeTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "How to Make Bannana Cake")
				.get("https://spoonacular.com/recipes.cuisine?quary=How to Make Bannana Cake&test")
				.prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("How to Make Bannana Cake"));
	  }

	  @Test
	  @Order(10)
	  void Mom_s_Beast_Peanut_BrittleTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Mom's Beast Peanut Brittle")
				.get("https://spoonacular.com/recipes.cuisine?query=Mom's Beast Peanut Brittle&tes")
				.prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Mom's Beast Peanut Brittle"));
	  }
}
