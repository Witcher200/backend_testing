package lesson5;

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

public class GetProductTest {
	  static ProductService productService;

	  @BeforeAll
	  static void beforeAll() {
			productService = RetrofitUtils.getRetrofit().create(ProductService.class);
	  }

	  @Test
	  @SneakyThrows
	  void GetProductbyIDTest() {
			Response<Product> response = productService.getProduct(1).execute();
			assertThat(response.isSuccessful(), CoreMatchers.is(true));
			assertThat(response.body().getTitle(), equalTo("Milk"));
			assertThat(response.body().getPrice(), equalTo(95));
	  }
}
