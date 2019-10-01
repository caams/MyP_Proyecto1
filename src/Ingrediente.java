public class Ingrediente{

  private String nombre;
  private int id;
  private int cantidad;

  public Ingrediente(String nombre, int id, int cantidad){
    this.nombre = nombre;
    this.id = id;
    this.cantidad = cantidad;
  }

  public Strig getNombre(){
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
}
