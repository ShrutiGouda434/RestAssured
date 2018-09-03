package com.restAssured.Test;

import org.json.simple.JSONObject;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test {
//@org.testng.annotations.Test
public void readOperation() {
	Response resp = RestAssured.get(" http://localhost:3000/comments");
	//System.out.println(resp);
	System.out.println(resp.getStatusCode());
	String StringData = resp.asString();
	System.out.println(StringData);
	Assert.assertEquals(resp.getStatusCode(), 200);
}
//@org.testng.annotations.Test
//public void createOperation() {
//	 RequestSpecification request = RestAssured.given();
//	request.header("Content-Type","application/json");
//	JSONObject jobj=new JSONObject();
//	jobj.put("id", "10");
//	jobj.put("author", "shruti");
//	jobj.put("title", "Api");
//	request.body(jobj.toString());
//	Response post = request.post("http://localhost:3000/comments");
//	int statusCode = post.statusCode();
//	System.out.println(statusCode);
//	String StringData = post.asString();
//	System.out.println(StringData);
//		}
	//@org.testng.annotations.Test
	public void updateOperation() {
		RequestSpecification req = RestAssured.given();
		req.header("Content-Type","application/json");
		JSONObject jobj=new JSONObject();
		jobj.put("id", "10");
		jobj.put("name", "reatAssured");
		jobj.put("location", "bangalore");
		req.body(jobj.toString());
		Response put = req.put("http://localhost:3000/comments/10");
		int statusCode = put.statusCode();
		System.out.println(statusCode);
	System.out.println(	put.asString());
		
	}
	//@org.testng.annotations.Test
	public void patchOperation() {
		RequestSpecification req = RestAssured.given();
		req.header("Content-Type","application/json");
		JSONObject obj=new JSONObject();
		obj.put("name", "tyss");
		obj.put("location", "bommanahalli");
		req.body(obj.toString());
		Response patch = req.patch("http://localhost:3000/comments/10");
		System.out.println(patch.statusCode());
		System.out.println(patch.asString());
		
		
	}
	public void deleteOperation() {
		RequestSpecification req = RestAssured.given();
		Response delete = req.delete();
	}
	
}
