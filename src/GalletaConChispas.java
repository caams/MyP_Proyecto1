public class GalletaConChispas extends Galleta{

  public GalletaConChispas(){
    this.getIngredientes().add(new Ingrediente("Chispas", 15, 2000));
  }

  @Override public void prepararMasa(){
    System.out.println("Preparando masa para galletas ducles con chispas");
  }

  @Override public void agregarComplemento(){}
}
