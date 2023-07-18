#language: es

Característica: Consulta de reservas
  Como usuario de la pagina DXHotels
  Quiero consultar un destino
  Para ver las opciones de hoteles dsiponibles

  Antecedentes:
    Dado que un usuario quiere hacer una reserva de hotel

  @Login
  Escenario: Ingresar a la pagina de DXHotels y hacer Login
    Cuando se ingresa con usuario ggomez@qvision.com.co y contrasena ggomez
    Entonces se verifica inicio

  @Reservar
  Escenario: Ingresar a la pagina de DXHotels y hacer reserva
    Cuando se ingresa con usuario ggomez@qvision.com.co y contrasena ggomez
    Y se diligencia los formularios
   Entonces se verifica reserva