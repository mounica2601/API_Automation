package pages;


import io.restassured.response.Response;
import utils.HttpUtils;

public class UsersPage extends BasePage {

	public Response getUsers(String token) {
		Response res = HttpUtils.getHttpRequest(token, testconfig.getProperty("baseurl"),
				"/api/unknown");
		return res;
	}
}
