package lesson5.util;

import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;
@UtilityClass
public class ConfigUtils {
	  static Properties prop = new Properties();
	  private static InputStream configFile;
	  HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
	  OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

	  static {
			try{
			  logging.setLevel(HttpLoggingInterceptor.Level.BODY);
			  httpClient.addInterceptor(logging);
			  configFile = new FileInputStream("src/test/java/resources/aplication.properties");
			} catch(FileNotFoundException e) {
				  e.printStackTrace();
			}
	  }

	  @SneakyThrows
	  public String getBaseUrl() {
			prop.load(configFile);
			return prop.getProperty("url");
	  }
}
