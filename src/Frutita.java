public class Frutita extends Gomita{

  public Frutita(){
    this.nombre = "Frutita con Chamoy";
    this.getIngredientes().add(new Ingrediente("Chamoy", 10, 2000));
  }

  @Override public void elegirMolde(){
    System.out.println("Tomando molde para frutitas...");
  }

  @Override public void agregarComplemento(){
    this.usarIngrediente("Chamoy");
  }
}
