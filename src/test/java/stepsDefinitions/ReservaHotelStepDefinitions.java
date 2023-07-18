package stepsDefinitions;

import cucumber.api.java.es.Y;
import questions.ValidacionReserva;
import tasks.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class ReservaHotelStepDefinitions {

    @Dado("^que un usuario quiere hacer una reserva de hotel$")
    public void queUnUsuarioQuiereHacerUnaReservaDeHotel() {
        theActorInTheSpotlight().wasAbleTo(Abrir.laPagina());
    }

    @Cuando("^se ingresa con usuario (.*) y contrasena (.*)$")
    public void seIngresaConUsuarioYContrasena(String usuario,String contrasena) {
        theActorInTheSpotlight().attemptsTo(
                Login.sesion(usuario,contrasena));
    }

    @Y("^se diligencia los formularios$")
    public void seDiligenciaLosFormularios() {
        theActorInTheSpotlight().attemptsTo(
                Formularios.formularios());
    }


    @Entonces("^se verifica el mensaje (.*)$")
    public void seVerificaElMensaje(String productoCarrito){
        theActorInTheSpotlight().should(seeThat(ValidacionReserva.es(), equalTo(productoCarrito)));
    }


    @Entonces("^se verifica inicio$")
    public void seVerificaCiclo() {
        theActorInTheSpotlight().attemptsTo(
                Inicio.inicio());
    }

    @Entonces("^se verifica reserva$")
    public void seVerificaReserva() {
        theActorInTheSpotlight().should(seeThat(ValidacionReserva.es()));
    }
}
