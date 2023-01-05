package lesson5.api;

import lesson5.dto.Product;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ProductService {
	  @GET("products/{id}")
	  Call<Product> getProduct(@Path("id") int id);
	  @POST("products")
	  Call<Product> createProduct(@Body Product createProductRequest);
	  @DELETE("products/{id}")
	  Call<ResponseBody> deleteProduct(@Path("id") int id);
}
