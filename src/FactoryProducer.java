public class FactoryProducer{

  public Maquina getFactory(String tipo){
    if(tipo.equalsIgnoreCase("Chocolate"))
      return new FabricaChocolate();
    else if(tipo.equalsIgnoreCase("Gomita"))
      return new FabricaGomita();
    else if(tipo.equalsIgnoreCase("Galleta"))
      return new FabricaGalleta();
    return null;
  }

}
