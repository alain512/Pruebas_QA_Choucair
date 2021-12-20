package co.com.pruebas.evaluacion.interactions;

import co.com.pruebas.evaluacion.userinterfaces.PageHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarBoton implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PageHome.BTN_SIGNIN));
    }
    public static SeleccionarBoton signin(){
        return instrumented(SeleccionarBoton.class);
    }
}

