package questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static utils.enums.EnumVariablesSesion.SESION_MENSAJERESERVA;

public class ValidacionReserva implements Question<String> {

    public static ValidacionReserva es() {
        String texto = Serenity.sessionVariableCalled(SESION_MENSAJERESERVA.getValor()).toString();
        if (texto.contains("Hotel Roma")) {
            System.out.println("SE SELECCIONO LA PRIMERA OPCION DE FORMA CORRECTA");
        }
        else {
            System.out.println("ERROR AL SELECCIONAR LA PRIMERA OPCION");
        }
        return new ValidacionReserva();
    }

    @Override
    public String answeredBy(Actor actor) {
        return null;
    }
}
