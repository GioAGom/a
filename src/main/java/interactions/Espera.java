package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.awaitility.Awaitility;
import utils.UtiliTime;

import java.util.concurrent.TimeUnit;

public class Espera implements Interaction {
    private final int milisegundos;

    public Espera(int milisegundos) {
        this.milisegundos = milisegundos;
    }

    public static Espera unMomento(int miliseguntos){
        return Tasks.instrumented(Espera.class, miliseguntos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            Awaitility.await().forever().pollInterval(milisegundos,
                    TimeUnit.MILLISECONDS).until(UtiliTime.condicionExitosa());
        }catch (Exception e){
            e.getMessage();
        }
    }
}
