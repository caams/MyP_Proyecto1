import java.util.ArrayList;

/**
 * Clase abstracta para las máquinas de la fabrica Dulces Rosa.
 */
public abstract class Maquina{

  protected String nombre;
  /* Los ingredientes disponibles para las máquinas. */
  protected ArrayList<Ingrediente> ingredientes;
  /* El estado actual de la máquina. */
  protected EstadoMaquina estadoActual;
  /* El estado suspendido de la máquina. */
  protected EstadoMaquina suspendido;
  /* El estado apagado de la máquina. */
  protected EstadoMaquina apagado;
  /* El estado preparando de la máquina. */
  protected EstadoMaquina preparando;
  /* El estado empacando de la maquina. */
  protected EstadoMaquina empacando;

  /**
   * Constructor de la clase máquina.
   */
  public Maquina(){
    this.suspendido = new EstadoSuspendido(this);
    this.apagado = new EstadoApagado(this);
    this.preparando = new EstadoPreparando(this);
    this.empacando = new EstadoEmpacando(this);
    this.estadoActual = apagado;
  }

  public String getNombre(){
    return this.nombre;
  }

  public ArrayList<Ingrediente> getIngredientes(){
    return this.ingredientes;
  }
  
  public void encenderse(){
    this.estadoActual.encenderse();
  }

  /* Apaga la máquina. */
  public void apagarse(){
    this.estadoActual.apagarse();
  }

  public Producto prepararPedido(String tipo){
    return this.estadoActual.prepararPedido(tipo);
  }

  /* Reabastece de ingredientes la máquina. */
  public void reabastecerse(Ingrediente ingrediente){
    this.estadoActual.reabastecerse(ingrediente);
  }

  /* Pone la máquina en estado empacando. */
  public Lote empacar(Producto producto, int cantidad){
    return this.estadoActual.empacar(producto, cantidad);
  }

  /* Actualiza el estado de la máquina. */
  public void actualizarEstado(EstadoMaquina nuevoEstado){
    this.estadoActual = nuevoEstado;
  }

  /**
   * Regresa el estado actual de la máquina.
   * @return el estado actual de la máquina.
   */
  public EstadoMaquina getEstadoActual(){
    return this.estadoActual;
  }

  /* Métodos abstractos para crear productos. */
  public abstract Producto creaProducto(String tipo);
}
