package co.com.pruebas.evaluacion.questions;
import co.com.pruebas.evaluacion.userinterfaces.PageRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMensaje implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PageRegistro.NOTI_MENSAJE).viewedBy(actor).asString();
    }
    public static ValidarMensaje deInformacion(){
        return new ValidarMensaje();
    }
}
