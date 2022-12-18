package lesson3.spoonacular.com.spoonacular.com;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class ActionsTest extends AbstractPageTest {

	  //Добавление рецепта
	  @Test
	  @Order(1)
	  void Click_in_MyProfile() {
			given()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getMealURL()+"meal-planner")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(2)
	  void Click_in_plus() {
			given()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getPlusURL()+"images/add.svg")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(3)
	  void Click_in_recipe() {
			given()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getPlusURL()+"recipeBoxId-0 typeRecipe mealPlannerItemOption")
				.then()
				.statusCode(200);
	  }

	  //Удаление рецепта
	  @Test
	  @Order(4)
	  void Click_in_picture() {
			given()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getPlusURL()+"img")
				.then()
				.statusCode(200);
	  }
	  @Test
	  @Order(5)
	  void Click_on_delete_recipes() {
			given()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getPlusURL()+"images/delete.svg")
				.then()
				.statusCode(404);
	  }
}
