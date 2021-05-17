package haluk.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/Telecom.feature",
        glue    ="/haluk",
        dryRun = false,
        tags = "@TC_3"
)
public class CukRunner {
}
