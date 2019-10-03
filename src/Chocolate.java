public abstract class Chocolate extends Producto{

  public Chocolate(String sabor){

  }

  @Override public void elegirMolde(){
    System.out.println("Tomando molde para chocolates")
  }

  @Override public void enmoldar(){
    System.out.println("Vaciando mezcla en el molde para chocolates");
  }
}
