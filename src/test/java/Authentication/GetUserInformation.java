package Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetUserInformation {
    protected String url = "https://altashop-api.fly.dev/api/auth/info";
    @Step("I set Get User Information Endpoint with correct data")
    public String setUserInformationEndpoint() {

        return url;
    }

    @Step("I send Get User Information Endpoint Request")
    public void sendUserInformationHttpRequest() {
        SerenityRest.given()
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .when()
                .get(setUserInformationEndpoint());
    }

    @Step("I receive User Information valid HTTP response code 200")
    public void validateUserInformationHttpResponseCode200() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set Get User Information Endpoint with wrong data")
    public String setUserInformationApiEndpoint() {

        return url + "masa";
    }

    @Step("I send Get User Information Endpoint Request2")
    public void sendUserInformationHttpRequest2() {
        SerenityRest.given()
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .when()
                .get(setUserInformationApiEndpoint());
    }

    @Step("I receive User Information valid HTTP response code 404")
    public void validateUserInformationHttpResponseCode404() {

        restAssuredThat(response -> response.statusCode(404));
    }
    @Step("I set POST User Information Wrong Endpoint")
    public String setUserInformationEndpoint2() {
        return url;
    }

    @Step("I send POST User Information HTTP request2")
    public void sendPostUserInformationHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "someone1@mail.com");
        requestBody.put("password", "123123");

        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw").body(requestBody.toJSONString()).post(setUserInformationEndpoint2());
    }

    @Step("I receive POST User Information valid HTTP response code 405")
    public void receivePostUserInformationHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(405));
    }

}
