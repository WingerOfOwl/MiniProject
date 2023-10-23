package ProductsCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetCategoryByID {
    protected static String url = "https://altashop-api.fly.dev/api/categories/";

    @Step("I set Get Category By ID Endpoint")
    public String setCategoryByIDApiEndpoint() {

        return url + "1";
    }

    @Step("I send Get Category By ID request")
    public void sendGetCategoryByIDHttpRequest() {
        SerenityRest.given()
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .when()
                .get(setCategoryByIDApiEndpoint());
    }

    @Step("I receive valid Get Category By ID HTTP response code 404")
    public void validateCategoryByIDHttpResponseCode404() {

        restAssuredThat(response -> response.statusCode(404));
    }


    @Step("I set Get Category By ID Endpoint with wrong URL")
    public String setCategoryByIDApiEndpoint2() {

        return url + "1";
    }

    @Step("I send Get Category By ID request2")
    public void setWrongCategoryByIDHttpGet() {
        SerenityRest.given()
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .when()
                .get(setCategoryByIDApiEndpoint2());
    }

    @Step("I receive valid Get Category By ID 2 HTTP response code 404")
    public void validateCategoryByID2HttpResponseCode404() {

        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Post Category By ID Endpoint")
    public String setWrongCategoryByIDEndpoint(){
        return url + "1";
    }

    @Step("I send Post Category By ID Endpoint Request")
    public void sendPostCategoryByIDHttpRequest2(){
        JSONObject requestBody = new JSONObject();

        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw").body(requestBody.toJSONString()).post(setWrongCategoryByIDEndpoint());
    }

    @Step("I receive valid HTTP Post Category By ID response code 405")
    public void receivePostCategoryByIDHttpResponseCode405(){
        restAssuredThat(response -> response.statusCode(405));
    }
}
