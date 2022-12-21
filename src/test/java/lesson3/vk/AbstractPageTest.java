package lesson3.vk;

import org.junit.jupiter.api.BeforeAll;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class AbstractPageTest {

	  static Properties prop = new Properties();
	  private static String VkURL;

	  @BeforeAll
	  static void initTest() throws IOException {
			InputStream confFile = new FileInputStream("src/main/resources/my.properties");
			prop.load(confFile);

			VkURL = prop.getProperty("VkURL");
	  }

	  public static String getVkURL() {
			return VkURL;
	  }

}
