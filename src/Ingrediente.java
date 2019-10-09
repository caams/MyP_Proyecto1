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
                       + "por lo que se reabastecerá.");
    System.out.println("Se ha interrumpido el proceso de preparación de este producto.");
    this.cantidad = 100000;
  }

  public void drawIngredientes(Maquina creador){
    for(Ingrediente i : creador.getIngredientes()){
      if(i.getNombre().equals(this.getNombre()))
        i.usar(this, creador);
    }
  }

  public void usar(Ingrediente ingrediente, Maquina creador){
    if(this.getCantidad() < ingrediente.getCantidad()){
      creador.reabastecerse(this);
    }else{
      this.setCantidad(this.getCantidad() - ingrediente.getCantidad());
    }
  }
}
