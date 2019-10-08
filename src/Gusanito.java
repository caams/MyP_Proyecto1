public class Gusanito extends Gomita{

  public Gusanito(){
    this.getIngredientes().add(new Ingrediente("Saborizante ácido", 10, 2000));
  }

  @Override public void elegirMolde(){
    System.out.println("Eligiendo molde de gusanitos");
  }

  @Override public void agregarComplemento(){
    System.out.println("Agregando cobertura ácida");
  }
}
