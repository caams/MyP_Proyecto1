import java.util.ArrayList;

public class FactoryProducer{

  public Maquina getFactory(String tipo){
    Maquina fabrica = null;
    tipo = tipo.toLowerCase();
    if(tipo.contains("chocolate") || tipo.contains("gusanito") ||
       tipo.contains("frutita") || tipo.contains("osito")){
      fabrica = Wonka3000.getInstance();
    }else if(tipo.contains("galleta")){
      fabrica = Galleneitor5000.getInstance();
    }
    return fabrica;
  }

}
