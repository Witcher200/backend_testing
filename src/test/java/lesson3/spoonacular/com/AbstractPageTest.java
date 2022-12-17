package lesson3.spoonacular.com;

import org.junit.jupiter.api.BeforeAll;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class AbstractPageTest {

	  static Properties prop = new Properties();
	  private static String sponacularAPI;
	  private static String baseURL;
	  private static String MealPlannerURL;

	  private static String plusURL;

	  @BeforeAll
	  static void initTest() throws IOException {
			InputStream confFile = new FileInputStream("src/main/resources/my.properties");
			prop.load(confFile);

			sponacularAPI = prop.getProperty("sponacularAPI");
			baseURL = prop.getProperty("baseURL");
			MealPlannerURL = prop.getProperty("MealPlannerURL");
			plusURL = prop.getProperty("plusURL");
	  }

	  public static String getSponacularAPI() {
			return sponacularAPI;
	  }

	  public static String getBaseURL() {
			return baseURL;
	  }

	  public static String getMealURL() {return MealPlannerURL;}

	  public static String getPlusURL() {return plusURL;}
}
