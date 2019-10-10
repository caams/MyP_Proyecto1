import java.util.ArrayList;

/**
 * Clase abstracta para productos.
 * Los productos tienen un nombre y una lista de ingredientes.
 */
public abstract class Producto{

  /* El nombre del producto. */
  protected String nombre;
  /* Lista de ingredientes para el producto. */
  protected ArrayList<Ingrediente> ingredientes;

  protected Maquina creador;

  /**
   * Regresa el nombre del producto.
   * @return el nombre del producto.
   */
  public String getNombre(){
    return this.nombre;
  }

  /**
   * Regresa la lista de ingredientes del producto.
   * @return la lista de ingredientes del producto.
   */
  public ArrayList<Ingrediente> getIngredientes(){
    return this.ingredientes;
  }

  public void setIngredientes(ArrayList<Ingrediente> ingredientes){
    this.ingredientes = ingredientes;
  }

  public void usarIngrediente(String ingrediente){
    if(this.creador.getEstadoActual() instanceof EstadoPreparando){
      Ingrediente ing = this.getIngrediente(ingrediente);
      System.out.println(String.format("  Agregando %2.2f kilos de %s...",
                         ((double)ing.getCantidad())/1000, ing.getNombre()));
      try{
        Thread.sleep(1000);
      }catch(InterruptedException ie){
        System.out.println("Hilo de ejecución interrumpido.");
      }
      ing.drawIngredientes(this.creador);
    }
  }

  public Ingrediente getIngrediente(String ingrediente){
    for(Ingrediente i : this.getIngredientes()){
      if(i.getNombre().equals(ingrediente))
        return i;
    }
    return null;
  }

  /**
   * Método template para preparar la receta de cada producto.
   * Todos los métodos que utiliza son hooks.
   */
  public void preparaProducto(){
    System.out.println("Preparando un pedido de " + this.getNombre() +":");
    elegirMolde();
    try{
      Thread.sleep(1000);
    }catch(InterruptedException ie){
      System.out.println("Hilo de ejecución interrumpido.");
    }
    prepararBase();
    try{
      Thread.sleep(1000);
    }catch(InterruptedException ie){
      System.out.println("Hilo de ejecución interrumpido.");
    }
    if(this.creador.getEstadoActual() instanceof EstadoPreparando){
      enmoldar();
      try{
        Thread.sleep(1000);
      }catch(InterruptedException ie){
        System.out.println("Hilo de ejecución interrumpido.");
      }
      agregarComplemento();
      try{
        Thread.sleep(1000);
      }catch(InterruptedException ie){
        System.out.println("Hilo de ejecución interrumpido.");
      }
      System.out.println("¡Pedido terminado!\n");
    }
  }

  public abstract void elegirMolde();
  public abstract void prepararBase();
  public abstract void enmoldar();
  public abstract void agregarComplemento();
}
