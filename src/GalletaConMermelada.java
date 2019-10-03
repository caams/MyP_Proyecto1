public class GalletaConMermelada extends Galleta{

  public GalletaConMermelada(){

  }

  @Override public void prepararMasa(){
    System.out.println("Preparando masa para galletas dulces");
  }

  @Override public void agregarComplemento(){
    System.out.println("Agregando mermelada");
  }
}
