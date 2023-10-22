package Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Register {
    protected String url = "https://altashop-api.fly.dev/api/auth/register";
    @Step("I set POST Register Endpoint")
    public String setRegisterEndpoint() {
        return url;
    }

    @Step("I send POST Register HTTP request")
    public void sendPostRegisterHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "someone1@mail.com");
        requestBody.put("password", "123123");
        requestBody.put("fullname", "Mamang");

        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw").body(requestBody.toJSONString()).post(setRegisterEndpoint());
    }

    @Step("I receive POST Register valid HTTP response code 200")
    public void receivePostRegisterHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(400));
    }


    @Step("I set POST Register Wrong Endpoint")
    public String setWrongRegisterEndpoint(){
        return url + "derr";
    }

    @Step("I send POST Register HTTP request2")
    public void sendPostRegisterHttpRequest2(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "someone1@mail.com");
        requestBody.put("password", "123123");
        requestBody.put("fullname", "Mamang");

        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw").body(requestBody.toJSONString()).post(setWrongRegisterEndpoint());
    }

    @Step("I receive POST Register valid HTTP response code 404")
    public void receiveWrongPostRegisterHttpResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Get Register Endpoint")
    public String setRegisterApiEndpoint() {

        return url;
    }

    @Step("I send Get Register Endpoint Request")
    public void sendRegisterHttpRequest() {
        SerenityRest.given()
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .when()
                .get( setRegisterApiEndpoint());
    }

    @Step("I receive Register valid HTTP response code 405")
    public void validateRegisterHttpResponseCode405() {

        restAssuredThat(response -> response.statusCode(405));
    }

}
