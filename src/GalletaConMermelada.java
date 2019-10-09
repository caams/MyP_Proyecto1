public class GalletaConMermelada extends Galleta{

  public GalletaConMermelada(){
    this.nombre = "Galleta con Mermelada";
    this.ingredientes.add(new Ingrediente("mermelada", 16, 10000));
  }

  @Override public void prepararMasa(){
    System.out.println("Preparando masa para galletas dulces con mermelada...");
    this.utilizarIngrediente("Harina");
    this.utilizarIngrediente("Leche");
    this.utilizarIngrediente("Huevo");
    this.utilizarIngrediente("Azucar");
  }

  @Override public void agregarComplemento(){
    System.out.println("Agregando mermelada...");
    this.utilizarIngrediente("Mermelada");
  }
}
