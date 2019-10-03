public class ChocolateConAlmendra extends Chocolate{
  
  @Override public void prepararBase(){
    System.out.println("Preparando base de chocolate");
  }

  @Override public void agregarComplemento(){
    System.out.println("Agregando almendra");
  }
}
