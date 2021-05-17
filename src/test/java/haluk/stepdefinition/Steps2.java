package haluk.stepdefinition;

import haluk.pages.GuruAddCustumer;
import haluk.pages.GuruAddcustemerPage;
import haluk.utilities.Browser;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Steps2 extends Browser {
    @When("The user wants to add a customer")
    public void the_user_wants_to_add_a_customer() {
        GuruAddcustemerPage guruAddcustemerPage=new GuruAddcustemerPage();
        guruAddcustemerPage.setAddCustumer();
    }
    @Then("The user wants to verifyy {string} header")
    public void the_user_wants_to_verifyy_header(String string) {
        GuruAddCustumer guruAddCustumer=new GuruAddCustumer();
        guruAddCustumer.setTitleVerfy();

    }

    @Then("The user wants to enter background check as {string}")
    public void the_user_wants_to_enter_background_check_as(String bCheck) {
//        GuruAddCustumer guruAddCustumer=new GuruAddCustumer();
//        guruAddCustumer.setBackgraund(bCheck);
  }

    @Then("The user wants to enter billing address as {string} and {string} and {string} and {string} and {string}")
    public void the_user_wants_to_enter_billing_address_as_and_and_and_and(String fName, String lName, String email, String address, String pNumber) {
        GuruAddCustumer guruAddCustumer=new GuruAddCustumer();
        guruAddCustumer.setBillingAddress(fName,lName,email,address,pNumber);
    }
    @Then("The wants to verify message as {string}")
    public void the_wants_to_verify_message_as(String adress) {
        GuruAddCustumer guruAddCustumer=new GuruAddCustumer();
        guruAddCustumer.setAccesDetailVerfy(adress);


    }
}
