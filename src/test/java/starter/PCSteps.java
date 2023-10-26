package starter;

import ProductsCategories.CreateACategory;
import ProductsCategories.DeleteACategory;
import ProductsCategories.GetAllCategory;
import ProductsCategories.GetCategoryByID;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PCSteps {
    @Steps
    CreateACategory cac;
    @Steps
    GetCategoryByID cib;
    @Steps
    GetAllCategory gac;
    @Steps
    DeleteACategory dac;

    @Given("I set Post A Category Endpoint")
    public void setCreateCategoryEndpoint(){
        cac.setCreateCategoryEndpoint();
    }
    @When("I send Post A Category request")
    public void sendPostCreateCategoryHttpRequest(){
        cac.sendPostCreateCategoryHttpRequest();
    }

    @Then("I receive valid Post A Category HTTP response code 200")
    public void receivePostCreateCategoryHttpResponseCode200(){
        cac.receivePostCreateCategoryHttpResponseCode200();
    }
    @Given("I set Post A Category Endpoint with wrong URL")
    public void setWrongCreateCategoryEndpoint(){
        cac.setWrongCreateCategoryEndpoint();
    }
    @When("I send Post A Category request2")
    public void sendPostCreateCategoryHttpRequest2(){
        cac.sendPostCreateCategoryHttpRequest2();
    }

    @Then("I receive valid Post A Category HTTP response code 404")
    public void receiveWrongPostCreateCategoryHttpResponseCode404(){
        cac.receiveWrongPostCreateCategoryHttpResponseCode404();
    }
    @Given("I set Put A Category Endpoint")
    public void setPutCreateCategoryEndpoint1(){
        cac.setPutCreateCategoryEndpoint1();
    }
    @When("I send Put A Category Endpoint Request")
    public void sendPutCreateCategoryHttpRequest1(){
        cac.sendPutCreateCategoryHttpRequest1();
    }

    @Then("I receive valid HTTP Put A Category response code 405")
    public void receivePUTCreateCategoryHttpResponseCode405(){
        cac.receivePUTCreateCategoryHttpResponseCode405();
    }

    @Given("I set Get Category By ID Endpoint with wrong URL")
    public void setCategoryByIDApiEndpoint2(){
        cib.setCategoryByIDApiEndpoint2();
    }
    @When("I send Get Category By ID request2")
    public void setWrongCategoryByIDHttpGet(){
        cib.setWrongCategoryByIDHttpGet();
    }

    @Then("I receive valid Get Category By ID 2 HTTP response code 404")
    public void validateCategoryByID2HttpResponseCode404(){
        cib.validateCategoryByID2HttpResponseCode404();
    }

    @Given("I set Post Category By ID Endpoint")
    public void setWrongCategoryByIDEndpoint(){
        cib.setWrongCategoryByIDEndpoint();
    }
    @When("I send Post Category By ID Endpoint Request")
    public void sendPostCategoryByIDHttpRequest2(){
        cib.sendPostCategoryByIDHttpRequest2();
    }

    @Then("I receive valid HTTP Post Category By ID response code 405")
    public void receivePostCategoryByIDHttpResponseCode405(){
        cib.receivePostCategoryByIDHttpResponseCode405();
    }

    @Given("I set Get All Category Endpoint")
    public void setAllCategoryApiEndpoint(){
        gac.setAllCategoryApiEndpoint();
    }
    @When("I send Get All Category request")
    public void sendGetAllCategoryHttpRequest(){
        gac.sendGetAllCategoryHttpRequest();
    }

    @Then("I receive valid Get All Category HTTP response code 200")
    public void validateAllCategoryHttpResponseCode200(){
        gac.validateAllCategoryHttpResponseCode200();
    }
    @Given("I set Get All Category Endpoint with wrong URL")
    public void setAllCategoryApiEndpoint2(){
        gac.setAllCategoryApiEndpoint2();
    }
    @When("I send Get All Category By ID request2")
    public void setWrongAllCategoryHttpGet(){
        gac.setWrongAllCategoryHttpGet();
    }

    @Then("I receive valid Get All Category By ID 2 HTTP response code 404")
    public void validateAllCategory2HttpResponseCode404(){
        gac.validateAllCategory2HttpResponseCode404();
    }
    @Given("I set Post All Category Endpoint")
    public void setPostAllCategoryEndpoint(){
        gac.setPostAllCategoryEndpoint();
    }
    @When("I send Post All Category Endpoint Request")
    public void sendPostAllCategoryHttpRequest2(){
        gac.sendPostAllCategoryHttpRequest2();
    }

    @Then("I receive valid HTTP Post All Category response code 405")
    public void receivePostAllCategoryHttpResponseCode405(){
        gac.receivePostAllCategoryHttpResponseCode405();
    }

    @Given("I set Delete A Category Endpoint")
    public void setDeleteCategoryEndpoint(){
        dac.setDeleteCategoryEndpoint();
    }
    @When("I send Delete A Category request")
    public void sendDeleteCategoryHttpRequest(){
        dac.sendDeleteCategoryHttpRequest();
    }

    @Then("I receive valid Delete A Category HTTP response code 200")
    public void validHttpDELETECategoryResponseCode200(){
        dac.validHttpDELETECategoryResponseCode200();
    }

    @Given("I set Delete A Category Endpoint with wrong URL")
    public void setWrongDeleteCategoryEndpoint(){
        dac.setWrongDeleteCategoryEndpoint();
    }
    @When("I send Delete A Category By ID request2")
    public void sendDeleteCategoryHttpRequest1(){
        dac.sendDeleteCategoryHttpRequest1();
    }

    @Then("I receive valid Delete A Category By ID 2 HTTP response code 404")
    public void validHttpDELETECategory2ResponseCode404(){
        dac.validHttpDELETECategory2ResponseCode404();
    }

    @Given("I set Put A Category Endpoint 2")
    public void setPutACategoryEndpoint1(){
        dac.setPutACategoryEndpoint1();
    }
    @When("I send Put A Category Endpoint Request 2")
    public void sendPutOrderByIDHttpRequest1(){
        dac.sendPutOrderByIDHttpRequest1();
    }

    @Then("I receive valid HTTP Put A Category 2 response code 405")
    public void receivePUTOrderByIDHttpResponseCode405(){
        dac.receivePUTOrderByIDHttpResponseCode405();
    }
}
