public class ChocolateConLeche extends Chocolate{

  public ChocolateConLeche(){
    this.getIngredientes().add(new Ingrediente("Leche", 5, 2000));
  }

  @Override public void prepararBase(){
    System.out.println("Preparando base de chocolate con leche");
  }

  @Override public void agregarComplemento(){}
}
