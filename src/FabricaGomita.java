public class FabricaGomita extends Wonka3000{

  @Override public Producto creaProducto1(){
    return new Gusanito();
  }

  @Override public Producto creaProducto2(){
    return new Frutita();
  }

  @Override public Producto creaProducto3(){
    return new Osito();
  }
}
