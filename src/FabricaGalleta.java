public class FabricaGalleta extends Galleneitor5000{

  @Override public Producto creaProducto1(){
    return new GalletaConChispas();
  }

  @Override public Producto creaProducto2(){
    return new GalletaConMermelada();
  }

  @Override public Producto creaProducto3(){
    return new GalletaSalada();
  }
}
