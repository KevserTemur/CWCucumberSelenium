package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleSearchPage;
import utilities.Driver;

public class GoogleStepDefinitions {


    @Given("kullanıcı google sayfasındadır")
    public void kullanıcıGoogleSayfasındadır() {

        Driver.getDriver().get("https://www.google.com/");
    }

    @When("kullanıcı samsung kelimesini arar")
    public void kullanıcıSamsungKelimesiniArar() {

        GoogleSearchPage sp = new GoogleSearchPage(Driver.getDriver());
        sp.searchFor("samsung");
    }

    @Then("kullanıcı sayfada samsung kelimesi geçtiğini doğrular")
    public void kullanıcıSayfadaSamsungKelimesiGeçtiğiniDoğrular() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("samsung"));

        Driver.closeDriver();
    }
}
