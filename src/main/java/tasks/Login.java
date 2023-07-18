package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static userinterfaces.Elementos.*;

public class Login implements Task {
    String usuario;
    String contrasena;

    public Login(String usuario, String contrasena){

        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_LOGIN),Enter.theValue(usuario).into(TXT_USU));
        //actor.attemptsTo(Enter.theValue(contrasena).into(TXT_CONTRA));
        actor.attemptsTo(Enter.theValue("CODE").into(TXT_CODE));
        actor.attemptsTo(Click.on(BTN_CANCELAR));
    }

    public static Login sesion(String usuario, String contrasena) {
        return Instrumented.instanceOf(Login.class).withProperties(usuario,contrasena);
    }
}
