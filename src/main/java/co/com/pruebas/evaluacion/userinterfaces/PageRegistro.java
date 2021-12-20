package co.com.pruebas.evaluacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageRegistro {
    public static final Target BTN_CREATECOUNT = Target.the("boton que permite crear cuenta de usuario")
            .located(By.id("SubmitCreate"));
    public static final Target TXT_EMAIL = Target.the("campo para ingresar el correo del usuario a registrar")
            .located(By.id("email_create"));
    public static final Target RB_GENERO = Target.the("Radio Button que permite escoger el genero")
            .located(By.id("id_gender1"));
    public static final Target TXT_NOMBRE = Target.the("campo para ingresar el nombre del usuario")
            .located(By.id("customer_firstname"));
    public static final Target TXT_APELLIDO = Target.the("campo para ingresar el apellido del usuario")
            .located(By.id("customer_lastname"));
    public static final Target TXT_PASSWORD = Target.the("campo para ingresar la contrasena del usuario")
            .located(By.id("passwd"));
    public static final Target LST_DIA = Target.the("campo para ingresar el dia de nacimiento del usuario")
            .located(By.id("days"));
    public static final Target LST_MES = Target.the("campo para ingresar el mes de nacimiento del usuario")
            .located(By.id("months"));
    public static final Target LST_YEAR = Target.the("campo para ingresar el anio de nacimiento del usuario")
            .located(By.id("years"));
    public static final Target TXT_NOMBREFACTURA = Target.the("campo para ingresar el nombre donde se entrega producto")
            .located(By.id("firstname"));
    public static final Target TXT_APELLIDOFACTURA = Target.the("campo para ingresar el nombre donde se entrega producto")
            .located(By.id("lastname"));
    public static final Target TXT_COMPANY = Target.the("campo para ingresar la compañia donde se entrega producto")
            .located(By.id("company"));
    public static final Target TXT_ADDRESS = Target.the("campo para ingresar la direccion donde se entrega producto")
            .located(By.id("address1"));
    public static final Target TXT_CIUDAD = Target.the("campo para ingresar la ciudad donde se entrega producto")
            .located(By.id("city"));
    public static final Target LST_ESTADO = Target.the("campo para ingresar el estado donde se entrega producto")
            .located(By.id("id_state"));
    public static final Target TXT_POSTAL = Target.the("campo para ingresar el codigo postal dónde se entrega producto")
            .located(By.id("postcode"));
    public static final Target LST_PAIS = Target.the("campo para ingresar el pais dónde se entrega producto")
            .located(By.id("id_country"));
    public static final Target TXT_MOBILPHONE = Target.the("campo para ingresar el telefono donde se entrega producto")
            .located(By.id("phone_mobile"));
    public static final Target TXT_ALIASADDRESS = Target.the("campo para ingresar el alias de la direccion dónde se entrega producto")
            .located(By.id("alias"));
    public static final Target BTN_SUBMITACOUNT = Target.the("Boton para enviar formulario de registro")
            .located(By.id("submitAccount"));
    public static final Target NOTI_MENSAJE = Target.the("Mensaje a validar para registro exitoso")
            .located(By.className("info-account"));
}
