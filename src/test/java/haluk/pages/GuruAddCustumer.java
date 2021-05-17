package haluk.pages;

import haluk.utilities.Browser;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuruAddCustumer extends Browser {
    public GuruAddCustumer() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1")
    private WebElement titleVerfy;
    @FindBy(id = "done")
   private WebElement done;
    @FindBy(id="pending")
    private WebElement pending;
    @FindBy(id= "fname")
    private WebElement fname;
    @FindBy(id = "lname")
    private WebElement lname;
    @FindBy(id = "email")
    private WebElement eemail;
    @FindBy(xpath = "//textarea[@id='message']")
    private WebElement textarea;
    @FindBy(id = "telephoneno")
    private WebElement telephoneno;
    @FindBy(xpath = "//input[@name='submit']")
    private WebElement submitBtn;
    @FindBy(xpath = "//h1")
    private  WebElement AccesDetailVerfy;


    public void setTitleVerfy(){
        WebElement title=titleVerfy;
        title.getText();
        if(title.getText().equals("Add Customer")){
        System.out.println("headers for add customers are match");
           }else {
            System.out.println("headers for add customers are not  match");
        }

    }
//    public void setBackgraund(String bCheck){
//
//        switch (bCheck){
//            case "Done":
//                done.click();
//                break;
//            case "Pending":
//                pending.click();
//                break;
//        }
//    }

    public void setBillingAddress(String fName, String lName, String email, String address, String pNumber){
        fname.sendKeys(fName);
        lname.sendKeys(lName);
        eemail.sendKeys(email);
        textarea.sendKeys(address);
        telephoneno.sendKeys(pNumber);
        submitBtn.click();

    }
    public void setAccesDetailVerfy(String adress){
       WebElement AdrsDetail=AccesDetailVerfy;
        if(AdrsDetail.getText().equals("Access Details to Guru99 Telecom")){
            System.out.println("Address verifications are match");
        }else {
            System.out.println("Address verifications are not  match");
        }

    }









}
