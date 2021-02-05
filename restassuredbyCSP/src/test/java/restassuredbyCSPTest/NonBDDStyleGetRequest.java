package restassuredbyCSPTest;



import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class NonBDDStyleGetRequest {

	@Test
	public void GetBookingIds_VerifyStatusCode() {
		
		RequestSpecification request = RestAssured.given();
		//url+endpoint
		request.baseUri("https://restful-booker.herokuapp.com/booking");
		
		Response response = request.get();
		String resString = response.asString();
		System.out.println(resString);
		
		ValidatableResponse valRes = response.then();
		valRes.statusCode(200);

		valRes.statusLine("HTTP/1.1 200 OK");
		
	}

}
