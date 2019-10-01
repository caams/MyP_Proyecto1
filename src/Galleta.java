import java.util.ArrayList;

public abstract class Galleta{

  private String nombre;
  private int id;
  private ArrayList<Ingrediente> ingredientes;

  public Galleta(String nombre, int id){
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

  prepararGalleta(){
    prepararMasa();
    enmoldar();
    hornear();
    ponerComplementos();
  }

  public void prepararMasa();

  public void enmoldar(){

  }

  public void hornear(){

  }

  public void ponerComplementos();
}
