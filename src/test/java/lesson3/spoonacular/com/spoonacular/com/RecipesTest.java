package lesson3.spoonacular.com.spoonacular.com;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class RecipesTest extends AbstractPageTest {

	  @Test
	  @Order(1)
	  void Chicken_Stock() {
			given()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"homemade-chicken-stock-482499?query=chicken-stock")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(2)
	  void Stuffed_Sweet_Potato() {
			given()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"stuffed-sweet-potato-with-spinach-hummus-feta-584549?query=" +
					"Stuffed Sweet Potato with Spinach, Hummus %26 Feta")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(3)
	  void Cheesy_Baked_Pasta() {
			given()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"cheesy-baked-pasta-with-eggplant-and-artichokes-590452?query=" +
					"Cheesy Baked Pasta with Eggplant and Artichokes")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(4)
	  void Triple_Berry_Salad() {
			given()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"triple-berry-salad-521360?query=Triple Berry Salad")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(5)
	  void Strawberry_Banana_Oatmeal_Smoothie() {
			given()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"strawberry-banana-oatmeal-smoothie-505651?quary=Strawberry Banana Oatmeal Smoothie")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(6)
	  void Three_Bean_Greek_Kale_Salad() {
			given()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"three-bean-greek-kale-salad-609091?query=Three Bean Greek Kale Salad")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(7)
	  void Egg_Salad_BLTA_Sandwich() {
			given()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"egg-salad-blta-sandwich-536064?query=Egg Salad BLTA Sandwich")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(8)
	  void Eggplant_Timballo_with_Cavatelli() {
			given()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"eggplant-timballo-with-cavatelli-741233?query=Eggplant Timballo with Cavatelli")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(9)
	  void Red_Lentil_Carrot_Soup() {
			given()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"red-lentil-carrot-soup-837230?quary=Red Lentil %26 Carrot Soup")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(10)
	  void Lemon_Chili_Tilapia() {
			given()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"lemon-chili-tilapia-178328?quary=Lemon-Chili Tilapia")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(11)
	  void Healthy_Homemade_Shamrock_Shake() {
			given()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"healthy-homemade-shamrock-shake-594783?quary=Healthy Homemade Shamrock Shake")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(12)
	  void Pizza_Bianca() {
			given()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"pizza-bianca-with-zucchini-497064?quary=Pizza Bianca")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(13)
	  void One_Pan_Burrito_Bowls() {
			given()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"one-pan-burrito-bowls-616213?quary=One Pan Burrito Bowls")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(14)
	  void Chocolate_Peanut_Butter_Chia_Seed_Smoothi() {
			given()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"chocolate-peanut-butter-chia-seed-smoothie-512591?quary=" +
					"Chocolate Peanut Butter Chia Seed Smoothi")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(15)
	  void Cauliflower_Polenta() {
			given()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"cauliflower-polenta-1165088?query=Cauliflower Polenta")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(16)
	  void Baked_Coconut_Chicken_with_Spicy_Sauce() {
			given()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"baked-coconut-chicken-with-spicy-sauce-492733?query=Baked Coconut Chicken with Spicy Sauce")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(17)
	  void Fat_Taco_Salad() {
			given()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"/low-fat-taco-salad-532738?query=Low-Fat Taco Salad")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(18)
	  void CilantroSalsa() {
			given()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"cilantro-salsa-667917?query=Cilantro Salsa")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(19)
	  void Rhubarb_Strawberry_Smoothie() {
			given()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"rhubarb-strawberry-smoothie-537208?quary=Rhubarb Strawberry Smoothie")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(20)
	  void Tequila_Sriracha_Glazed_Salmon() {
			given()
				.queryParam("sponacularAPI", getSponacularAPI())
				.when()
				.get(getBaseURL()+"tequila-sriracha-glazed-salmon-532952?query=Tequila %26 Sriracha Glazed Salmon")
				.then()
				.statusCode(404);
	  }
}
