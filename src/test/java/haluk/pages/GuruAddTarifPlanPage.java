package haluk.pages;

import haluk.utilities.Browser;
import io.cucumber.java.bs.I;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.PortUnreachableException;

public class GuruAddTarifPlanPage extends Browser {
    public GuruAddTarifPlanPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div//a[@href='addtariffplans.php']")
    public WebElement addtariffplans;
    @FindBy(xpath = "//h1")
    public WebElement tarifVrfy;
    @FindBy(id = "rental1")
    public WebElement rental1;
    @FindBy(xpath = "//input[@id='local_minutes']")
    public WebElement freelocal_minutes;
    @FindBy(id = "inter_minutes")
    public WebElement inter_minutes;

    @FindBy(id = "sms_pack")

    public WebElement sms_pack;
    @FindBy(id = "minutes_charges")
    public WebElement Lminutes_charges;
    @FindBy(id = "inter_charges")
    public WebElement inter_charges;
    @FindBy(id = "sms_charges")
    public WebElement sms_charges;
    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitbtn;
    @FindBy(xpath = "//h2")
    public WebElement lastVerification;

    public void setAddtariffplans() {
        addtariffplans.click();
    }

    public void setTarifVrfy() {
        System.out.println(tarifVrfy.getText());
        if (tarifVrfy.getText().equals("Add Tariff Plans")) {
            System.out.println("address tariff plan are match");
        } else {
            System.out.println("address tariff plan are not match");
        }
    }
    public void setRental1(String rent) {
        rental1.sendKeys(rent);
    }
    public void setFreelocal_minutes(String Minutes) {
        freelocal_minutes.sendKeys(Minutes);
    }
    public void setInter_minutes(String Iminutes) {
        inter_minutes.sendKeys(Iminutes);
    }
    public void setSms_pack(String Sms) {
        sms_pack.sendKeys(Sms);
    }
    public void setLocal_minutes(String LocalMinutes) {
        Lminutes_charges.sendKeys(LocalMinutes);
    }
    public void setInter_charges(String intMesageCharge) {
        inter_charges.sendKeys(intMesageCharge);
    }
    public void setSms_charges(String SmsCharge) {
        sms_charges.sendKeys(SmsCharge);
    }
    public void setSubmitbtn() {
        submitbtn.click();
    }
    public void setLastVerification() {
        if (lastVerification.getText().equals("Congratulation you add Tariff Plan")){
            System.out.println("Add tarif plan verification is successful");
        }else {
            System.out.println("Add tarif plan verification is not  successful");
        }
    }
}


