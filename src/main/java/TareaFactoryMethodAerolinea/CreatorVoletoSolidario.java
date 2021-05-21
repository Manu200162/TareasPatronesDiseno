package TareaFactoryMethodAerolinea;

public class CreatorVoletoSolidario extends CreatorVoletos{
    @Override
    public VoletoSolidario create() {
        Origen partida= new Origen();
        partida.setPais("Estados Unidos");
        partida.setCiudad("Miami");
        partida.setAeropuerto("Miami International Airport");

        Destino llegada = new Destino();
        llegada.setPais("Bolivia");
        llegada.setCiudad("La Paz");
        llegada.setAeropuerto("El Alto Internacional");

        Avion avion = new Avion();
        avion.setMarca("Boeing");
        avion.setCapacidad(262);
        avion.setModelo("Boeing 767-300");
        avion.setNumeroPasajeros(160);

        Pasajero pasajero = new Pasajero();
        pasajero.setCi(0);
        pasajero.setNombre("Nombre");
        pasajero.setFechaNacimiento("No es valido");

        VoletoSolidario voletoSolidario = new VoletoSolidario();
        voletoSolidario.setNumeroVuelo(767);
        voletoSolidario.setOrigen(partida);
        voletoSolidario.setDestino(llegada);
        voletoSolidario.setAvion(avion);
        voletoSolidario.setPasajero(pasajero);
        voletoSolidario.setNumeroAsiento("12-B");
        voletoSolidario.setCostoPasaje("400$");
        voletoSolidario.setDescuento("200$");
        voletoSolidario.setMotivoDescuento("Promocion de repatriacion");

        return voletoSolidario;

    }
}
