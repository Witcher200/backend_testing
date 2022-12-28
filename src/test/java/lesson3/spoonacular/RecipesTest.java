package lesson3.spoonacular;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.containsString;

public class RecipesTest extends AbstractPageTest {

	 @BeforeEach
	  void setUp() {
			System.out.println(" ");
			System.out.println("Start running tests");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	  }

	  @Test
	  @Order(1)
	  void Chicken_StockTest(){
		   given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
	   		    .queryParam("limitLicense", true)
				.queryParam("number", 10)
				.queryParam("query", "chicken")
				.expect()
				.body("number", equalTo(10))
			    .body("results[0].title", containsString("Chicken"))
			//	.body("totalResults", above(136))
				.when()
				.get(getBaseURL()+"recipes/complexSearch")
				.then()
		        .statusCode(200);

//	   assertThat(response.get("number"), equalTo(10));
	  }

	  /*@Test
	  @Order(2)
	  void RoastBeef_IDTest(){
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.expect()
				.body("id", equalTo(769774))
				.body("readyInMinutes", equalTo(45))
				.body("title", containsString("Roast Beef"))

				//	.body("totalResults", above(136))
				.when()
				.get(getBaseURL()+"recipes/769774/information")
				.then()
				.statusCode(200);

//	   assertThat(response.get("number"), equalTo(10));
	  }*/


	  @Test
	  @Order(2)
	  void Stuffed_Sweet_PotatoTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.queryParam("number", 5)
				.queryParam("query", "sweet potato")
				.expect()
				.body("number", equalTo(5))
				.body("results[0].title", containsString("Potato"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(3)
	  void Cheesy_Baked_PastaTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.queryParam("number", 5)
				.queryParam("query", "sweet potato")
				.expect()
				.body("number", equalTo(5))
				.body("results[0].title", containsString("Potato"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(4)
	  void Triple_Berry_SaladTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.queryParam("number", 8)
				.queryParam("query", "Berry Salad")
				.expect()
				.body("number", equalTo(8))
				.body("results[0].title", containsString("Berry Salad"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(5)
	  void Strawberry_Banana_Oatmeal_SmoothieTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.queryParam("number", 8)
				.queryParam("query", "Strawberry Banana")
				.expect()
				.body("number", equalTo(8))
				.body("results[0].title", containsString("Strawberry Banana"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(6)
	  void Three_Bean_Greek_Kale_SaladTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.queryParam("number", 10)
				.queryParam("query", "Kale Salad")
				.expect()
				.body("number", equalTo(10))
				.body("results[0].title", containsString("Kale Salad"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(7)
	  void Egg_Salad_BLTA_SandwichTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.queryParam("number", 15)
				.queryParam("query", "Egg Salad")
				.expect()
				.body("number", equalTo(15))
				.body("results[0].title", containsString("Egg Salad"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(8)
	  void Eggplant_Timballo_with_CavatelliTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.queryParam("number", 15)
				.queryParam("query", "Egg Salad")
				.expect()
				.body("number", equalTo(15))
				.body("results[0].title", containsString("Egg Salad"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(9)
	  void Red_Lentil_Carrot_SoupTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.queryParam("number", 4)
				.queryParam("query", "Red Lentil")
				.expect()
				.body("number", equalTo(4))
				.body("results[0].title", containsString("Red Lentil"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(10)
	  void Lemon_Chili_TilapiaTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.queryParam("number", 12)
				.queryParam("query", "Tilapia")
				.expect()
				.body("number", equalTo(12))
				.body("results[0].title", containsString("Tilapia"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(11)
	  void Healthy_Homemade_Shamrock_ShakeTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.queryParam("number", 18)
				.queryParam("query", "Shake")
				.expect()
				.body("number", equalTo(18))
				.body("results[0].title", containsString("Shake"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(12)
	  void Pizza_BiancaTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.queryParam("number", 5)
				.queryParam("query", "Pizza")
				.expect()
				.body("number", equalTo(5))
				.body("results[0].title", containsString("Pizza"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(13)
	  void One_Pan_Burrito_BowlsTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.queryParam("number", 8)
				.queryParam("query", "Burrito")
				.expect()
				.body("number", equalTo(8))
				.body("results[0].title", containsString("Burrito"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(14)
	  void Chocolate_Peanut_Butter_Chia_Seed_SmoothiTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.queryParam("number", 13)
				.queryParam("query", "Butter")
				.expect()
				.body("number", equalTo(13))
				.body("results[0].title", containsString("Butter"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(15)
	  void Cauliflower_PolentaTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.queryParam("number", 20)
				.queryParam("query", "Polenta")
				.expect()
				.body("number", equalTo(20))
				.body("results[0].title", containsString("Polenta"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(16)
	  void Baked_Coconut_Chicken_with_Spicy_SauceTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.queryParam("number", 11)
				.queryParam("query", "Chicken")
				.expect()
				.body("number", equalTo(11))
				.body("results[0].title", containsString("Chicken"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(17)
	  void Fat_Taco_SaladTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.queryParam("number", 24)
				.queryParam("query", "Taco")
				.expect()
				.body("number", equalTo(24))
				.body("results[0].title", containsString("Taco"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(18)
	  void CilantroSalsaTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.queryParam("number", 3)
				.queryParam("query", "Salsa")
				.expect()
				.body("number", equalTo(3))
				.body("results[0].title", containsString("Salsa"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(19)
	  void Rhubarb_Strawberry_SmoothieTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.queryParam("number", 26)
				.queryParam("query", "Smoothie")
				.expect()
				.body("number", equalTo(26))
				.body("results[0].title", containsString("Smoothie"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch")
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(20)
	  void Tequila_Sriracha_Glazed_SalmonTest() {
			given()
				.log()
				.all()
				.queryParam("apiKey", getSponacularAPI())
				.queryParam("limitLicense", true)
				.queryParam("number", 32)
				.queryParam("query", "Salmon")
				.expect()
				.body("number", equalTo(32))
				.body("results[0].title", containsString("Salmon"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch")
				.then()
				.statusCode(200);
	  }
}

