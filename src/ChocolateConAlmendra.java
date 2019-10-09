public class ChocolateConAlmendra extends Chocolate{

  public ChocolateConAlmendra(){
    this.nombre = "Chocolate con Almendra";
    this.getIngredientes().add(new Ingrediente("Almendra", 1, 3000));
  }

  @Override public void prepararBase(){
    System.out.println("Preparando base de chocolate:");
    this.usarIngrediente("Manteca de Cacao");
    this.usarIngrediente("Cacao");
    this.usarIngrediente("Azucar");
  }

  @Override public void agregarComplemento(){
    this.usarIngrediente("Almendra");
  }
}
