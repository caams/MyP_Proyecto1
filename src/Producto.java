import java.util.ArrayList;

/**
 * Clase abstracta para productos.
 * Los productos tienen un nombre y una lista de ingredientes.
 */
public abstract class Producto{

  /* El nombre del producto. */
  private String nombre;
  /* Lista de ingredientes para el producto. */
  private ArrayList<Ingrediente> ingredientes;

  private Maquina maquina;

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

  public void setMaquina(Maquina maquina){
    this.maquina = maquina;
  }

  public Maquina getMaquina(){
    return this.maquina;
  }

  /**
   * Método template para preparar la receta de cada producto.
   * Todos los métodos que utiliza son hooks.
   */
  public void preparaProducto(){
    elegirMolde();
    prepararBase();
    enmoldar();
    agregarComplemento();
  }

  public abstract void elegirMolde();
  public abstract void prepararBase();
  public abstract void enmoldar();
  public abstract void agregarComplemento();
}
