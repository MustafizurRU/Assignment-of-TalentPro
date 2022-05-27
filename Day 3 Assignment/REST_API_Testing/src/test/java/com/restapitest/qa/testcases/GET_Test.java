package com.restapitest.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GET_Test {

	@Test(priority = 1)
	public void FirstTest()
	{
		
		Response response = get("https://reqres.in/api/users?page=2");
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode, 200);
		
	}
	@Test(priority = 2)
	public void secondTest()
	{
		given()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.body("data.id[1]", equalTo(8))
			.body("data.email", hasItems("lindsay.ferguson@reqres.in"))
			.body("data.first_name", hasItems("Lindsay"))
			.body("data.last_name",hasItems("Ferguson"))
			;
			
	}
}
