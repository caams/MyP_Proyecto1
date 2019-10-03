public class FabricaChocolate extends Wonka3000{

  @Override public Producto creaProducto1(){
    return new ChocolateOscuro();
  }

  @Override public Producto creaProducto2(){
    return new ChcolateConLeche();
  }

  @Override public Producto creaProducto3(){
    return new ChocolateConAlmendra();
  }

}
