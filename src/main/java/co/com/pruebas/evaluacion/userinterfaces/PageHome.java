package co.com.pruebas.evaluacion.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageHome {
    public static final Target BTN_SIGNIN = Target.the("Boton que permite acceder al formulario de registro").
            located(By.className("login"));
}
