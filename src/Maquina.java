import java.util.ArrayList;

/**
 * Clase abstracta para las máquinas de la fabrica Dulces Rosa.
 */
public abstract class Maquina{

  /* Los ingredientes disponibles para las máquinas. */
  protected ArrayList<Ingrediente> ingredientes;
  /* Las recetas de cada producto. */
  protected ArrayList<Producto> recetas;
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

  /**
   * Regresa el estado suspendido de la máquina.
   * @return el estado suspendido de la máquina.
   */
  public EstadoMaquina getEstadoSuspendido(){
    return this.suspendido;
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

  /* Reabastece de ingredientes la máquina. */
  public void reabastecerse(){
    this.estadoActual.reabastecerse();
  }

  /* Pone la máquina en estado empacando. */
  public void empacar(){
    this.estadoActual.empacar();
  }

  /* POne la máquina en estado entregando. */
  public void entregar(){
    this.estadoActual.entregar();
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
  public abstract Producto creaProducto1(String tipo);
  public abstract Producto creaProducto2(String tipo);
  public abstract Producto creaProducto3(String tipo);
}
