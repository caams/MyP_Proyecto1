import java.util.ArrayList;

public class FactoryProducer{

  public Maquina getFactory(String tipo, ArrayList<Ingrediente> ingredientes){
    tipo = tipo.toLowerCase();
    if(tipo.contains("gomita") || tipo.contains("chocolate"))
      return new Wonka3000(ingredientes);
    else if(tipo.contains("galleta"))
      return new Galleneitor5000(ingredientes);
    return null;
  }

}
