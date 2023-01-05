package lesson5;

import com.github.javafaker.Faker;
import lesson5.api.ProductService;
import lesson5.dto.Product;
import lesson5.util.RetrofitUtils;
import lombok.SneakyThrows;
import okhttp3.ResponseBody;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import retrofit2.Response;

import java.util.Objects;

import static org.hamcrest.MatcherAssert.assertThat;

public class CreateProductTest {
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
				.withTitle(faker.food()
				.ingredient())
				.withCategoryTitle("Food")
				.withPrice((int) (Math.random()*10000));
	  }

	  @Test
	  @SneakyThrows
	  void createProductInFoodCategoryTest() {
			Response<Product> response = productService.createProduct(product).execute();
			id = Objects.requireNonNull(response.body()).getId();
			assertThat(response.isSuccessful(), CoreMatchers.is(true));
			System.out.println(id);
			//assertThat();
	  }

	  @SneakyThrows
	  @AfterEach
	  void tearDown() {
			Response<ResponseBody> response = productService.deleteProduct(id).execute();
			assertThat(response.isSuccessful(), CoreMatchers.is(true));
	  }
}
