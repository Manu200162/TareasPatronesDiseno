package TareaFactoryMethodAerolinea;

public class CreatorVoletoStandard extends CreatorVoletos{
    @Override
    public VoletoStandard create() {
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

        VoletoStandard voletoStandard = new VoletoStandard();
        voletoStandard.setNumeroVuelo(767);
        voletoStandard.setOrigen(partida);
        voletoStandard.setDestino(llegada);
        voletoStandard.setAvion(avion);
        voletoStandard.setPasajero(pasajero);
        voletoStandard.setNumeroAsiento("12-B");
        voletoStandard.setCostoPasaje("400$");

        return voletoStandard;
    }
}
