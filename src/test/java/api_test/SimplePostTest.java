package api_test;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimplePostTest {
    private static final Logger LOGGER = LogManager.getLogger(SimplePostTest.class);
    @Test
    public void createNewUser() {
        LOGGER.info("--------API Test: Create New User----------");
        RestAssured.baseURI = "https://reqres.in/api/users";

        RequestSpecification httpRequest = RestAssured.given();

        Faker faker = new Faker();
        String fullName = faker.name().fullName();
        LOGGER.debug("New User Full name: " + fullName);

        String userRole = faker.job().title();
        LOGGER.debug("User Job: " + userRole);

        // Creation request body
        JSONObject reqBody = new JSONObject();
        reqBody.put("name", fullName);
        reqBody.put("job", userRole);

        // Make a request to the server by specifying the HTTP Method type.
        //This will return the Response from the server. Store the response in a variable.
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(reqBody.toJSONString());

        Response response = httpRequest.request(Method.POST);
        LOGGER.debug(response.getBody().asString());

        // Assert that the correct response status code is returned.
        Assert.assertEquals(response.getStatusCode(),201);

        //
        JsonPath jsonPath = response.jsonPath();
        String actualName = jsonPath.getString("name");


        Assert.assertEquals(actualName,fullName);

        LOGGER.info("----------End Test: Create new user---------");
    }
}
