package lesson4.spoonacular;

import org.asynchttpclient.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class RecipesTest extends AbstractTest{

	  @BeforeEach
	  void setUp() {
			System.out.println(" ");
			System.out.println("Start running tests");
	  }

	  @Test
	  @Order(1)
	  void Chicken_StockTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Chicken stock")
				.get("https://spoonacular.com/recipes/homemade-chicken-stock-482499?query=chicken-stock").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Chicken_stock"));
	  }

	  @Test
	  @Order(2)
	  void Stuffed_Sweet_PotatoTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Stuffed Sweet Potato with Spinach")
				.get("https://spoonacular.com/recipes/stuffed-sweet-potato-with-spinach-hummus-feta-584549?query=Stuffed Sweet Potato with Spinach, Hummus %26 Feta").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Stuffed Sweet Potato with Spinach"));
	  }

	  @Test
	  @Order(3)
	  void Cheesy_Baked_PastaTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Cheesy Baked Pasta with Eggplant and Artichokes")
				.get("https://spoonacular.com/recipes/cheesy-baked-pasta-with-eggplant-and-artichokes-590452?query=Cheesy Baked Pasta with Eggplant and Artichokes").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Cheesy Baked Pasta with Eggplant and Artichokes"));
	  }

	  @Test
	  @Order(4)
	  void Triple_Berry_SaladTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Triple Berry Salad")
				.get("https://spoonacular.com/recipes/triple-berry-salad-521360?query=Triple Berry Salad").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Triple Berry Salad"));
	  }

	  @Test
	  @Order(5)
	  void Strawberry_Banana_Oatmeal_SmoothieTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Strawberry Banana Oatmeal Smoothie")
				.get("https://spoonacular.com/recipes/strawberry-banana-oatmeal-smoothie-505651?quary=Strawberry Banana Oatmeal Smoothie").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Strawberry Banana Oatmeal Smoothie"));
	  }

	  @Test
	  @Order(6)
	  void Three_Bean_Greek_Kale_SaladTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Three Bean Greek Kale Salad")
				.get("https://spoonacular.com/recipes/three-bean-greek-kale-salad-609091?query=Three Bean Greek Kale Salad").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Three Bean Greek Kale Salad"));
	  }

	  @Test
	  @Order(7)
	  void Egg_Salad_BLTA_SandwichTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Egg Salad BLTA Sandwich")
				.get("https://spoonacular.com/recipes/egg-salad-blta-sandwich-536064?query=Egg Salad BLTA Sandwich").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Egg Salad BLTA Sandwich"));
	  }

	  @Test
	  @Order(8)
	  void Eggplant_Timballo_with_CavatelliTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Eggplant Timballo with Cavatelli")
				.get("https://spoonacular.com/recipes/eggplant-timballo-with-cavatelli-741233?query=Eggplant Timballo with Cavatelli").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Eggplant Timballo with Cavatelli"));
	  }

	  @Test
	  @Order(9)
	  void Red_Lentil_Carrot_SoupTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Red Lentil Carrot Soup")
				.get("https://spoonacular.com/recipes/red-lentil-carrot-soup-837230?quary=Red Lentil %26 Carrot Soup").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Red Lentil Carrot Soup"));
	  }

	  @Test
	  @Order(10)
	  void Lemon_Chili_TilapiaTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Lemon-Chili Tilapia")
				.get("https://spoonacular.com/recipes/lemon-chili-tilapia-178328?quary=Lemon-Chili Tilapia").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Lemon-Chili Tilapia"));
	  }

	  @Test
	  @Order(11)
	  void Healthy_Homemade_Shamrock_ShakeTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Healthy Homemade Shamrock Shake")
				.get("https://spoonacular.com/recipes/healthy-homemade-shamrock-shake-594783?quary=Healthy Homemade Shamrock Shake").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Healthy Homemade Shamrock Shake"));
	  }

	  @Test
	  @Order(12)
	  void Pizza_BiancaTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Pizza Bianca")
				.get("https://spoonacular.com/recipes/pizza-bianca-with-zucchini-497064?quary=Pizza Bianca").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Pizza Bianca"));
	  }

	  @Test
	  @Order(13)
	  void One_Pan_Burrito_BowlsTest() {
		Response response = given().spec(getRequestSpecification())
			.when()
			.formParam("title", "One Pan Burrito Bowls")
			.get("https://spoonacular.com/recipes/one-pan-burrito-bowls-616213?quary=One Pan Burrito Bowls").prettyPeek()
			.then()
			.extract()
			.response()
			.body()
			.as(Response.class);
		assertThat(response.getContentType(), containsString("One Pan Burrito Bowls"));
	  }

	  @Test
	  @Order(14)
	  void Chocolate_Peanut_Butter_Chia_Seed_SmoothiTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Chocolate Peanut Butter Chia Seed Smoothi")
				.get("https://spoonacular.com/recipes/chocolate-peanut-butter-chia-seed-smoothie-512591?quary=Chocolate Peanut Butter Chia Seed Smoothi").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Chocolate Peanut Butter Chia Seed Smoothi"));
	  }

	  @Test
	  @Order(15)
	  void Cauliflower_PolentaTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Cauliflower Polenta")
				.get("https://spoonacular.com/recipes/cauliflower-polenta-1165088?query=Cauliflower Polenta").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Cauliflower Polenta"));
			
	  }

	  @Test
	  @Order(16)
	  void Baked_Coconut_Chicken_with_Spicy_SauceTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Baked Coconut Chicken with Spicy Sauce")
				.get("https://spoonacular.com/recipes/baked-coconut-chicken-with-spicy-sauce-492733?query=Baked Coconut Chicken with Spicy Sauce").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Baked Coconut Chicken with Spicy Sauce"));
			
	  }

	  @Test
	  @Order(17)
	  void Fat_Taco_SaladTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Fat Taco Salad")
				.get("https://spoonacular.com/recipes/low-fat-taco-salad-532738?query=Low-Fat Taco Salad").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Fat Taco Salad"));
			
	  }

	  @Test
	  @Order(18)
	  void CilantroSalsaTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Cilantro Salsa")
				.get("https://spoonacular.com/recipes/cilantro-salsa-667917?query=Cilantro Salsa").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Cilantro Salsa"));
			
	  }

	  @Test
	  @Order(19)
	  void Rhubarb_Strawberry_SmoothieTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Rhubarb Strawberry Smoothie")
				.get("https://spoonacular.com/recipes/rhubarb-strawberry-smoothie-537208?quary=Rhubarb Strawberry Smoothie").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Rhubarb Strawberry Smoothie"));
			
	  }

	  @Test
	  @Order(20)
	  void Tequila_Sriracha_Glazed_SalmonTest() {
			Response response = given().spec(getRequestSpecification())
				.when()
				.formParam("title", "Tequila Sriracha Glazed Salmon")
				.get("https://spoonacular.com/recipes/tequila-sriracha-glazed-salmon-532952?query=Tequila %26 Sriracha Glazed Salmon").prettyPeek()
				.then()
				.extract()
				.response()
				.body()
				.as(Response.class);
			assertThat(response.getContentType(), containsString("Tequila Sriracha Glazed Salmon"));
	  }
}
