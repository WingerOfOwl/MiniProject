package Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class AssignAProduct {
    protected static String url = "https://altashop-api.fly.dev/api/products/85899/ratings";
    @Step("I set Post Assign Product Endpoint")
    public String setCreateAssignEndpoint() {
        return url;
    }

    @Step("I send Post Assign Product request")
    public void sendPostCreateAssignHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("count", 4);


        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw").body(requestBody.toJSONString()).post(setCreateAssignEndpoint());
    }

    @Step("I receive valid Post Assign Product HTTP response code 200")
    public void receivePostCreateAssignHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set Post Assign Product Endpoint with wrong URL")
    public String setWrongCreateAssignEndpoint(){
        return url + "derr";
    }

    @Step("I send Post Assign Product request2")
    public void sendPostCreateAssignHttpRequest2(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("count", 4);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setWrongCreateAssignEndpoint());
    }

    @Step("I receive valid Post Assign Product HTTP response code 404")
    public void receiveWrongPostCreateAssignHttpResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Put Assign Product Endpoint")
    public String setPutCreateAssignEndpoint1(){
        return url;
    }

    @Step("I send Put Assign Product Endpoint Request")
    public void sendPutCreateAssignHttpRequest1(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("count", 4);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutCreateAssignEndpoint1());
    }
    @Step("I receive valid HTTP Put Assign Product response code 405")
    public void receivePUTCreateAssignHttpResponseCode405(){
        restAssuredThat(response -> response.statusCode(405));
    }
}

