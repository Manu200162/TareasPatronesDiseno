package TareaEjercicios2doParcial.Mediator_5;

import java.util.ArrayList;
import java.util.List;

public class Whatsapp implements ICanal {
    private List<Usuario> usuarioList = new ArrayList<>();

    public void agregarContacto(Usuario usuario){
        usuarioList.add(usuario);
    }

    @Override
    public void sendPersonal(String Message, Colleague colleague, int Usuario) {
        usuarioList.get(Usuario-1).messageReceived(Message);
    }

    @Override
    public void sendGrupal(String Message, Colleague colleague) {

        Usuario usuarioOrigen = (Usuario) colleague;
        for(Usuario usuario : usuarioList){
            if(!usuarioOrigen.getCelularNumber().equals(usuario.getCelularNumber())){
                usuario.messageReceived(Message);
            }
        }
    }
}
