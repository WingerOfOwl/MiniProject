package Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllProduct {
    protected static String url = "https://altashop-api.fly.dev/api/products";
    @Step("I set Get All Product Endpoint")
    public String setAllProductApiEndpoint() {

        return url ;
    }

    @Step("I send Get All Product request")
    public void sendGetAllProductHttpRequest() {
        SerenityRest.given()
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .when()
                .get(setAllProductApiEndpoint());
    }

    @Step("I receive valid Get All Product HTTP response code 200")
    public void validateAllProductHttpResponseCode200() {

        restAssuredThat(response -> response.statusCode(200));
    }


    @Step("I set Get All Product Endpoint with wrong URL")
    public String setAllProductApiEndpoint2() {

        return url + "1";
    }

    @Step("I send Get All Product request2")
    public void setWrongAllProductHttpGet() {
        SerenityRest.given()
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .when()
                .get(setAllProductApiEndpoint2());
    }

    @Step("I receive valid Get All Product HTTP response code 404")
    public void validateAllCategory2HttpResponseCode404() {

        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Post All Product Endpoint")
    public String setPostAllProductEndpoint(){

        return url;
    }

    @Step("I send Post All Product Endpoint Request")
    public void sendPostAllProductHttpRequest2(){
        JSONObject requestBody = new JSONObject();

        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .body(requestBody.toJSONString()).post(setPostAllProductEndpoint());
    }

    @Step("I receive valid HTTP Post All Product response code 405")
    public void receivePostAllProductHttpResponseCode405(){
        restAssuredThat(response -> response.statusCode(500));
    }
}

