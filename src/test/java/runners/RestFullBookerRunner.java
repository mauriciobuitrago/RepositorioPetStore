package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/restfulbooker.feature",
        glue = "stepsdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
<<<<<<< HEAD
        plugin = {"pretty", "/cucumber-reports.html"})
=======
        plugin = {"pretty", "html:target/cucumber-reports.html"})
>>>>>>> feature/rama2

public class RestFullBookerRunner {
}
