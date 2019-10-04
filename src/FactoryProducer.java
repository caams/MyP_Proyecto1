import java.util.ArrayList;

public class FactoryProducer{

  public Maquina getFactory(String tipo, ArrayList<Ingrediente> ingredientes){
    if(tipo.equalsIgnoreCase("dulce"))
      return new Wonka3000(ingredientes);
    else if(tipo.equalsIgnoreCase("galleta"))
      return new Galleneitor5000(ingredientes);
    return null;
  }

}
