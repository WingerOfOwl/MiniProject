package starter;

import Authentication.GetUserInformation;
import Authentication.Login;
import Authentication.Register;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AuthSteps {
    @Steps
    Register register;
    @Steps
    Login login;
    @Steps
    GetUserInformation getUserInformation;

    @Given("I set POST Register Endpoint")
    public void setRegisterEndpoint(){
        register. setRegisterEndpoint();
    }
    @When("I send POST Register HTTP request")
    public void sendPostRegisterHttpRequest(){
        register.sendPostRegisterHttpRequest();
    }

    @Then("I receive POST Register valid HTTP response code 200")
    public void receivePostRegisterHttpResponseCode200(){
        register.receivePostRegisterHttpResponseCode200();
    }

    @Given("I set POST Register Wrong Endpoint")
    public void setWrongRegisterEndpoint(){
        register.setWrongRegisterEndpoint();
    }
    @When("I send POST Register HTTP request2")
    public void sendPostRegisterHttpRequest2(){
        register.sendPostRegisterHttpRequest2();
    }

    @Then("I receive POST Register valid HTTP response code 404")
    public void receiveWrongPostRegisterHttpResponseCode404(){
        register.receiveWrongPostRegisterHttpResponseCode404();
    }

    @Given("I set Get Register Endpoint")
    public void setRegisterApiEndpoint(){
        register.setRegisterApiEndpoint();
    }
    @When("I send Get Register Endpoint Request")
    public void sendRegisterHttpRequest(){
        register.sendRegisterHttpRequest();
    }

    @Then("I receive Register valid HTTP response code 405")
    public void validateRegisterHttpResponseCode405(){
        register.validateRegisterHttpResponseCode405();
    }

    @Given("I set POST Login Endpoint")
    public void setLoginEndpoint(){
        login.setLoginEndpoint();
    }
    @When("I send POST Login HTTP request")
    public void sendPostLoginHttpRequest(){
        login.sendPostLoginHttpRequest();
    }

    @Then("I receive POST Login valid HTTP response code 200")
    public void receivePostLoginHttpResponseCode200(){
        login.receivePostLoginHttpResponseCode200();
    }

    @Given("I set POST Login Wrong Endpoint")
    public void setWrongLoginEndpoint(){
        login.setWrongLoginEndpoint();
    }
    @When("I send POST Login HTTP request2")
    public void sendPostLoginHttpRequest2(){
        login.sendPostLoginHttpRequest2();
    }

    @Then("I receive POST Login valid HTTP response code 404")
    public void receiveWrongPostLoginHttpResponseCode404(){
        login.receiveWrongPostLoginHttpResponseCode404();
    }

    @Given("I set Get Login Endpoint")
    public void setLoginApiEndpoint(){
        login.setLoginApiEndpoint();
    }
    @When("I send Get Login Endpoint Request")
    public void sendLoginHttpRequest(){
        login.sendLoginHttpRequest();
    }

    @Then("I receive Login valid HTTP response code 405")
    public void validateLoginHttpResponseCode405(){
        login.validateLoginHttpResponseCode405();
    }

    @Given("I set Get User Information Endpoint with correct data")
    public void setUserInformationEndpoint(){
        getUserInformation.setUserInformationEndpoint();
    }
    @When("I send Get User Information Endpoint Request")
    public void sendUserInformationHttpRequest(){
        getUserInformation.sendUserInformationHttpRequest();
    }

    @Then("I receive User Information valid HTTP response code 200")
    public void validateUserInformationHttpResponseCode200(){
        getUserInformation.validateUserInformationHttpResponseCode200();
    }

    @Given("I set Get User Information Endpoint with wrong data")
    public void setUserInformationApiEndpoint(){
        getUserInformation.setUserInformationApiEndpoint();
    }
    @When("I send Get User Information Endpoint Request2")
    public void sendUserInformationHttpRequest2(){
        getUserInformation.sendUserInformationHttpRequest2();
    }

    @Then("I receive User Information valid HTTP response code 404")
    public void validateUserInformationHttpResponseCode404(){
        getUserInformation.validateUserInformationHttpResponseCode404();
    }

    @Given("I set POST User Information Wrong Endpoint")
    public void setUserInformationEndpoint2(){
        getUserInformation.setUserInformationEndpoint2();
    }
    @When("I send POST User Information HTTP request2")
    public void sendPostUserInformationHttpRequest(){
        getUserInformation.sendPostUserInformationHttpRequest();
    }

    @Then("I receive POST User Information valid HTTP response code 405")
    public void receivePostUserInformationHttpResponseCode200(){
        getUserInformation.receivePostUserInformationHttpResponseCode405();
    }
}
