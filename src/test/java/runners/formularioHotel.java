package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/diligenciarFormularios.feature",
        glue={"stepsDefinitions", "utils.hooks"},
        snippets= SnippetType.CAMELCASE)

public class formularioHotel {
}
