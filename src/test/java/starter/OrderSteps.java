package starter;

import Order.CreateNewOrder;
import Order.GetAllOrder;
import Order.GetOrderByID;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class OrderSteps {
    @Steps
    CreateNewOrder newOrder;
    @Steps
    GetAllOrder allOrder;
    @Steps
    GetOrderByID orderByID;

    @Given("I set POST New Order Endpoint")
    public void setNewOrderEndpoint(){
        newOrder.setNewOrderEndpoint();
    }
    @When("I send POST New Order HTTP request")
    public void sendPostNewOrderHttpRequest(){
        newOrder.sendPostNewOrderHttpRequest();
    }

    @Then("I receive POST New Order valid HTTP response code 200")
    public void receivePostNewOrderHttpResponseCode200(){
        newOrder.receivePostNewOrderHttpResponseCode200();
    }

    @Given("I set POST New Order Wrong Endpoint")
    public void setWrongNewOrderEndpoint(){
        newOrder.setWrongNewOrderEndpoint();
    }
    @When("I send POST New Order HTTP request2")
    public void sendPostNewOrderHttpRequest2(){
        newOrder.sendPostNewOrderHttpRequest2();
    }

    @Then("I receive POST New Order valid HTTP response code 404")
    public void receiveWrongPostNewOrderHttpResponseCode404(){
        newOrder.receiveWrongPostNewOrderHttpResponseCode404();
    }

    @Given("I set Put New Order Endpoint")
    public void setPutNewOrderEndpoint1(){
        newOrder.setPutNewOrderEndpoint1();
    }
    @When("I send Put New Order Endpoint Request")
    public void sendPutNewOrderHttpRequest1(){
        newOrder.sendPutNewOrderHttpRequest1();
    }

    @Then("I receive New Order valid HTTP response code 405")
    public void receivePUTNewOrderHttpResponseCode405(){
        newOrder.receivePUTNewOrderHttpResponseCode405();
    }

    @Given("I set Get All Order Endpoint")
    public void setGetAllOrderApiEndpoint(){
        allOrder.setGetAllOrderApiEndpoint();
    }
    @When("I send Get All Order HTTP request")
    public void sendGetAllOrderHttpRequest(){
        allOrder.sendGetAllOrderHttpRequest();
    }

    @Then("I receive Get All Order valid HTTP response code 200")
    public void validateAllOrderHttpResponseCode200(){
        allOrder.validateAllOrderHttpResponseCode200();
    }

    @Given("I set Get All Order Wrong Endpoint")
    public void setAllOrderApiEndpoint2(){
        allOrder.setAllOrderApiEndpoint2();
    }
    @When("I send Get All Order HTTP request2")
    public void setWrongAllOrderHttpGet(){
        allOrder.setWrongAllOrderHttpGet();
    }

    @Then("I receive Get All Order valid HTTP response code 404")
    public void validateHelloHttpResponseCode404(){
        allOrder.validateHelloHttpResponseCode404();
    }

    @Given("I set Post Get All Order Endpoint")
    public void setPostAllOrderEndpoint(){
        allOrder.setPostAllOrderEndpoint();
    }
    @When("I send Post Get All Order Endpoint Request")
    public void sendPostAllOrderHttpRequest2(){
        allOrder.sendPostAllOrderHttpRequest2();
    }

    @Then("I receive Get All Order valid HTTP response code 405")
    public void receivePostAllOrderHttpResponseCode405(){
        allOrder.receivePostAllOrderHttpResponseCode405();
    }

    @Given("I set Get Order By ID Endpoint")
    public void setGetOrderByIDApiEndpoint(){
        orderByID.setGetOrderByIDApiEndpoint();
    }
    @When("I send Get Order By ID HTTP request")
    public void sendGetOrderByIDHttpRequest(){
        orderByID.sendGetOrderByIDHttpRequest();
    }

    @Then("I receive Get Order By ID valid HTTP response code 404")
    public void validateOrderByIDHttpResponseCode404(){
        orderByID.validateOrderByIDHttpResponseCode404();
    }

    @Given("I set Get Order By ID Wrong Endpoint")
    public void setOrderByIDApiEndpoint2(){
        orderByID.setOrderByIDApiEndpoint2();
    }
    @When("I send Get Order By ID HTTP request2")
    public void setWrongOrderByIDHttpGet(){
        orderByID.setWrongOrderByIDHttpGet();
    }

    @Then("I receive Get Order By ID valid HTTP response code 400")
    public void validateOrderByIDHttpResponseCode400(){
        orderByID.validateOrderByIDHttpResponseCode400();
    }

    @Given("I set Put Get Order By ID Endpoint")
    public void setPutOrderByIDEndpoint1(){
        orderByID.setPutOrderByIDEndpoint1();
    }
    @When("I send Put Get Order By ID Endpoint Request")
    public void sendPutOrderByIDHttpRequest1(){
        orderByID.sendPutOrderByIDHttpRequest1();
    }

    @Then("I receive Get Order By ID valid HTTP response code 405")
    public void receivePUTOrderByIDHttpResponseCode405(){
        orderByID.receivePUTOrderByIDHttpResponseCode405();
    }






}
