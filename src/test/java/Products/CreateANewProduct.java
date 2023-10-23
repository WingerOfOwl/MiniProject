package Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateANewProduct {
    protected String url = "https://altashop-api.fly.dev/api/products";
    @Step("I set Post a new Product Endpoint")
    public String setANewProductEndpoint() {
        return url;
    }

    @Step("I send Post a new Product request")
    public void sendPostANewProductHttpRequest() {
        JSONArray orderItems = new JSONArray();
        JSONObject orderItem = new JSONObject();
        ArrayList<Integer> categories = new ArrayList<Integer>();
        categories.add(1);
        orderItem.put("name", "Mamang Laut");
        orderItem.put("description", "play has no limits");
        orderItem.put("price", 9999);
        orderItem.put("categories", categories);

//        JSONArray requestBody = new JSONArray();
//        JSONObject orderCreate = new JSONObject();
//        orderCreate.put("order_items", orderItems);
//        requestBody.add(orderCreate);

        SerenityRest
                .given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .contentType("application/json")
                .body(orderItem.toString())
                .post(setANewProductEndpoint());
    }

    @Step("I receive valid Post a new Product HTTP response code 200")
    public void receivePostANewProductHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }


    @Step("I set Post a new Product Endpoint with wrong URL")
    public String setWrongANewProductEndpoint(){
        return url + "derr";
    }

    @Step("I send Post a new Product request2")
    public void sendPostANewProductHttpRequest2() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Mamang Laut");
        requestBody.put("description", "play has no limits");
        requestBody.put("price", 9999);
        requestBody.put("categories", 1);
        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .body(requestBody.toJSONString()).post(setWrongANewProductEndpoint());
    }

        @Step("I receive valid Post a new Product HTTP response code 404")
    public void receiveWrongPostANewProductHttpResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Put a new Product Endpoint")
    public String setPutANewProductEndpoint1(){
        return url;
    }

    @Step("I send Put a new Product Endpoint Request")
    public void sendPutANewProductHttpRequest1(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("product_id", 2);
        requestBody.put("quantity", 1);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutANewProductEndpoint1());
    }
    @Step("I receive valid HTTP Put a new Product response code 405")
    public void receivePUTANewProductHttpResponseCode405(){
        restAssuredThat(response -> response.statusCode(405));
    }
}

