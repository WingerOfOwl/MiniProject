package Order;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateNewOrder {
    protected String url = "https://altashop-api.fly.dev/api/orders";
    @Step("I set POST New Order Endpoint")
    public String setNewOrderEndpoint() {
        return url;
    }

    @Step("I send POST New Order HTTP request")
    public void sendPostNewOrderHttpRequest() {
        JSONArray orderItems = new JSONArray();
        JSONObject orderItem = new JSONObject();
        orderItem.put("product_id", 11649);
        orderItem.put("quantity", 1);
        orderItems.add(orderItem);

        JSONArray requestBody = new JSONArray();
        JSONObject orderCreate = new JSONObject();
        orderCreate.put("order_items", orderItems);
        requestBody.add(orderCreate);

        SerenityRest
                .given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(setNewOrderEndpoint());
    }

    @Step("I receive POST New Order valid HTTP response code 200")
    public void receivePostNewOrderHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }


    @Step("I set POST New Order Wrong Endpoint")
    public String setWrongNewOrderEndpoint(){
        return url + "derr";
    }

    @Step("I send POST New Order HTTP request2")
    public void sendPostNewOrderHttpRequest2(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("product_id", 2);
        requestBody.put("quantity", 1);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setWrongNewOrderEndpoint());
    }

    @Step("I receive POST New Order valid HTTP response code 404")
    public void receiveWrongPostNewOrderHttpResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

@Step("I set Put New Order Endpoint")
public String setPutNewOrderEndpoint1(){
        return url;
        }

@Step("I send Put New Order Endpoint Request")
public void sendPutNewOrderHttpRequest1(){
        JSONObject requestBody = new JSONObject();
    requestBody.put("product_id", 2);
    requestBody.put("quantity", 1);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutNewOrderEndpoint1());
        }
@Step("I receive New Order valid HTTP response code 405")
public void receivePUTNewOrderHttpResponseCode405(){
        restAssuredThat(response -> response.statusCode(405));
        }
}
