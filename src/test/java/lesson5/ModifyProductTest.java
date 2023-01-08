package lesson5;

import com.github.javafaker.Faker;
import lesson5.api.ProductService;
import lesson5.dto.Product;
import lesson5.util.RetrofitUtils;
import lombok.SneakyThrows;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import retrofit2.Response;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ModifyProductTest {
	  static ProductService productService;
	  Faker faker = new Faker();
	  Product product_params;

	  @BeforeAll
	  static void beforeAll() {
			productService = RetrofitUtils.getRetrofit().create(ProductService.class);
	  }

	  @Test
	  @SneakyThrows
	  void ModifyProduct() {
			product_params = new Product().withId(4)
				.withTitle(faker.food().ingredient())
				.withCategoryTitle("Food")
				.withPrice(250);
			Response<Product> response = productService.modifyProduct(product_params).execute();
			assertThat(response.isSuccessful(), CoreMatchers.is(true));
			assertThat(response.code(), equalTo(200));
			assertThat(response.body().getPrice(), equalTo(250));
			assertThat(response.body().getCategoryTitle(), equalTo("Food"));
	  }

	  @Test
	  @SneakyThrows
	  void ModifyNegativeProduct() {
			product_params = new Product().withId(50)
				.withTitle(faker.food().ingredient())
				.withCategoryTitle("Food")
				.withPrice(100);
			Response<Product> response = productService.modifyProduct(product_params).execute();
			assertThat(response.isSuccessful(), CoreMatchers.is(false));
			assertThat(response.code(), equalTo(400));
	  }
}
