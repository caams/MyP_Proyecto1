public class ChocolateConAlmendra extends Chocolate{

  public ChocolateConAlmendra(){
  }

  @Override public void prepararBase(){
    System.out.println("Preparando base de chocolate");
  }

  @Override public void agregarComplemento(){
    System.out.println("Agregando almendra");
  }
}
