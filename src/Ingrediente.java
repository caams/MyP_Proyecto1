public class Ingrediente{

  private String nombre;
  private int id;
  private int cantidad;

  public Ingrediente(String nombre, int id, int cantidad){
    this.nombre = nombre;
    this.id = id;
    this.cantidad = cantidad;
  }

  public String getNombre(){
    return  this.nombre;
  }

  public int getID(){
    return this.id;
  }

  public int getCantidad(){
    return this.cantidad;
  }

  public void setCantidad(int cantidad){
    this.cantidad = cantidad;
  }

  public void resetCantidad(){
    System.out.println("El suministro de " + this.nombre + " se ha agotado "
                       + " por lo que se reabastecerá.");
    this.cantidad = 100000;
  }

  public void usar(int cantUsada){
    if(this.cantidad == 0){
      this.resetCantidad();
    }else{
      this.cantidad = this.cantidad - cantUsada;
    }
  }
}
