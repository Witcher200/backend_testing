package lesson4.spoonacular;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeAll;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AbstractTest {

	  static Properties prop = new Properties();

	  protected static ResponseSpecification responseSpecification;
	  protected static RequestSpecification requestSpecification;

	  @BeforeAll
	  static void initTest() throws IOException {
			InputStream confFile = new FileInputStream("src/main/resources/my.properties");
			prop.load(confFile);



			responseSpecification = new ResponseSpecBuilder()
				.expectStatusCode(200)
				.expectStatusCode(404)

				.expectContentType(ContentType.JSON)
				.expectResponseTime(Matchers.lessThan(5000L))
				.build();

			requestSpecification = new RequestSpecBuilder()
				.addQueryParam("includeNutrition", "false")
				.setContentType(ContentType.JSON)
				.log(LogDetail.ALL)
				.build();

			RestAssured.responseSpecification = responseSpecification;
			RestAssured.requestSpecification = requestSpecification;
	  }


	  public RequestSpecification getRequestSpecification(){
			return requestSpecification;
	  }
}
