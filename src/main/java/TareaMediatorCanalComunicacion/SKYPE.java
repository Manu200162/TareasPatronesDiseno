package TareaMediatorCanalComunicacion;

import java.util.HashMap;
import java.util.Map;

public class SKYPE implements ICanalComunicacion{
    private Map<String,QA> mapQA = new HashMap<>();
    private Map<String,DEV>mapDEV= new HashMap<>();
    private Map<String,SM>mapSM= new HashMap<>();

    public void addPersonaChat(Object persona){
        if(persona instanceof QA){
            mapQA.put(((QA) persona).getCi(),(QA)persona);
        }else if(persona instanceof DEV){
            mapDEV.put(((DEV) persona).getCi(),(DEV)persona);
        }else if(persona instanceof SM){
            mapSM.put(((SM) persona).getCi(),(SM)persona);
        }
    }
    @Override
    public void send(String Message, Colleague colleague) {
        Object personaParseOrigen = (Object) colleague;
        if(personaParseOrigen instanceof QA){
            for(String num: mapQA.keySet()){
                if(!(mapQA.get(num) == (QA)personaParseOrigen))
                mapQA.get(num).messageReceived(Message);
            }
        }else if(personaParseOrigen instanceof DEV){
            for(String num: mapDEV.keySet()){
                if(!(mapDEV.get(num) == (DEV)personaParseOrigen))
                    mapDEV.get(num).messageReceived(Message);
            }

        }else if(personaParseOrigen instanceof SM){
            for(String num: mapQA.keySet()){
                    mapQA.get(num).messageReceived(Message);
            }
            for(String num: mapDEV.keySet()){
                    mapDEV.get(num).messageReceived(Message);
            }
            for(String num: mapSM.keySet()){
                if(!(mapSM.get(num) == (SM)personaParseOrigen))
                    mapSM.get(num).messageReceived(Message);
            }
        }
    }
}
