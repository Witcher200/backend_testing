package lesson5.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.experimental.UtilityClass;
import okhttp3.OkHttpClient;
import okhttp3.internal.platform.Platform;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

@UtilityClass
public class RetrofitUtils {
	  HttpLoggingInterceptor logging = new HttpLoggingInterceptor(new PrettyLogger());
	  OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

	  public Retrofit getRetrofit() {
			logging.setLevel(HttpLoggingInterceptor.Level.BODY);
			httpClient.addInterceptor(logging);

			return new Retrofit.Builder()
				.baseUrl(ConfigUtils.getBaseUrl())
				.addConverterFactory(JacksonConverterFactory.create())
				.client(httpClient.build())
				.build();
	  }

	  public class PrettyLogger implements HttpLoggingInterceptor.Logger {
			ObjectMapper mapper = new ObjectMapper();
			@Override
			public void log(String message) {
				  String trimmedMessage = message.trim();
				  if ((trimmedMessage.startsWith("{") && trimmedMessage.endsWith("}"))
					  || (trimmedMessage.startsWith("[") &&
					  trimmedMessage.endsWith("]"))) {
						try {
							  Object value = mapper.readValue(message, Object.class);
							  String prettyJson =
								  mapper.writerWithDefaultPrettyPrinter().writeValueAsString(value);
							  Platform.get().log(prettyJson, Platform.INFO, null);
						} catch (JsonProcessingException e) {
							  Platform.get().log(message, Platform.WARN, e);
						}
				  } else {
						Platform.get().log(message, Platform.INFO, null);
				  }
			}
	  }
}
