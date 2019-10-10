import java.util.ArrayList;

public class FactoryProducer{

  public Maquina getFactory(String tipo){
    tipo = tipo.toLowerCase();
    if(tipo.contains("chocolate") || tipo.contains("gusanito") ||
       tipo.contains("frutita") || tipo.contains("osito")){
      return Wonka3000.getInstance();
    }else if(tipo.contains("galleta")){
      return Galleneitor5000.getInstance();
    }
    return null;
  }

}
