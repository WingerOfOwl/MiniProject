package Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductByID {
    protected static String url = "https://altashop-api.fly.dev/api/products/85899";
    @Step("I set Get Product by ID Endpoint")
    public String setProductByIDApiEndpoint() {

        return url ;
    }

    @Step("I send Get Product by ID request")
    public void sendGetProductByIDHttpRequest() {
        SerenityRest.given()
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .when()
                .get(setProductByIDApiEndpoint());
    }

    @Step("I receive valid Get Product by ID HTTP response code 200")
    public void validateProductByIDHttpResponseCode200() {

        restAssuredThat(response -> response.statusCode(200));
    }


    @Step("I set Get Product by ID Endpoint with wrong URL")
    public String setProductByIDApiEndpoint2() {

        return url + "1";
    }

    @Step("I send Get Product by ID request2")
    public void setWrongProductByIDHttpGet() {
        SerenityRest.given()
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .when()
                .get(setProductByIDApiEndpoint2());
    }

    @Step("I receive valid Get Product by ID HTTP response code 404")
    public void validateProductByID2HttpResponseCode404() {

        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Post Product by ID Endpoint")
    public String setPostProductByIDEndpoint(){

        return url;
    }

    @Step("I send Post Product by ID Endpoint Request")
    public void sendPostProductByIDHttpRequest2(){
        JSONObject requestBody = new JSONObject();

        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .body(requestBody.toJSONString()).post(setPostProductByIDEndpoint());
    }

    @Step("I receive valid HTTP Post Get Product by ID response code 405")
    public void receivePostProductByIDHttpResponseCode405(){
        restAssuredThat(response -> response.statusCode(405));
    }
}

