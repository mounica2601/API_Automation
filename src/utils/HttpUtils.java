package utils;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HttpUtils {

	   public static Response postHttpRequest(String authToken,String baseUrl, String path, JSONObject jsonBody){
	       RestAssured.baseURI = baseUrl;
	       RequestSpecBuilder builder = new RequestSpecBuilder();
		   
	       if(authToken!=null) {
	    	   builder.addHeader("Authorization", "Bearer "+authToken);
	   		   builder.setContentType("application/json; charset=UTF-8");
	       }
	       
			RequestSpecification requestSpec = builder.build();

	       return RestAssured
	               .given()
	               .spec(requestSpec)
	               .body(jsonBody)
	               .when()
	               .post(path);
	   }
	   
	   public static Response postHttpRequest(String baseUrl, String path, JSONObject jsonBody){
	       RestAssured.baseURI = baseUrl;
	       RequestSpecBuilder builder = new RequestSpecBuilder();
		   builder.setContentType("application/json; charset=UTF-8");
	       RequestSpecification requestSpec = builder.build();

	       return RestAssured
	               .given()
	               .spec(requestSpec)
	               .body(jsonBody)
	               .when()
	               .post(path);
	   }


	   
	   public static Response getHttpRequest(String authToken,String baseUrl, String path){
	       RestAssured.baseURI = baseUrl;
		   RequestSpecBuilder builder = new RequestSpecBuilder();
		   
	       if(authToken!=null) {
	    	   builder.addHeader("Authorization", "Bearer "+authToken);
	   		   builder.setContentType("application/json; charset=UTF-8");
	       }
	       
			RequestSpecification requestSpec = builder.build();

	       return RestAssured
	               .given()
	               .spec(requestSpec)
	               .when()
	               .get(path);
	   }

	   public static Response putHttpRequest(String authToken,String baseUrl, String path, JSONObject jsonBody){
	       RestAssured.baseURI = baseUrl;
	       RequestSpecBuilder builder = new RequestSpecBuilder();
		   
	       if(authToken!=null) {
	    	   builder.addHeader("Authorization", "Bearer "+authToken);
	   		   builder.setContentType("application/json; charset=UTF-8");
	       }
	       
			RequestSpecification requestSpec = builder.build();
			
	       return RestAssured
	               .given()
	               .spec(requestSpec)
	               .body(jsonBody)
	               .when()
	               .put(path);
	   }

	    public static Response deleteHttpRequest(String authToken,String baseUrl, String path){
	       RestAssured.baseURI = baseUrl;
	       RequestSpecBuilder builder = new RequestSpecBuilder();
		   
	       if(authToken!=null) {
	    	   builder.addHeader("Authorization", "Bearer "+authToken);
	   		   builder.setContentType("application/json; charset=UTF-8");
	       }
	       
			RequestSpecification requestSpec = builder.build();
	       return RestAssured
	               .given()
	               .spec(requestSpec)
	               .when()
	               .delete(path);
	    }
	}
