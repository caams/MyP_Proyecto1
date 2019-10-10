import java.util.ArrayList;

/**
 * Clase productora de fábricas.
 */
public class FactoryProducer{

  /**
   * Regresa la máquina productora dependiendo del tipo de producto que esté produciendo.
   * @param tipo de producto que se está produciendo.
   * @return la máquina productora en uso.
   */
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
