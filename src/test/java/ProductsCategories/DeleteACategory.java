package ProductsCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteACategory {
    protected String url = "https://altashop-api.fly.dev/api/categories/1";
    @Step("I set Delete A Category Endpoint")
    public String setDeleteCategoryEndpoint(){
        return url;
    }

    @Step("I send Delete A Category request")
    public void sendDeleteCategoryHttpRequest(){
        SerenityRest.given().delete(setDeleteCategoryEndpoint());
    }
    @Step("I receive valid Delete A Category HTTP response code 200")
    public void validHttpDELETECategoryResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set Delete A Category Endpoint with wrong URL")
    public String setWrongDeleteCategoryEndpoint(){
        return url + "/Jiddan";
    }

    @Step("I send Delete A Category By ID request2")
    public void sendDeleteCategoryHttpRequest1(){
        SerenityRest.given().delete(setWrongDeleteCategoryEndpoint());
    }
    @Step("I receive valid Delete A Category By ID 2 HTTP response code 404")
    public void validHttpDELETECategory2ResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Put A Category Endpoint 2")
    public String setPutACategoryEndpoint1(){
        return url;
    }

    @Step("I send Put A Category Endpoint Request 2")
    public void sendPutOrderByIDHttpRequest1(){
        JSONObject requestBody = new JSONObject();

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPutACategoryEndpoint1());
    }
    @Step("I receive valid HTTP Put A Category 2 response code 405")
    public void receivePUTOrderByIDHttpResponseCode405(){
        restAssuredThat(response -> response.statusCode(405));
    }
}
