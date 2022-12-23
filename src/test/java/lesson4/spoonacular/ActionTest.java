package lesson4.spoonacular;

import org.asynchttpclient.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class ActionTest extends AbstractTest {

	  @BeforeEach
	  void setUp() {
			System.out.println(" ");
			System.out.println("Start running tests");
	  }

	  //Добавление рецепта
	  @Test
	  @Order(1)
	  void Click_on_MealPlannerTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Meal_planner")
				.get("https://spoonacular.com/meal-planner").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Meal Planner"));
			
	  }

	  @Test
	  @Order(2)
	  void Click_in_plusTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "add.svg")
				.get("https://spoonacular.com/images/add.svg").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("quickAddButton"));
			
	  }

	  @Test
	  @Order(3)
	  void Click_in_recipeTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "mealPlannerItemOption")
				.get("https://spoonacular.com/recipeBoxId-0 typeRecipe mealPlannerItemOption").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Mince Pie Recipes"));
	  }


	  //Удаление рецепта
	  @Test
	  @Order(4)
	  void Click_in_pictureTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "img")
				.get("https://spoonacular.com/img").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("img"));
	  }

	  @Test
	  @Order(5)
	  void Click_on_delete_recipesTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "delete.svg")
				.get("https://spoonacular.com/application/frontend/images/delete.svg").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("MealPlanner.removeItem(this)"));
	  }
}
