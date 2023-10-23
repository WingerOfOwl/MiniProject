package Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateAComment {
    protected static String url = "https://altashop-api.fly.dev/api/products/2/comments";
    @Step("I set Post Comment Endpoint")
    public String setCreateCommentEndpoint() {
        return url;
    }

    @Step("I send Post Comment request")
    public void sendPostCreateCommentHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("content", "the games are great including Gran Turismo 7 but sadly GT4 is much better");


        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw").body(requestBody.toJSONString()).post(setCreateCommentEndpoint());
    }

    @Step("I receive valid Post Comment HTTP response code 200")
    public void receivePostCreateCommentHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set Post Comment Endpoint with wrong URL")
    public String setWrongCreateCommentEndpoint(){
        return url + "derr";
    }

    @Step("I send Post Comment request2")
    public void sendPostCreateCommentHttpRequest2(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("content", "the games are great including Gran Turismo 7 but sadly GT4 is much better");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setWrongCreateCommentEndpoint());
    }

    @Step("I receive valid Post Comment HTTP response code 404")
    public void receiveWrongPostCreateCommentHttpResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Put Comment Endpoint")
    public String setPutCreateCommentEndpoint1(){
        return url;
    }

    @Step("I send Put Comment Endpoint Request")
    public void sendPutCreateCommentHttpRequest1(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("content", "the games are great including Gran Turismo 7 but sadly GT4 is much better");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutCreateCommentEndpoint1());
    }
    @Step("I receive valid HTTP Put Comment response code 405")
    public void receivePUTCreateCommentHttpResponseCode405(){
        restAssuredThat(response -> response.statusCode(405));
    }
}

