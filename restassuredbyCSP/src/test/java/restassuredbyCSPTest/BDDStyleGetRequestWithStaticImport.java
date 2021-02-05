package restassuredbyCSPTest;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BDDStyleGetRequestWithStaticImport {

	@Test
	public void GetBookingIds_VerifyStatusCode() {
		String baseURI = "https://restful-booker.herokuapp.com";
		RequestSpecification request = given().baseUri(baseURI);
		Response response = request.when().get("/booking");
		int statusCode = response.getStatusCode();
		System.out.println("status recvd from endpoit is :  " + statusCode);
		assertEquals(200, statusCode);
	}

}
