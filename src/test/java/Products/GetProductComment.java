package Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductComment {
    protected static String url = "https://altashop-api.fly.dev/api/products/2/comments";

    @Step("I set Get Product Comment Endpoint")
    public String setGetProductCommentApiEndpoint() {

        return url;
    }

    @Step("I send Get Product Comment request")
    public void sendGetProductCommentHttpRequest() {
        SerenityRest.given()
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .when()
                .get(setGetProductCommentApiEndpoint());
    }

    @Step("I receive valid Get Comment Rating HTTP response code 200")
    public void validateGetProductCommentHttpResponseCode200() {

        restAssuredThat(response -> response.statusCode(200));
    }


    @Step("I set Get Product Comment Endpoint with wrong URL")
    public String setGetProductCommentApiEndpoint2() {

        return url + "helel";
    }

    @Step("I send Get Product Comment request2")
    public void setWrongGetProductCommentHttpGet() {
        SerenityRest.given()
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .when()
                .get(setGetProductCommentApiEndpoint2());
    }

    @Step("I receive valid Get Comment Rating HTTP response code 404")
    public void validateGetProductCommentHttpResponseCode404() {

        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Put Product Comment Endpoint")
    public String setPutGetProductCommentEndpoint1(){
        return url;
    }

    @Step("I send Put Product Comment Endpoint Request")
    public void sendPutCommentHttpRequest1(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("product_id", 2);
        requestBody.put("quantity", 1);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutGetProductCommentEndpoint1());
    }
    @Step("I receive valid HTTP Put Product Comment response code 405")
    public void receivePUTCommentHttpResponseCode405(){
        restAssuredThat(response -> response.statusCode(405));
    }
}
