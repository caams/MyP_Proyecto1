public class GalletaConMermelada extends Galleta{

  public GalletaConMermelada(){
    this.getIngredientes().add(new Ingrediente("mermelada", 16, 2000));
  }

  @Override public void prepararMasa(){
    System.out.println("Preparando masa para galletas dulces");
  }

  @Override public void agregarComplemento(){
    System.out.println("Agregando mermelada");
  }
}
