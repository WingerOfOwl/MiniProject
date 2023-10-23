package ProductsCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCategory {
    protected static String url = "https://altashop-api.fly.dev/api/categories";
    @Step("I set Get All Category Endpoint")
    public String setAllCategoryApiEndpoint() {

        return url ;
    }

    @Step("I send Get All Category request")
    public void sendGetAllCategoryHttpRequest() {
        SerenityRest.given()
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .when()
                .get(setAllCategoryApiEndpoint());
    }

    @Step("I receive valid Get All Category HTTP response code 200")
    public void validateAllCategoryHttpResponseCode200() {

        restAssuredThat(response -> response.statusCode(200));
    }


    @Step("I set Get All Category Endpoint with wrong URL")
    public String setAllCategoryApiEndpoint2() {

        return url + "1";
    }

    @Step("I send Get All Category By ID request2")
    public void setWrongAllCategoryHttpGet() {
        SerenityRest.given()
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .when()
                .get(setAllCategoryApiEndpoint2());
    }

    @Step("I receive valid Get All Category By ID 2 HTTP response code 404")
    public void validateAllCategory2HttpResponseCode404() {

        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Post All Category Endpoint")
    public String setPostAllCategoryEndpoint(){

        return url;
    }

    @Step("I send Post All Category Endpoint Request")
    public void sendPostAllCategoryHttpRequest2(){
        JSONObject requestBody = new JSONObject();

        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .body(requestBody.toJSONString()).post(setPostAllCategoryEndpoint());
    }

    @Step("I receive valid HTTP Post All Category response code 405")
    public void receivePostAllCategoryHttpResponseCode405(){
        restAssuredThat(response -> response.statusCode(500));
    }
}
