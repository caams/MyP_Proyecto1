public class ChocolateConAlmendra extends Chocolate{

  public ChocolateConAlmendra(){
    this.getIngredientes().add(new Ingrediente("Almendra", 3, 2000));
  }

  @Override public void prepararBase(){
    System.out.println("Preparando base de chocolate");
  }

  @Override public void agregarComplemento(){
    System.out.println("Agregando almendra");
  }
}
