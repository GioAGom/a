package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.Elementos.*;

public class Inicio implements Task {
    public Inicio(){
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //actor.attemptsTo(Click.on(BTN_HOME));
        String texto = Text.of(TXT_HOME).viewedBy(actor).asString();
        if (texto.contains("Hotel Booking")) {
           System.out.println("INICIO DE SESION EXITOSO");
        }

    }

    public static Inicio inicio() {
        return Instrumented.instanceOf(Inicio.class).withProperties();
    }
}
