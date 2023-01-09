package stepdefinitions;

import io.cucumber.java.en.*;

public class FirstStepDefinition {

    @Given("Ilk feature icin cucumber indirdim")
    public void ılk_feature_icin_cucumber_indirdim() {
        System.out.println("given step i çalıştı");
    }
    @When("Senaryomu calistirdigimda")
    public void senaryomu_calistirdigimda() {
        System.out.println("when step i çalıştı");
    }
    @Then("Senaryomun calistigini konsolda gormeliyim")
    public void senaryomun_calistigini_konsolda_gormeliyim() {
        System.out.println("then step i çalıştı");

    }
}
