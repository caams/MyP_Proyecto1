public class Gusanito extends Gomita{

  public Gusanito(){
    this.nombre = "Gusanitos Ácidos";
    this.getIngredientes().add(new Ingrediente("Saborizante Acido", 9, 250));
  }

  @Override public void elegirMolde(){
    System.out.println("Tomando molde de gusanitos...");
  }

  @Override public void agregarComplemento(){
    this.usarIngrediente("Saborizante Acido");
  }
}
