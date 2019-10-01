public abstract class Gomita extends Producto{

  public Gomita(String sabor){

  }

  @Override public void preparaProducto(){
    elegirMolde();
    prepararBase();
    enmoldar();
    agregarComplemento();
  }

  @Override public void elegirMolde(){

  }

  @Override public void prepararBase(){

  }
}
