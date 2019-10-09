public class GalletaConChispas extends Galleta{

  public GalletaConChispas(){
    this.nombre = "Galleta Con Chispas";
    this.ingredientes.add(new Ingrediente("Chispas de Chocolate", 15, 11350));
  }

  @Override public void prepararMasa(){
    System.out.println("Preparando masa para galletas galletas con chispas...");
    try{
      Thread.sleep(1000);
    }catch(InterruptedException ie){
      System.out.println("Hilo de ejecución interrumpido.");
    }
    this.utilizarIngrediente("Harina");
    this.utilizarIngrediente("Leche");
    this.utilizarIngrediente("Huevo");
    this.utilizarIngrediente("Azúcar");
    this.utilizarIngrediente("Chispas de Chocolate");
  }

  @Override public void agregarComplemento(){}
}
