package utils.enums;

public enum EnumVariablesSesion {

    SESION_MENSAJERESERVA("Mensaje de reserva");

    private final String valor;

    EnumVariablesSesion(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
