package api_test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetTestWithPathVariable {
    private static final Logger LOGGER = LogManager.getLogger(GetTestWithPathVariable.class);
    @Test

    public void getSingleUser() {
        LOGGER.info("--------API Test: Get Single User--------");

        RestAssured.baseURI = "https://reqres.in/api/users/";
        RequestSpecification httpRequest = RestAssured.given();
        String id = "2";
        Response response = httpRequest.request(Method.GET, id);
        LOGGER.debug(response.getBody().asString());

        Assert.assertEquals(response.getStatusCode(),200);

        JsonPath jsonPath = response.jsonPath();

        String actualEamilId = jsonPath.getString("data.email");
        String expectedEmailId = "janet.weaver@reqres.in";

        Assert.assertEquals(actualEamilId,expectedEmailId);
        LOGGER.info("----------End Test: Get All Users With Query Parameter--------");
    }
    @Test
    public void attemptToGetUserWithInvaidId() {
        LOGGER.info("----------API Test: Attempt to retrieve User with invalid id");
        RestAssured.baseURI = "https://reqres.in/api/users/";

        RequestSpecification httpRequest = RestAssured.given();
        String id = "23";
        Response response = httpRequest.request(Method.GET, id);
        LOGGER.debug(response.getBody().asString());

        Assert.assertEquals(response.getStatusCode(),404);

        JsonPath jsonPath = response.jsonPath();
        String actualResponse = jsonPath.get().toString();

        String expectedResponse= "{}";
        Assert.assertEquals(actualResponse,"{}");
        LOGGER.info("---------End Test: Get Attempt to retrieve User with invalid id");
    }
}
