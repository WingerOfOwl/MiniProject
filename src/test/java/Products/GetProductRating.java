package Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductRating {
    protected static String url = "https://altashop-api.fly.dev/api/products/1/ratings";

    @Step("I set Get Product Rating Endpoint")
    public String setGetProductRatingApiEndpoint() {

        return url;
    }

    @Step("I send Get Product Rating request")
    public void sendGetProductRatingHttpRequest() {
        SerenityRest.given()
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .when()
                .get(setGetProductRatingApiEndpoint());
    }

    @Step("I receive valid Get Product Rating HTTP response code 200")
    public void validateGetProductRatingHttpResponseCode200() {

        restAssuredThat(response -> response.statusCode(200));
    }


    @Step("I set Get Product Rating Endpoint with wrong URL")
    public String setGetProductRatingApiEndpoint2() {

        return url + "helel";
    }

    @Step("I send Get Product Rating request2")
    public void setWrongGetProductRatingHttpGet() {
        SerenityRest.given()
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .when()
                .get(setGetProductRatingApiEndpoint2());
    }

    @Step("I receive valid Get Product Rating HTTP response code 404")
    public void validateGetProductRatingHttpResponseCode404() {

        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Put Product Rating Endpoint")
    public String setPutGetProductRatingEndpoint1(){
        return url;
    }

    @Step("I send Put Product Rating Endpoint Request")
    public void sendPutOrderByIDHttpRequest1(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("product_id", 2);
        requestBody.put("quantity", 1);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutGetProductRatingEndpoint1());
    }
    @Step("I receive valid HTTP Put Product Rating response code 405")
    public void receivePUTOrderByIDHttpResponseCode405(){
        restAssuredThat(response -> response.statusCode(405));
    }
}
