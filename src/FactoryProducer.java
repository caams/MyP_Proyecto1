public class FactoryProducer{

  public Maquina getFactory(String tipo){
    if(tipo.equalsIgnoreCase("dulce"))
      return new Wonka3000();
    else if(tipo.equalsIgnoreCase("galleta"))
      return new Galleneitor5000();
    return null;
  }

}
