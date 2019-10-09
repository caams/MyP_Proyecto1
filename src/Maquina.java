import java.util.ArrayList;

/**
 * Clase abstracta para las máquinas de la fabrica Dulces Rosa.
 */
public abstract class Maquina{

  protected static Maquina instance;
  /* Los ingredientes disponibles para las máquinas. */
  protected ArrayList<Ingrediente> ingredientes;
  /* El estado actual de la máquina. */
  protected EstadoMaquina estadoActual;
  /* El estado suspendido de la máquina. */
  protected EstadoMaquina suspendido;
  /* El estado activado de la maquina. */
  protected EstadoMaquina activado;
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
    this.activado = new EstadoActivado(this);
    this.apagado = new EstadoApagado(this);
    this.preparando = new EstadoPreparando(this);
    this.empacando = new EstadoEmpacando(this);
    this.estadoActual = apagado;
  }

  public ArrayList<Ingrediente> getIngredientes(){
    return this.ingredientes;
  }

  /**
   * Regresa el estado suspendido de la máquina.
   * @return el estado suspendido de la máquina.
   */
  public EstadoMaquina getEstadoSuspendido(){
    return this.suspendido;
  }

  /**
   * Regresa el estado activado de la máquina.
   * @return el estado activado de la máquina.
   */
  public EstadoMaquina getEstadoActivado(){
    return this.activado;
  }

  /**
   * Regresa el estado apagado de la máquina.
   * @return el estado apagado de la máquina.
   */
  public EstadoMaquina getEstadoApagado(){
    return this.apagado;
  }

  /**
   * Regresa el estado preparando de la máquina.
   * @return el estado preparando de la máquina.
   */
  public EstadoMaquina getEstadoPreparando(){
    return this.preparando;
  }

  /**
   * Regresa el estado empacando de la máquina.
   * @return el estado empacando de la máquina.
   */
  public EstadoMaquina getEstadoEmpacando(){
    return this.empacando;
  }

  public void encenderse(){
    this.estadoActual.encenderse();
  }

  /* Activa la máquina. */
  public void activarse(){
    this.estadoActual.activarse();
  }

  /* Suspende la máquina. */
  public void suspenderse(){
    this.estadoActual.suspenderse();
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
