package co.com.pruebas.evaluacion.stepdefinitions;

import co.com.pruebas.evaluacion.interactions.SeleccionarBoton;
import co.com.pruebas.evaluacion.questions.ValidarMensaje;
import co.com.pruebas.evaluacion.tasks.IngresarInformacion;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class RegistroStepDefinition {
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Alain");
    }
    @Given("^que el usuario se encuentra ubicado en la pagina my store$")
    public void queElUsuarioSeEncuentraUbicadoEnLaPaginaMyStore() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("http://automationpractice.com/index.php"));
    }

    @When("^cuando el usuario seleccione el boton signin$")
    public void cuandoElUsuarioSeleccioneElBotonSignin() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBoton.signin());
    }

    @And("^el usuario ingrese los datos de registro$")
    public void elUsuarioIngreseLosDatosDeRegistro() {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarInformacion.deRegistro());
    }

    @Then("^el usuario vera el siguiente mensaje (.*)$")
    public void elUsuarioVeraElSiguienteMensaje(String mensaje){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen
                .seeThat(ValidarMensaje.deInformacion(), Matchers.equalTo(mensaje)));
    }
}

