/**
 * Clase Ingrediente de los ingredientes de la fábrica.
 * Cada ingrediente tiene un nombre, un id y la cantidad disponible
 * de cada ingrediente.
 */
public class Ingrediente{

  /* Nombre del ingrediente. */
  private String nombre;
  /* Número de identificación del ingrediente. */
  private int id;
  /* Cantidad disponible del ingrediente. */
  private int cantidad;

  /**
   * Constructor de la clase Ingrediente.
   * @param nombre el nombre del ingrediente.
   * @param id el número de identificación del ingrediente.
   * @param cantidad la cantidad disponible del ingrediente.
   */
  public Ingrediente(String nombre, int id, int cantidad){
    this.nombre = nombre;
    this.id = id;
    this.cantidad = cantidad;
  }

  /**
   * Regresa el nombre del ingrediente.
   * @return el nombre del ingrediente.
   */
  public String getNombre(){
    return  this.nombre;
  }

  /**
   * Regresa el número de identificación del ingrediente.
   * @return el id del ingrediente.
   */
  public int getID(){
    return this.id;
  }

  /**
   * Regresa la cantidad disponible del ingrediente.
   * @return la cantidad del ingrediente.
   */
  public int getCantidad(){
    return this.cantidad;
  }

  /**
   * Establece la cantidad disponible de un ingrediente.
   * @param cantidad la cantidad establecida de un ingrediente.
   */
  public void setCantidad(int cantidad){
    this.cantidad = cantidad;
  }

  /**
   * Reestablece la cantidad disponible de un ingrediente después
   * de que se acaba el suministro de dicho ingrediente o no hay
   * suficiente cantidad del ingrediente para preparar un producto.
   */
  public void resetCantidad(){
    System.out.println("\nEl suministro de " + this.nombre + " se ha agotado "
                       + "por lo que se reabastecerá.");
    System.out.println("Se ha interrumpido el proceso de preparación de este " +
                       "producto.");
    this.cantidad = 100000;
  }

  /**
   * Método para decrementar la cantidad de un ingrediente después de
   * que sea utilizado en la preparación de un producto.
   * @param creador la máquina que está preparando un producto.
   */
  public void drawIngredientes(Maquina creador){
    for(Ingrediente i : creador.getIngredientes()){
      if(i.getNombre().equals(this.getNombre()))
        i.usar(this, creador);
    }
  }

  /**
   * Método que permite usar un ingrediente dependiendo de si hay
   * suficiente cantidad para preparar alguna receta y se resta la
   * cantidad del ingrediente que se utilizó. Si no hay suficiente
   * cantidad se reabastece del ingrediente utilizado.
   * @param ingrediente el ingrediente que se está utilizando.
   * @param creador la máquina que está preparando algún producto.
   */
  public void usar(Ingrediente ingrediente, Maquina creador){
    if(this.getCantidad() < ingrediente.getCantidad()){
      creador.reabastecerse(this);
    }else{
      this.setCantidad(this.getCantidad() - ingrediente.getCantidad());
    }
  }
}
