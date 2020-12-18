package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.CodePopupPage;
import pages.HomePage;

public class ProblemStepDef {

private CodePopupPage codePopupPage;
    private HomePage homepage;
    public ProblemStepDef(){
        codePopupPage = new CodePopupPage();
        homepage= new HomePage();

    }
    @Given("^user navigate to \"([^\"]*)\"$")
    public void user_navigate_to(String url) throws Throwable {
        homepage.validatePageURL(url);
    }
    @When("^user clicks on Programmatic Nested tabs run button$")
    public void user_clicks_on_Programmatic_Nested_tabs_run_button() throws Throwable {
        homepage.clickprogrammaticNestedTabsRunBtn();

    }


    @And("^user click \"([^\"]*)\" in the modal$")
    public void userClickInTheModal(String arg0) throws Throwable {

        codePopupPage.switchToFrame();
        codePopupPage.clickTabButtons(arg0);
    }

    @And("^user click \"([^\"]*)\" text$")
    public void userClickText(String innerText) throws Throwable {
        codePopupPage.clickInnerText(innerText);
    }

    @Then("^I validate the text message \"([^\"]*)\"$")
    public void iValidateTheTextMessage(String expectedMessage) throws Throwable {
        boolean actualMessage= codePopupPage.validateMessageTxt(expectedMessage);
        System.out.println(actualMessage);
        Assert.assertTrue(actualMessage);
    }

    @And("^user click \"([^\"]*)\"$")
    public void userClick(String arg0) throws Throwable {
       codePopupPage .clickTabButtns(arg0);
    }
}
