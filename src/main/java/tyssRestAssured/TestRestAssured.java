package tyssRestAssured;



import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestRestAssured {
	@Test
public void getApiTest(){
Response resp = RestAssured.get("http://localhost:3000/posts");
int statusCode = resp.getStatusCode();
System.out.println(statusCode);
System.out.println( resp.getContentType());
//2nd commit
}
}
