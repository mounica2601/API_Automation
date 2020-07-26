package pages;

import org.json.simple.JSONObject;

import io.restassured.response.Response;
import utils.HttpUtils;

public class LoginPage extends BasePage {
	
	public Response loginTest() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("email",testconfig.getProperty("email"));
		jsonObject.put("password",testconfig.getProperty("password"));
		Response res = HttpUtils.postHttpRequest(testconfig.getProperty("baseurl"),
				"/api/login", jsonObject);
		return res;
	}
}
