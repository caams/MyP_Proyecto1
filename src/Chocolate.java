public abstract class Chocolate extends Producto{

  public Chocolate(String sabor){

  }

  @Override public void preparaProducto(){
    elegirMolde();
    prepararBase();
    enmoldar();
    agregarComplemento();
  }

  @Override public void elegirMolde(){

  }

  @Override public void enmoldar(){

  }
}
