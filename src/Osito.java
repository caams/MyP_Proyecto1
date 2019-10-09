public class Osito extends Gomita{

  public Osito(){
    this.nombre = "Ositos con Azúcar";
    this.getIngredientes().add(new Ingrediente("Cobertura de azúcar", 17, 1500));
  }

  @Override public void elegirMolde(){
    System.out.println("Tomando molde para ositos...");
  }

  @Override public void agregarComplemento(){
    System.out.println("Cobertura de azúcar");
  }
}
