public class Frutita extends Gomita{

  public Frutita(){
    this.getIngredientes().add(new Ingrediente("Chamoy", 12, 2000));
  }

  @Override public void elegirMolde(){
    System.out.println("Tomando molde para frutitas");
  }

  @Override public void agregarComplemento(){
    System.out.println("Agregando cobertura de chamoy");
  }
}
