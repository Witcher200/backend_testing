package lesson5;

import com.github.javafaker.Faker;
import lesson5.api.ProductService;
import lesson5.dto.Product;
import lesson5.util.RetrofitUtils;
import lombok.SneakyThrows;
import okhttp3.ResponseBody;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import retrofit2.Response;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class createProductNegativeTest {

	  static ProductService productService;
	  Product product;
	  Faker faker = new Faker();
	  int id;

	  @BeforeAll
	  static void beforeAll() {
			productService = RetrofitUtils.getRetrofit().create(ProductService.class);
	  }

	  @BeforeEach
	  void setUp() {
			product = new Product()
				.withTitle(faker.food().ingredient())
				.withCategoryTitle("Food")
				.withPrice((int) (Math.random()*10000));
	  }

	  @Test
	  @SneakyThrows
	  void createProductInFoodCategoryNegativeTest() {
			product = new Product()
				.withId(1)
				.withTitle(faker.food().ingredient())
				.withCategoryTitle("Food")
				.withPrice((int) (Math.random()*10000));

			Response<Product> response = productService.createProduct(product).execute();
			assertThat(response.isSuccessful(), CoreMatchers.is(false));
			assertThat(response.code(), equalTo(400));
	  }


	  @Test
	  @SneakyThrows
	  void DeleteProductNegativeTest() {
			Response<ResponseBody> response = productService.deleteProduct(50).execute();
			assertThat(response.isSuccessful(), CoreMatchers.is(false));
			assertThat(response.code(), equalTo(500));
	  }
}
