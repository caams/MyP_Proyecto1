public class ChocolateConLeche extends Chocolate{

  public ChocolateConLeche(){
    this.nombre = "Chocolate con Leche";
    this.getIngredientes().add(new Ingrediente("Leche", 3, 3200));
  }

  @Override public void prepararBase(){
    System.out.println("Preparando base de chocolate con leche");
  }

  @Override public void agregarComplemento(){}
}
