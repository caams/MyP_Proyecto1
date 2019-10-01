import java.util.ArrayList;

public class Dulce{

  private String nombre;
  private int id;
  private ArrayList<Ingrediente> ingredientes;

  public Dulce(String nombre, int id){
    this.nombre = nombre;
    this.id = id;
  }

  public Strig getNombre(){
    return  this.nombre;
  }

  public int getID(){
    return this.id;
  }

  public ArrayList<Ingrediente> getIngredintes(){
    return this.ingredientes;
  }
}
