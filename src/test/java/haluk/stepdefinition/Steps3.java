package haluk.stepdefinition;

import haluk.pages.GuruAddTarifPlanPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;


public class Steps3 {
    @Then("The user wants to Add Tariff Plan")
    public void the_user_wants_to_add_tariff_plan() {
          GuruAddTarifPlanPage guruAddTarifPlanPage=new GuruAddTarifPlanPage();
          guruAddTarifPlanPage.setAddtariffplans();
    }
    @Then("The user wants to verifyyy {string} header")
    public void the_user_wants_to_verifyyy_header(String string) {
        GuruAddTarifPlanPage guruAddTarifPlanPage=new GuruAddTarifPlanPage();
        guruAddTarifPlanPage.setTarifVrfy();
    }
    @Then("The user wants to Add Tariff Plan details as")
    public void the_user_wants_to_add_tariff_plan_details_as(Map<String, String> planDetail) {
     GuruAddTarifPlanPage guruAddTarifPlanPage=new GuruAddTarifPlanPage();
     guruAddTarifPlanPage.setRental1(planDetail.get("MonthlyRental"));
     guruAddTarifPlanPage.setFreelocal_minutes(planDetail.get("FreeLocalMinutes"));
     guruAddTarifPlanPage.setInter_minutes(planDetail.get("FreeInternationalMinutes"));
     guruAddTarifPlanPage.setSms_pack(planDetail.get("FreeSMSPack"));
     guruAddTarifPlanPage.setLocal_minutes(planDetail.get("LocalPerMinutesCharges"));
     guruAddTarifPlanPage.setInter_charges(planDetail.get("InternationalPerMinutesCharges"));
     guruAddTarifPlanPage.setSms_charges(planDetail.get("SMSPerCharge"));

    }
    @Then("The user wants to submit")
    public void the_user_wants_to_submit() {
        GuruAddTarifPlanPage guruAddTarifPlanPage=new GuruAddTarifPlanPage();
        guruAddTarifPlanPage.setSubmitbtn();

    }
    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String string) {

    }






}
