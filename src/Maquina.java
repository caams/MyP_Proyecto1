import java.util.ArrayList;

public abstract class Maquina{

  protected ArrayList<Ingrediente> ingredientes;
  protected ArrayList<Producto> recetas;
  protected EstadoMaquina estadoActual;
  protected EstadoMaquina suspendido;
  protected EstadoMaquina apagado;
  protected EstadoMaquina preparando;
  protected EstadoMaquina empacando;

  public Maquina(){
    this.suspendido = new EstadoSuspendido(this);
    this.apagado = new EstadoApagado(this);
    this.preparando = new EstadoPreparando(this);
    this.empacando = new EstadoEmpacando(this);
    this.estadoActual = apagado;
  }

  public EstadoMaquina getEstadoSuspendido(){
    return this.suspendido;
  }

  public EstadoMaquina getEstadoApagado(){
    return this.apagado;
  }

  public EstadoMaquina getEstadoPreparando(){
    return this.preparando;
  }

  public EstadoMaquina getEstadoEmpacando(){
    return this.empacando;
  }

  public void activarse(){
    this.estadoActual.activarse();
  }

  public void suspenderse(){
    this.estadoActual.suspenderse();
  }

  public void apagarse(){
    this.estadoActual.apagarse();
  }

  public void reabastecerse(){
    this.estadoActual.reabastecerse();
  }

  public void empacar(){
    this.estadoActual.empacar();
  }

  public void entregar(){
    this.estadoActual.entregar();
  }

  public void actualizarEstado(EstadoMaquina nuevoEstado){
    this.estadoActual = nuevoEstado;
  }

  public EstadoMaquina getEstadoActual(){
    return this.estadoActual;
  }

  public abstract Producto creaProducto1(String tipo);
  public abstract Producto creaProducto2(String tipo);
  public abstract Producto creaProducto3(String tipo);
}
