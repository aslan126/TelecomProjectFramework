package haluk.stepdefinition;

import haluk.utilities.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Steps extends Browser {
    @Given("The user wants to see Guru demo site")
    public void the_user_wants_to_see_guru_demo_site() {
        System.out.println("######## YOU ARE IN THE GURU WEBSITE THANKS TO HOOK CLASS  ########");
    }
    @Then("The user wants to verify {string} header")
    public void the_user_wants_to_verify_header(String string) {
        WebElement header =driver.findElement(By.xpath("//a[.='Guru99 telecom']"));
        header.getText();
        String expected = "Guru99 telecom";
        if (header.getText().equals(expected)) {
            System.out.println("you good");
        }else{
            System.out.println("the titles are not match");
         }

    }





}
