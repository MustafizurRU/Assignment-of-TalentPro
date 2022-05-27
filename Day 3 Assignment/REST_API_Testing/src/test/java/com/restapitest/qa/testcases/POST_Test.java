package com.restapitest.qa.testcases;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class POST_Test {

	@Test
	public void FirstPostTest()
	{
		JSONObject request= new JSONObject();
		request.put("name", "Mustafizur");
		request.put("job", "Student");
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().
			header("content-type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			patch("https://reqres.in/api/users/2").
		then().
			statusCode(200).
			log().all();
			
		
	}
}
