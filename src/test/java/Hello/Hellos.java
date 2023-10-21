package Hello;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Hellos {
    protected static String url = "https://altashop-api.fly.dev/api/hello";

    @Step("I set GET Hello Endpoint")
    public String setHelloApiEndpoint() {

        return url;
    }

    @Step("I send GET Hello HTTP request")
    public void sendGetHelloHttpRequest() {
        SerenityRest.given()
                .when()
                .get(setHelloApiEndpoint());
    }

    @Step("I receive valid HTTP response code 200")
    public void validateHelloHttpResponseCode200() {

        restAssuredThat(response -> response.statusCode(200));
    }


    @Step("I set GET Hello Wrong Endpoint")
    public String setHelloApiEndpoint2() {

        return url + "helel";
    }

    @Step("II send GET Hello HTTP request2")
    public void setWrongHelloHttpGet() {
        SerenityRest.given()
                .when()
                .get(setHelloApiEndpoint2());
    }

    @Step("I receive valid HTTP response code 404")
    public void validateHelloHttpResponseCode404() {

        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set POST Hello Endpoint")
    public String setWrongHelloEndpoint(){
        return url;
    }

    @Step("I send POST Hello Endpoint Request")
    public void sendPostHttpRequest2(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("id", 1);
        requestBody.put("title", "Mamang Laut");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setWrongHelloEndpoint());
    }

    @Step("I receive valid HTTP response code 405")
    public void receivePostHelloHttpResponseCode405(){
        restAssuredThat(response -> response.statusCode(405));
    }
}