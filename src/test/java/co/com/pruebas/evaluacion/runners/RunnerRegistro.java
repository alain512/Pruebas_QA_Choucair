package co.com.pruebas.evaluacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Registro_Usuario.feature",
glue = "co.com.pruebas.evaluacion",
snippets = SnippetType.CAMELCASE)
public class RunnerRegistro {

}
