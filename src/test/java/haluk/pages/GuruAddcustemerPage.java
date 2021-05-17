package haluk.pages;

import haluk.utilities.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuruAddcustemerPage extends Browser {
    public GuruAddcustemerPage() {
        PageFactory.initElements(driver,this);
    }
@FindBy(xpath = "//div//h3//a[@href='addcustomer.php']")
    private WebElement addCustumer;
public void setAddCustumer(){
    addCustumer.click();
}


}
