public class GalletaConChispas extends Galleta{

  public GalletaConChispas(){
    this.nombre = "Galleta Con Chispas";
    this.ingredientes.add(new Ingrediente("Chispas de Chocolate", 15, 11350));
  }

  @Override public void prepararMasa(){
    System.out.println("Preparando masa para galletas ducles con chispas...");
    this.utilizarIngrediente("Harina");
    this.utilizarIngrediente("Leche");
    this.utilizarIngrediente("Huevo");
    this.utilizarIngrediente("Azucar");
    this.utilizarIngrediente("Chispas de Chocolate");
  }

  @Override public void agregarComplemento(){}
}
