package starter;

import Hello.Hellos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HelloSteps {
@Steps
Hellos hello;
    @Given("I set GET Hello Endpoint")
    public void setHelloApiEndpoint(){
        hello.setHelloApiEndpoint();
    }
    @When("I send GET Hello HTTP request")
    public void sendGetHelloHttpRequest(){
        hello.sendGetHelloHttpRequest();
    }

    @Then("I receive valid HTTP response code 200")
    public void validateHelloHttpResponseCode200(){
        hello.validateHelloHttpResponseCode200();
    }

    @Given("I set GET Hello Wrong Endpoint")
    public void setHelloApiEndpoint2(){
        hello.setHelloApiEndpoint2();
    }
    @When("I send GET Hello HTTP request2")
    public void setWrongHelloHttpGet(){
        hello.setWrongHelloHttpGet();
    }

    @Then("I receive valid HTTP response code 404")
    public void validateHelloHttpResponseCode404(){
        hello.validateHelloHttpResponseCode404();
    }

    @Given("I set POST Hello Endpoint")
    public void setWrongHelloEndpoint(){
        hello.setWrongHelloEndpoint();
    }
    @When("I send POST Hello Endpoint Request")
    public void sendPostHttpRequest2(){
        hello.sendPostHttpRequest2();
    }

    @Then("I receive valid HTTP response code 405")
    public void receivePostHelloHttpResponseCode405(){
        hello.receivePostHelloHttpResponseCode405();
    }
}
