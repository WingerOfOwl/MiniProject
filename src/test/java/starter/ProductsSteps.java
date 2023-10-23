package starter;

import Products.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ProductsSteps {
    @Steps
    GetAllProduct gap;
    @Steps
    CreateANewProduct canp;
    @Steps
    GetProductByID gpbi;
    @Steps
    DeleteAProduct dap;
    @Steps
    GetProductRating gpr;
@Steps
    AssignAProduct ap;
@Steps
CreateAComment cac;
@Steps
GetProductComment gpc;
    @Given("I set Get All Product Endpoint")
    public void setAllProductApiEndpoint(){
        gap.setAllProductApiEndpoint();
    }
    @When("I send Get All Product request")
    public void sendGetAllProductHttpRequest(){
        gap.sendGetAllProductHttpRequest();
    }

    @Then("I receive valid Get All Product HTTP response code 200")
    public void validateAllProductHttpResponseCode200(){
        gap.validateAllProductHttpResponseCode200();
    }

    @Given("I set Get All Product Endpoint with wrong URL")
    public void setAllProductApiEndpoint2(){
        gap.setAllProductApiEndpoint2();
    }
    @When("I send Get All Product request2")
    public void setWrongAllProductHttpGet(){
        gap.setWrongAllProductHttpGet();
    }

    @Then("I receive valid Get All Product HTTP response code 404")
    public void validateAllCategory2HttpResponseCode404(){
        gap.validateAllCategory2HttpResponseCode404();
    }


    @Given("I set Post All Product Endpoint")
    public void setPostAllProductEndpoint(){
        gap.setPostAllProductEndpoint();
    }
    @When("I send Post All Product Endpoint Request")
    public void sendPostAllProductHttpRequest2(){
        gap.sendPostAllProductHttpRequest2();
    }

    @Then("I receive valid HTTP Post All Product response code 405")
    public void receivePostAllProductHttpResponseCode405(){
        gap.receivePostAllProductHttpResponseCode405();
    }

    @Given("I set Post a new Product Endpoint")
    public void setANewProductEndpoint(){
        canp.setANewProductEndpoint();
    }
    @When("I send Post a new Product request")
    public void sendPostANewProductHttpRequest(){
        canp.sendPostANewProductHttpRequest();
    }

    @Then("I receive valid Post a new Product HTTP response code 200")
    public void receivePostANewProductHttpResponseCode200(){
        canp.receivePostANewProductHttpResponseCode200();
    }

    @Given("I set Post a new Product Endpoint with wrong URL")
    public void setWrongANewProductEndpoint(){
        canp.setWrongANewProductEndpoint();
    }
    @When("I send Post a new Product request2")
    public void sendPostANewProductHttpRequest2(){
        canp.sendPostANewProductHttpRequest2();
    }

    @Then("I receive valid Post a new Product HTTP response code 404")
    public void receiveWrongPostANewProductHttpResponseCode404(){
        canp.receiveWrongPostANewProductHttpResponseCode404();
    }

    @Given("I set Put a new Product Endpoint")
    public void setPutANewProductEndpoint1(){
        canp.setPutANewProductEndpoint1();
    }
    @When("I send Put a new Product Endpoint Request")
    public void sendPutANewProductHttpRequest1(){
        canp.sendPutANewProductHttpRequest1();
    }

    @Then("I receive valid HTTP Put a new Product response code 405")
    public void receivePUTANewProductHttpResponseCode405(){
        canp.receivePUTANewProductHttpResponseCode405();
    }

    @Given("I set Get Product by ID Endpoint")
    public void setProductByIDApiEndpoint(){
        gpbi.setProductByIDApiEndpoint();
    }
    @When("I send Get Product by ID request")
    public void sendGetProductByIDHttpRequest(){
        gpbi.sendGetProductByIDHttpRequest();
    }

    @Then("I receive valid Get Product by ID HTTP response code 200")
    public void validateProductByIDHttpResponseCode200(){
        gpbi.validateProductByIDHttpResponseCode200();
    }


    @Given("I set Get Product by ID Endpoint with wrong URL")
    public void setProductByIDApiEndpoint2(){
        gpbi.setProductByIDApiEndpoint2();
    }
    @When("I send Get Product by ID request2")
    public void setWrongProductByIDHttpGet(){
        gpbi.setWrongProductByIDHttpGet();
    }

    @Then("I receive valid Get Product by ID HTTP response code 404")
    public void validateProductByID2HttpResponseCode404(){
        gpbi.validateProductByID2HttpResponseCode404();
    }


    @Given("I set Post Product by ID Endpoint")
    public void setPostProductByIDEndpoint(){
        gpbi.setPostProductByIDEndpoint();
    }
    @When("I send Post Product by ID Endpoint Request")
    public void sendPostProductByIDHttpRequest2(){
        gpbi.sendPostProductByIDHttpRequest2();
    }

    @Then("I receive valid HTTP Post Get Product by ID response code 405")
    public void receivePostProductByIDHttpResponseCode405(){
        gpbi.receivePostProductByIDHttpResponseCode405();
    }

    @Given("I set Delete Product Endpoint")
    public void setDeleteProductEndpoint(){
        dap.setDeleteProductEndpoint();
    }
    @When("I send Delete Product request")
    public void sendDeleteProductHttpRequest(){
        dap.sendDeleteProductHttpRequest();
    }

    @Then("I receive valid Delete Product HTTP response code 200")
    public void validHttpDeleteProductResponseCode200(){
        dap.validHttpDeleteProductResponseCode200();
    }

    @Given("I set Delete Product Endpoint with wrong URL")
    public void setWrongDeleteProductEndpoint(){
        dap.setWrongDeleteProductEndpoint();
    }
    @When("I send Delete Product request2")
    public void sendDeleteProductHttpRequest1(){
        dap.sendDeleteProductHttpRequest1();
    }

    @Then("I receive valid Delete Product HTTP response code 404")
    public void validHttpDeleteProduct2ResponseCode404(){
        dap.validHttpDeleteProduct2ResponseCode404();
    }



    @Given("I set Post Product Endpoint")
    public void setPostProductEndpoint1(){
        dap.setPostProductEndpoint1();
    }
    @When("I send Post Product Endpoint Request")
    public void sendPostDeleteProductHttpRequest1(){
        dap.sendPostDeleteProductHttpRequest1();
    }

    @Then("I receive valid HTTP Post Product response code 405")
    public void receivePostDeleteProductHttpResponseCode405(){
        dap.receivePostDeleteProductHttpResponseCode405();
    }


    @Given("I set Post Assign Product Endpoint")
    public void setCreateAssignEndpoint(){
        ap.setCreateAssignEndpoint();
    }
    @When("I send Post Assign Product request")
    public void sendPostCreateAssignHttpRequest(){
        ap.sendPostCreateAssignHttpRequest();
    }

    @Then("I receive valid Post Assign Product HTTP response code 200")
    public void receivePostCreateAssignHttpResponseCode200(){
        ap.receivePostCreateAssignHttpResponseCode200();
    }


    @Given("I set Post Assign Product Endpoint with wrong URL")
    public void setWrongCreateAssignEndpoint(){
        ap.setWrongCreateAssignEndpoint();
    }
    @When("I send Post Assign Product request2")
    public void sendPostCreateAssignHttpRequest2(){
        ap.sendPostCreateAssignHttpRequest2();
    }

    @Then("I receive valid Post Assign Product HTTP response code 404")
    public void receiveWrongPostCreateAssignHttpResponseCode404(){
        ap.receiveWrongPostCreateAssignHttpResponseCode404();
    }

    @Given("I set Put Assign Product Endpoint")
    public void setPutCreateAssignEndpoint1(){
        ap.setPutCreateAssignEndpoint1();
    }
    @When("I send Put Assign Product Endpoint Request")
    public void sendPutCreateAssignHttpRequest1(){
        ap.sendPutCreateAssignHttpRequest1();
    }

    @Then("I receive valid HTTP Put Assign Product response code 405")
    public void receivePUTCreateAssignHttpResponseCode405(){
        ap.receivePUTCreateAssignHttpResponseCode405();
    }

    @Given("I set Get Product Rating Endpoint")
    public void setGetProductRatingApiEndpoint(){
        gpr.setGetProductRatingApiEndpoint();
    }
    @When("I send Get Product Rating request")
    public void sendGetProductRatingHttpRequest(){
        gpr.sendGetProductRatingHttpRequest();
    }

    @Then("I receive valid Get Product Rating HTTP response code 200")
    public void validateGetProductRatingHttpResponseCode200(){
        gpr.validateGetProductRatingHttpResponseCode200();
    }

    @Given("I set Get Product Rating Endpoint with wrong URL")
    public void setGetProductRatingApiEndpoint2(){
        gpr.setGetProductRatingApiEndpoint2();
    }
    @When("I send Get Product Rating request2")
    public void setWrongGetProductRatingHttpGet() {
        gpr.setWrongGetProductRatingHttpGet() ;
    }

    @Then("I receive valid Get Product Rating HTTP response code 404")
    public void validateGetProductRatingHttpResponseCode404(){
        gpr.validateGetProductRatingHttpResponseCode404();
    }

    @Given("I set Put Product Rating Endpoint")
    public void setPutGetProductRatingEndpoint1(){
        gpr.setPutGetProductRatingEndpoint1();
    }
    @When("I send Put Product Rating Endpoint Request")
    public void sendPutOrderByIDHttpRequest1(){
        gpr.sendPutOrderByIDHttpRequest1();
    }

    @Then("I receive valid HTTP Put Product Rating response code 405")
    public void receivePUTOrderByIDHttpResponseCode405(){
        gpr.receivePUTOrderByIDHttpResponseCode405();
    }

    @Given("I set Post Comment Endpoint")
    public void setCreateCommentEndpoint(){
        cac.setCreateCommentEndpoint();
    }
    @When("I send Post Comment request")
    public void sendPostCreateCommentHttpRequest(){
        cac.sendPostCreateCommentHttpRequest();
    }

    @Then("I receive valid Post Comment HTTP response code 200")
    public void receivePostCreateCommentHttpResponseCode200(){
        cac.receivePostCreateCommentHttpResponseCode200();
    }


    @Given("I set Post Comment Endpoint with wrong URL")
    public void setWrongCreateCommentEndpoint(){
        cac.setWrongCreateCommentEndpoint();
    }
    @When("I send Post Comment request2")
    public void sendPostCreateCommentHttpRequest2(){
        cac.sendPostCreateCommentHttpRequest2();
    }

    @Then("I receive valid Post Comment HTTP response code 404")
    public void receiveWrongPostCreateCommentHttpResponseCode404(){
        cac.receiveWrongPostCreateCommentHttpResponseCode404();
    }


    @Given("I set Put Comment Endpoint")
    public void setPutCreateCommentEndpoint1(){
        cac.setPutCreateCommentEndpoint1();
    }
    @When("I send Put Comment Endpoint Request")
    public void sendPutCreateCommentHttpRequest1(){
        cac.sendPutCreateCommentHttpRequest1();
    }

    @Then("I receive valid HTTP Put Comment response code 405")
    public void receivePUTCreateCommentHttpResponseCode405(){
        cac.receivePUTCreateCommentHttpResponseCode405();
    }


    @Given("I set Get Product Comment Endpoint")
    public void setGetProductCommentApiEndpoint(){
        gpc.setGetProductCommentApiEndpoint();
    }
    @When("I send Get Product Comment request")
    public void sendGetProductCommentHttpRequest(){
        gpc.sendGetProductCommentHttpRequest();
    }

    @Then("I receive valid Get Comment Rating HTTP response code 200")
    public void validateGetProductCommentHttpResponseCode200(){
        gpc.validateGetProductCommentHttpResponseCode200();
    }


    @Given("I set Get Product Comment Endpoint with wrong URL")
    public void setGetProductCommentApiEndpoint2(){
        gpc.setGetProductCommentApiEndpoint2();
    }
    @When("I send Get Product Comment request2")
    public void setWrongGetProductCommentHttpGet(){
        gpc.setWrongGetProductCommentHttpGet();
    }

    @Then("I receive valid Get Comment Rating HTTP response code 404")
    public void validateGetProductCommentHttpResponseCode404(){
        gpc.validateGetProductCommentHttpResponseCode404();
    }


    @Given("I set Put Product Comment Endpoint")
    public void setPutGetProductCommentEndpoint1(){
        gpc.setPutGetProductCommentEndpoint1();
    }
    @When("I send Put Product Comment Endpoint Request")
    public void sendPutCommentHttpRequest1(){
        gpc.sendPutCommentHttpRequest1();
    }

    @Then("I receive valid HTTP Put Product Comment response code 405")
    public void receivePUTCommentHttpResponseCode405(){
        gpc.receivePUTCommentHttpResponseCode405();
    }


}
