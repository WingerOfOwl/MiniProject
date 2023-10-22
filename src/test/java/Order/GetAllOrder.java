package Order;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllOrder {
    protected static String url = "https://altashop-api.fly.dev/api/orders";

    @Step("I set Get All Order Endpoint")
    public String setGetAllOrderApiEndpoint() {

        return url;
    }

    @Step("I send Get All Order HTTP request")
    public void sendGetAllOrderHttpRequest() {
        SerenityRest.given()
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .when()
                .get(setGetAllOrderApiEndpoint());
    }

    @Step("I receive Get All Order valid HTTP response code 200")
    public void validateAllOrderHttpResponseCode200() {

        restAssuredThat(response -> response.statusCode(200));
    }


    @Step("I set Get All Order Wrong Endpoint")
    public String setAllOrderApiEndpoint2() {

        return url + "helel";
    }

    @Step("I send Get All Order HTTP request2")
    public void setWrongAllOrderHttpGet() {
        SerenityRest.given()
                .when()
                .get(setAllOrderApiEndpoint2());
    }

    @Step("I receive Get All Order valid HTTP response code 404")
    public void validateHelloHttpResponseCode404() {

        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Post Get All Order Endpoint")
    public String setPostAllOrderEndpoint(){
        return url;
    }

    @Step("I send Post Get All Order Endpoint Request")
    public void sendPostAllOrderHttpRequest2(){
        JSONObject requestBody = new JSONObject();

        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw").body(requestBody.toJSONString()).post(setPostAllOrderEndpoint());
    }

    @Step("I receive Get All Order valid HTTP response code 405")
    public void receivePostAllOrderHttpResponseCode405(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
