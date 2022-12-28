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
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.containsString;

public class RecipesTest extends AbstractPageTest {

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
	  void Chicken_StockTest() {
			given()
				.queryParam("number", 10)
				.queryParam("query", "chicken")
				.expect()
				.body("number", equalTo(10))
				.body("results[0].title", containsString("Chicken"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch");
	  }

	  /*@Test
	  @Order(2)
	  void RoastBeef_IDTest(){
			given()
				.expect()
				.body("id", equalTo(769774))
				.body("readyInMinutes", equalTo(45))
				.body("title", containsString("Roast Beef"))
				//	.body("totalResults", above(136))
				.when()
				.get(getBaseURL()+"recipes/769774/information");
	  }*/


	  @Test
	  @Order(2)
	  void Stuffed_Sweet_PotatoTest() {
			given()
				.queryParam("number", 5)
				.queryParam("query", "sweet potato")
				.expect()
				.body("number", equalTo(5))
				.body("results[0].title", containsString("Potato"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch");
	  }

	  @Test
	  @Order(3)
	  void Cheesy_Baked_PastaTest() {
			given()
				.queryParam("number", 5)
				.queryParam("query", "sweet potato")
				.expect()
				.body("number", equalTo(5))
				.body("results[0].title", containsString("Potato"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch");
	  }

	  @Test
	  @Order(4)
	  void Triple_Berry_SaladTest() {
			given()
				.queryParam("number", 8)
				.queryParam("query", "Berry Salad")
				.expect()
				.body("number", equalTo(8))
				.body("results[0].title", containsString("Berry Salad"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch");
	  }

	  @Test
	  @Order(5)
	  void Strawberry_Banana_Oatmeal_SmoothieTest() {
			given()
				.queryParam("number", 8)
				.queryParam("query", "Strawberry Banana")
				.expect()
				.body("number", equalTo(8))
				.body("results[0].title", containsString("Strawberry Banana"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch");
	  }

	  @Test
	  @Order(6)
	  void Three_Bean_Greek_Kale_SaladTest() {
			given()
				.queryParam("number", 10)
				.queryParam("query", "Kale Salad")
				.expect()
				.body("number", equalTo(10))
				.body("results[0].title", containsString("Kale Salad"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch");
	  }

	  @Test
	  @Order(7)
	  void Egg_Salad_BLTA_SandwichTest() {
			given()
				.queryParam("number", 15)
				.queryParam("query", "Egg Salad")
				.expect()
				.body("number", equalTo(15))
				.body("results[0].title", containsString("Egg Salad"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch");
	  }

	  @Test
	  @Order(8)
	  void Eggplant_Timballo_with_CavatelliTest() {
			given()
				.queryParam("number", 15)
				.queryParam("query", "Egg Salad")
				.expect()
				.body("number", equalTo(15))
				.body("results[0].title", containsString("Egg Salad"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch");
	  }

	  @Test
	  @Order(9)
	  void Red_Lentil_Carrot_SoupTest() {
			given()
				.queryParam("number", 4)
				.queryParam("query", "Red Lentil")
				.expect()
				.body("number", equalTo(4))
				.body("results[0].title", containsString("Red Lentil"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch");
	  }

	  @Test
	  @Order(10)
	  void Lemon_Chili_TilapiaTest() {
			given()
				.queryParam("number", 12)
				.queryParam("query", "Tilapia")
				.expect()
				.body("number", equalTo(12))
				.body("results[0].title", containsString("Tilapia"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch");
	  }

	  @Test
	  @Order(11)
	  void Healthy_Homemade_Shamrock_ShakeTest() {
			given()
				.queryParam("number", 18)
				.queryParam("query", "Shake")
				.expect()
				.body("number", equalTo(18))
				.body("results[0].title", containsString("Shake"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch");
	  }

	  @Test
	  @Order(12)
	  void Pizza_BiancaTest() {
			given()
				.queryParam("number", 5)
				.queryParam("query", "Pizza")
				.expect()
				.body("number", equalTo(5))
				.body("results[0].title", containsString("Pizza"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch");
	  }

	  @Test
	  @Order(13)
	  void One_Pan_Burrito_BowlsTest() {
			given()
				.queryParam("number", 8)
				.queryParam("query", "Burrito")
				.expect()
				.body("number", equalTo(8))
				.body("results[0].title", containsString("Burrito"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch");
	  }

	  @Test
	  @Order(14)
	  void Chocolate_Peanut_Butter_Chia_Seed_SmoothiTest() {
			given()
				.queryParam("number", 13)
				.queryParam("query", "Butter")
				.expect()
				.body("number", equalTo(13))
				.body("results[0].title", containsString("Butter"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch");
	  }

	  @Test
	  @Order(15)
	  void Cauliflower_PolentaTest() {
			given()
				.queryParam("number", 20)
				.queryParam("query", "Polenta")
				.expect()
				.body("number", equalTo(20))
				.body("results[0].title", containsString("Polenta"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch");
	  }

	  @Test
	  @Order(16)
	  void Baked_Coconut_Chicken_with_Spicy_SauceTest() {
			given()
				.queryParam("number", 11)
				.queryParam("query", "Chicken")
				.expect()
				.body("number", equalTo(11))
				.body("results[0].title", containsString("Chicken"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch");
	  }

	  @Test
	  @Order(17)
	  void Fat_Taco_SaladTest() {
			given()
				.queryParam("number", 24)
				.queryParam("query", "Taco")
				.expect()
				.body("number", equalTo(24)).
					body("results[0].title", containsString("Taco"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch");
	  }

	  @Test
	  @Order(18)
	  void CilantroSalsaTest() {
			given()
				.queryParam("number", 3)
				.queryParam("query", "Salsa")
				.expect()
				.body("number", equalTo(3))
				.body("results[0].title", containsString("Salsa"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch");
	  }

	  @Test
	  @Order(19)
	  void Rhubarb_Strawberry_SmoothieTest() {
			given()
				.queryParam("number", 26)
				.queryParam("query", "Smoothie")
				.expect()
				.body("number", equalTo(26))
				.body("results[0].title", containsString("Smoothie"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch");
	  }

	  @Test
	  @Order(20)
	  void Tequila_Sriracha_Glazed_SalmonTest() {
			given()
				.queryParam("number", 32)
				.queryParam("query", "Salmon")
				.expect()
				.body("number", equalTo(32))
				.body("results[0].title", containsString("Salmon"))
				.when()
				.get(getBaseURL()+"recipes/complexSearch");
	  }
}