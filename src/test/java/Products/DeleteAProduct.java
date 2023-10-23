package Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteAProduct {
    protected String url = "https://altashop-api.fly.dev/api/categories/1";
    @Step("I set Delete Product Endpoint")
    public String setDeleteProductEndpoint(){
        return url;
    }

    @Step("I send Delete Product request")
    public void sendDeleteProductHttpRequest(){
        SerenityRest.given().delete(setDeleteProductEndpoint());
    }
    @Step("I receive valid Delete Product HTTP response code 200")
    public void validHttpDeleteProductResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set Delete Product Endpoint with wrong URL")
    public String setWrongDeleteProductEndpoint(){
        return url + "/Jiddan";
    }

    @Step("I send Delete Product request2")
    public void sendDeleteProductHttpRequest1(){
        SerenityRest.given().delete(setWrongDeleteProductEndpoint());
    }
    @Step("I receive valid Delete Product HTTP response code 404")
    public void validHttpDeleteProduct2ResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Post Product Endpoint")
    public String setPostProductEndpoint1(){
        return url;
    }

    @Step("I send Post Product Endpoint Request")
    public void sendPostDeleteProductHttpRequest1(){
        JSONObject requestBody = new JSONObject();

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostProductEndpoint1());
    }
    @Step("I receive valid HTTP Post Product response code 405")
    public void receivePostDeleteProductHttpResponseCode405(){
        restAssuredThat(response -> response.statusCode(405));
    }
}
