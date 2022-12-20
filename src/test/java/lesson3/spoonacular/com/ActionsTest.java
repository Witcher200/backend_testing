package lesson3.spoonacular.com;

import io.restassured.RestAssured;
import org.junit.jupiter.api.*;
import static io.restassured.RestAssured.given;
public class ActionsTest extends AbstractPageTest {


	  @BeforeEach
	  void setUp() {
			System.out.println(" ");
			System.out.println("Start running tests");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	  }

	  //Добавление рецепта
	  @Test
	  @Order(1)
	  void Click_on_MealPlanner() {
			given()
				.log()
				.all()
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
				.log()
				.all()
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
				.log()
				.all()
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
				.log()
				.all()
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
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getPlusURL()+"images/delete.svg")
				.then()
				.statusCode(404);
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
