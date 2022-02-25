package core;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;

public class BaseTest {

    private Response response;
    private RequestSpecification request;

    public void setupRequest() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;

        RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
        reqBuilder.setContentType(ContentType.JSON);
        RestAssured.requestSpecification = reqBuilder.build();

        ResponseSpecBuilder resBuilder = new ResponseSpecBuilder();
        resBuilder.expectResponseTime(Matchers.lessThan(3000L));
        RestAssured.responseSpecification = resBuilder.build();
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

    public void setupBodyRequest(String body) {
        setupRequest();
        request = RestAssured.given().body(body);
    }

    public void sendPost(String path) {

        response = request.post(path);
    }

    public void sendPath(String valeu){
        response = request.patch();
    }

    public Response getResponse() {
        return response;
    }
}

