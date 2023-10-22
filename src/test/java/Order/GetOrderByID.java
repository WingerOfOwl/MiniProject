package Order;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetOrderByID {
    protected static String url = "https://altashop-api.fly.dev/api/orders/1";

    @Step("I set Get Order By ID Endpoint")
    public String setGetOrderByIDApiEndpoint() {

        return url;
    }

    @Step("I send Get Order By ID HTTP request")
    public void sendGetOrderByIDHttpRequest() {
        SerenityRest.given()
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .when()
                .get(setGetOrderByIDApiEndpoint());
    }

    @Step("I receive Get Order By ID valid HTTP response code 404")
    public void validateOrderByIDHttpResponseCode404() {

        restAssuredThat(response -> response.statusCode(404));
    }


    @Step("I set Get Order By ID Wrong Endpoint")
    public String setOrderByIDApiEndpoint2() {

        return url + "helel";
    }

    @Step("I send Get Order By ID HTTP request2")
    public void setWrongOrderByIDHttpGet() {
        SerenityRest.given()
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .when()
                .get(setOrderByIDApiEndpoint2());
    }

    @Step("I receive Get Order By ID valid HTTP response code 400")
    public void validateOrderByIDHttpResponseCode400() {

        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I set Put Get Order By ID Endpoint")
    public String setPutOrderByIDEndpoint1(){
        return url;
    }

    @Step("I send Put Get Order By ID Endpoint Request")
    public void sendPutOrderByIDHttpRequest1(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("product_id", 2);
        requestBody.put("quantity", 1);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutOrderByIDEndpoint1());
    }
    @Step("I receive Get Order By ID valid HTTP response code 405")
    public void receivePUTOrderByIDHttpResponseCode405(){
        restAssuredThat(response -> response.statusCode(405));
    }
}
