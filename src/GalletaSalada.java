public class GalletaSalada extends Galleta{

  public GalletaSalada(){
    this.nombre = "Galleta Salada";
    this.ingredientes.add(new Ingrediente("Sal", 14, 2500));
  }

  @Override public void prepararMasa(){
    System.out.println("Preparando masa para galletas saladas...");
    this.utilizarIngrediente("Harina");
    this.utilizarIngrediente("Leche");
    this.utilizarIngrediente("Huevo");
    this.utilizarIngrediente("Sal");
  }

  @Override public void agregarComplemento(){}
}
