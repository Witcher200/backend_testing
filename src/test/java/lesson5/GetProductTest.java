package lesson5;

import lesson5.api.ProductService;
import lesson5.dto.Product;
import lesson5.util.RetrofitUtils;
import lombok.SneakyThrows;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import retrofit2.Response;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GetProductTest {
	  static ProductService productService;

	  @BeforeAll
	  static void beforeAll() {
			productService = RetrofitUtils.getRetrofit().create(ProductService.class);
	  }

	  @SneakyThrows
	  @Test
	  void getProductByIdPositiveTest() {
			Response<Product> response = productService.getProduct(1).execute();
			assertThat(response.isSuccessful(), CoreMatchers.is(true));
			assertThat(response.body().getPrice(), equalTo(95));
			assertThat(response.body().getTitle(), equalTo("Milk"));
	  }

	  @SneakyThrows
	  @Test
	  void getProductByIdPositiveTest2() {
			Response<Product> response = productService.getProduct(3).execute();
			assertThat(response.isSuccessful(), CoreMatchers.is(true));
			assertThat(response.body().getTitle(), equalTo("Cheese"));
	  }

	  @SneakyThrows
	  @Test
	  void getProductByIdNegativeTest() {
			Response<Product> response = productService.getProduct(100).execute();
			assertThat(response.isSuccessful(), CoreMatchers.is(false));
			assertThat(response.code(), equalTo(404));
	  }

	  @SneakyThrows
	  @Test
	  void getProductsTest() {
			Response<List<Product>> response = productService.GetProducts().execute();
			assertThat(response.isSuccessful(), CoreMatchers.is(true));
			assertThat(response.body().size(), equalTo(5));
			assertThat(response.body().get(3).getCategoryTitle(), equalTo("Electronic"));

	  }
}
