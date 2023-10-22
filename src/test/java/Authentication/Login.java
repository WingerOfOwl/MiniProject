package Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Login {
    protected String url = "https://altashop-api.fly.dev/api/auth/login";
    @Step("I set POST Login Endpoint")
    public String setLoginEndpoint() {
        return url;
    }

    @Step("I send POST Login HTTP request")
    public void sendPostLoginHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "someone1@mail.com");
        requestBody.put("password", "123123");

        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw").body(requestBody.toJSONString()).post(setLoginEndpoint());
    }

    @Step("I receive POST Login valid HTTP response code 200")
    public void receivePostLoginHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }


    @Step("I set POST Login Wrong Endpoint")
    public String setWrongLoginEndpoint(){
        return url + "derr";
    }

    @Step("I send POST Login HTTP request2")
    public void sendPostLoginHttpRequest2(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "someone1@mail.com");
        requestBody.put("password", "123123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setWrongLoginEndpoint());
    }

    @Step("I receive POST Login valid HTTP response code 404")
    public void receiveWrongPostLoginHttpResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Get Login Endpoint")
    public String setLoginApiEndpoint() {

        return url;
    }

    @Step("I send Get Login Endpoint Request")
    public void sendLoginHttpRequest() {
        SerenityRest.given()
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .when()
                .get(setLoginApiEndpoint());
    }

    @Step("I receive Login valid HTTP response code 405")
    public void validateLoginHttpResponseCode405() {

        restAssuredThat(response -> response.statusCode(405));
    }
}
