public class GalletaSalada extends Galleta{

  public GalletaSalada(){
    this.getIngredientes().add(new Ingrediente("Sal", 17, 2000));
  }

  @Override public void prepararMasa(){
    System.out.println("Preparando masa para galletas saladas");
  }

  @Override public void agregarComplemento(){}
}
