package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.io.IOException;

public class StepDefinitions {

    @Given("^A valid username/password$")
    public void validUserAndPassword() {
        //some code here
    }

    @When("^SAP GUI started$")
    public void startSAPGUI() throws IOException {
        new ProcessBuilder("C:\\Program Files (x86)\\SAP\\FrontEnd\\SAPgui\\saplogon.exe").start();
    }

    @When("^Username/Password filled up$")
    public void fillCredentials() {
        System.out.println("Start to fill username/password.");
    }

    @When("^clicked on login$")
    public void clickOnLogin() {

    }

    @Then("^SAP GUI login successful$")
    public void validateLogin() {

    }

}
