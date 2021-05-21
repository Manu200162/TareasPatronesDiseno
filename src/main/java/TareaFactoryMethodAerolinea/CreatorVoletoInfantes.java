package TareaFactoryMethodAerolinea;

public class CreatorVoletoInfantes extends CreatorVoletos{
    @Override
    public VoletoInfantes create() {
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

        VoletoInfantes voletoInfantes = new VoletoInfantes();
        voletoInfantes.setNumeroVuelo(767);
        voletoInfantes.setOrigen(partida);
        voletoInfantes.setDestino(llegada);
        voletoInfantes.setAvion(avion);
        voletoInfantes.setPasajero(pasajero);
        voletoInfantes.setNumeroAsiento("12-B");
        voletoInfantes.setCostoEspecial("300$");

        return voletoInfantes;

    }
}
