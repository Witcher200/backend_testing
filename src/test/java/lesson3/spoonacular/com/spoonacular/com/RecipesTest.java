package lesson3.spoonacular.com.spoonacular.com;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class RecipesTest extends AbstractPageTest {

	  @BeforeEach
	  void setUp() {
			System.out.println(" ");
			System.out.println("Start running tests");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	  }

	  @Test
	  @Order(1)
	  void Chicken_Stock() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"?query=chicken-stock")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(2)
	  void Stuffed_Sweet_Potato() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"?query=Stuffed Sweet Potato with Spinach, Hummus %26 Feta")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(3)
	  void Cheesy_Baked_Pasta() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"?query=Cheesy Baked Pasta with Eggplant and Artichokes")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(4)
	  void Triple_Berry_Salad() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"?query=Triple Berry Salad")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(5)
	  void Strawberry_Banana_Oatmeal_Smoothie() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"?quary=Strawberry Banana Oatmeal Smoothie")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(6)
	  void Three_Bean_Greek_Kale_Salad() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"?query=Three Bean Greek Kale Salad")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(7)
	  void Egg_Salad_BLTA_Sandwich() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"?query=Egg Salad BLTA Sandwich")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(8)
	  void Eggplant_Timballo_with_Cavatelli() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"?query=Eggplant Timballo with Cavatelli")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(9)
	  void Red_Lentil_Carrot_Soup() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"?quary=Red Lentil %26 Carrot Soup")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(10)
	  void Lemon_Chili_Tilapia() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"?quary=Lemon-Chili Tilapia")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(11)
	  void Healthy_Homemade_Shamrock_Shake() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"?quary=Healthy Homemade Shamrock Shake")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(12)
	  void Pizza_Bianca() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"?quary=Pizza Bianca")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(13)
	  void One_Pan_Burrito_Bowls() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"?quary=One Pan Burrito Bowls")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(14)
	  void Chocolate_Peanut_Butter_Chia_Seed_Smoothi() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"?quary=Chocolate Peanut Butter Chia Seed Smoothi")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(15)
	  void Cauliflower_Polenta() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"?query=Cauliflower Polenta")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(16)
	  void Baked_Coconut_Chicken_with_Spicy_Sauce() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"?query=Baked Coconut Chicken with Spicy Sauce")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(17)
	  void Fat_Taco_Salad() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"?query=Low-Fat Taco Salad")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(18)
	  void CilantroSalsa() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"?query=Cilantro Salsa")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(19)
	  void Rhubarb_Strawberry_Smoothie() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"?quary=Rhubarb Strawberry Smoothie")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(20)
	  void Tequila_Sriracha_Glazed_Salmon() {
			given()
				.log()
				.all()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"?query=Tequila %26 Sriracha Glazed Salmon")
				.then()
				.statusCode(200);
	  }
}
