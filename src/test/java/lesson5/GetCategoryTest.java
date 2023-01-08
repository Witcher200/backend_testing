package lesson5;

import lesson5.api.CategoryService;
import lesson5.dto.GetCategoryResponse;
import lesson5.util.RetrofitUtils;
import lombok.SneakyThrows;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import retrofit2.Response;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GetCategoryTest {
	  static CategoryService categoryService;

	 @BeforeAll
	  static void beforeAll() {
		   categoryService = RetrofitUtils.getRetrofit().create(CategoryService.class);
	  }

	  @SneakyThrows
	  @Test
	  void getCategoryByIdPositiveTest() {
			Response<GetCategoryResponse> response = categoryService.getCategory(1).execute();
			assertThat(response.isSuccessful(), CoreMatchers.is(true));
			assertThat(response.body().getTitle(), equalTo("Food"));
			response.body().getProducts().forEach(product ->
				assertThat(product.getCategoryTitle(), equalTo("Food")));
	  }

	  @SneakyThrows
	  @Test
	  void getCategoryByIdNegativeTest() {
			Response<GetCategoryResponse> response = categoryService.getCategory(185).execute();
			assertThat(response.isSuccessful(), CoreMatchers.is(false));
			assertThat(response.code(), equalTo(404));
	  }
}
