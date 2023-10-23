package ProductsCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateACategory {
    protected static String url = "https://altashop-api.fly.dev/api/categories";
    @Step("I set Post A Category Endpoint")
    public String setCreateCategoryEndpoint() {
        return url;
    }

    @Step("I send Post A Category request")
    public void sendPostCreateCategoryHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Mamang");
        requestBody.put("description", "for gaming purposes");

        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw").body(requestBody.toJSONString()).post(setCreateCategoryEndpoint());
    }

    @Step("I receive valid Post A Category HTTP response code 200")
    public void receivePostCreateCategoryHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set Post A Category Endpoint with wrong URL")
    public String setWrongCreateCategoryEndpoint(){
        return url + "derr";
    }

    @Step("I send Post A Category request2")
    public void sendPostCreateCategoryHttpRequest2(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Mamang");
        requestBody.put("description", "for gaming purposes");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setWrongCreateCategoryEndpoint());
    }

    @Step("I receive valid Post A Category HTTP response code 404")
    public void receiveWrongPostCreateCategoryHttpResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Put A Category Endpoint")
    public String setPutCreateCategoryEndpoint1(){
        return url;
    }

    @Step("I send Put A Category Endpoint Request")
    public void sendPutCreateCategoryHttpRequest1(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Mamang");
        requestBody.put("description", "for gaming purposes");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutCreateCategoryEndpoint1());
    }
    @Step("I receive valid HTTP Put A Category response code 405")
    public void receivePUTCreateCategoryHttpResponseCode405(){
        restAssuredThat(response -> response.statusCode(405));
    }
}
