package haluk.stepdefinition;

import haluk.utilities.Browser;
import haluk.utilities.ConfReader;
import haluk.utilities.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


import java.util.concurrent.TimeUnit;

public class Hook extends Browser {
    @Before
    public void setup(Scenario scenario) {
        Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(ConfReader.getProperties("url"));
    }
}


