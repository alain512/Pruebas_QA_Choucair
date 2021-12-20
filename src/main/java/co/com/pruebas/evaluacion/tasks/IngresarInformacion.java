package co.com.pruebas.evaluacion.tasks;
import co.com.pruebas.evaluacion.userinterfaces.PageRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import static co.com.pruebas.evaluacion.userinterfaces.PageRegistro.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarInformacion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("alain.quintero5@outlook.com").into(TXT_EMAIL),
                Click.on(BTN_CREATECOUNT),
                WaitUntil.the(RB_GENERO, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds(),
                Click.on(RB_GENERO),
                Enter.theValue("Alain").into(TXT_NOMBRE),
                Enter.theValue("Quintero").into(TXT_APELLIDO),
                Enter.theValue("Alain123*").into(TXT_PASSWORD),
                SelectFromOptions.byValue("1").from(LST_DIA),
                SelectFromOptions.byValue("12").from(LST_MES),
                SelectFromOptions.byValue("2000").from(LST_YEAR),
                Enter.theValue("Alain").into(TXT_NOMBREFACTURA),
                Enter.theValue("Quintero").into(TXT_APELLIDOFACTURA),
                Enter.theValue("Choucair").into(TXT_COMPANY),
                Enter.theValue("Calle 1").into(TXT_ADDRESS),
                Enter.theValue("Cali").into(TXT_CIUDAD),
                SelectFromOptions.byVisibleText("Alabama").from(LST_ESTADO),
                Enter.theValue("50133").into(TXT_POSTAL),
                SelectFromOptions.byVisibleText("United States").from(LST_PAIS),
                Enter.theValue("3122687751").into(TXT_MOBILPHONE),
                Enter.theValue("Casa").into(TXT_ALIASADDRESS),
                Click.on(BTN_SUBMITACOUNT)
                );
    }
    public static IngresarInformacion deRegistro(){
        return instrumented(IngresarInformacion.class);
    }
}
