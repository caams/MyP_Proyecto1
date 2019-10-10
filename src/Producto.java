import java.util.ArrayList;

/**
 * Clase abstracta para productos.
 * Los productos tienen un nombre y una lista de ingredientes.
 */
public abstract class Producto{

  /* El nombre protegido del producto. */
  protected String nombre;
  /* Lista protegida de ingredientes para el producto. */
  protected ArrayList<Ingrediente> ingredientes;
  /** Máquina protegida que creará los productos. */
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

  /**
   * Los ingredientes de cada producto.
   * @param ingredientes los ingredientes del producto.
   */
  public void setIngredientes(ArrayList<Ingrediente> ingredientes){
    this.ingredientes = ingredientes;
  }

  /**
   * Si la máquina creadora tiene un estado aceptable agrega un ingrediente a la vez.
   * Después de usar dicho ingrediente, se decrementa la cantidad del ingrediente usado.
   * @param ingrediente el ingrediente para preparar el producto.
   */
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

  /**
   * Método que regresa un ingrediente del tipo que se pide.
   * @param ingrediente que se pide regresar.
   * @return el ingrediente que se solicita si existe, null en otro caso.
   */
  public Ingrediente getIngrediente(String ingrediente){
    for(Ingrediente i : this.getIngredientes()){
      if(i.getNombre().equals(ingrediente))
        return i;
    }
    return null;
  }

  /**
   * Método template para preparar la receta de cada producto.
   * Todos los métodos que utiliza son métodos hook.
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

  /** Método abstracto que elige el molde del producto. */
  public abstract void elegirMolde();

  /** Método abstracto que prepara la base del producto. */
  public abstract void prepararBase();

  /** Método abstracto que enmolda al producto. */
  public abstract void enmoldar();

  /** Método abstracto que agrega un complemento al producto. */
  public abstract void agregarComplemento();
}
