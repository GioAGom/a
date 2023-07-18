package tasks;


import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import static userinterfaces.Elementos.*;
import static utils.enums.EnumVariablesSesion.SESION_MENSAJERESERVA;

public class Formularios implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Date checkIn;
        Date checkOut;

        DateFormat dateFormat = new SimpleDateFormat("MMM d yyyy");
        String date = dateFormat.format(new Date());
        System.out.println("Fecha Actual "+date);

        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(dateFormat.parse(date));
            checkIn = dateFormat.parse(date);
            checkOut = dateFormat.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        calendar.setTime(checkIn);
        calendar.add(Calendar.DAY_OF_YEAR, 2);
        String checkInF=new SimpleDateFormat("d MMM yyyy").format(calendar.getTime());

        calendar.setTime(checkOut);
        calendar.add(Calendar.DAY_OF_YEAR, 7);
        String checkOutF=new SimpleDateFormat("d MMM yyyy").format(calendar.getTime());

        System.out.println(checkInF +" fecha check in");
        System.out.println(checkOutF +" fecha checkOutF");

        actor.attemptsTo(Enter.theValue("Rome").into(TXT_LOCATION));
        actor.attemptsTo(Enter.theValue(checkInF).into(TXT_CHECKIN));
        actor.attemptsTo(Enter.theValue(checkOutF).into(TXT_CHECKONT));
        actor.attemptsTo(Enter.theValue("2").into(TXT_ROOMS));
        actor.attemptsTo(Enter.theValue("3").into(TXT_ADULTS));
        actor.attemptsTo(Enter.theValue("2").into(TXT_CHILDREN));
        actor.attemptsTo(Click.on(BTN_SEARCH));

        String texto = Text.of(TXT_RESERVA).viewedBy(actor).asString();
        if (texto.contains("HOTELS")) {
            System.out.println("SE REALIZO LA BUSQUEDA EXITOSAMENTE");
            actor.attemptsTo(Click.on(LKN_OPCION1));

            String texto2 = Text.of(TXT_OPCION1).viewedBy(actor).asString();
            Serenity.setSessionVariable(SESION_MENSAJERESERVA.getValor()).to(texto2);
        }
        else
            System.out.println("ERROR AL REALIZAR LA BUSQUEDA....");
   }

    public static Formularios formularios() {
        return Instrumented.instanceOf(Formularios.class).withProperties();
    }
}
