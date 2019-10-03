import java.util.ArrayList;

public abstract class Maquina implements Pedido{

  private ArrayList<Ingrediente> ingredientes;
  private ArrayList<Producto> recetas;
  private EstadoMaquina estadoActual;
  private EstadoMaquina suspendido;
  private EstadoMaquina apagando;
  private EstadoMaquina preparando;
  private EstadoMaquina empacando;

  public Maquina(ArrayList<Ingrediente> ingredientes){
    this.suspendido = new EstadoSuspendido(this);
    this.apagado = new EstadoApagado(this);
    this.preparando = new EstadoPreparando(this);
    this.empacabado = new EstadoEmpacando(this);
    this.estadoActual = apagado;
    this.ingredientes = ingredientes;
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
    this.estadoActual = nuevoEstado;x
  }

  public EstadoMaquina getEstadoActual(){
    return this.estadoActual;
  }

  public abstract Producto creaProducto1();
  public abstract Producto creaProducto2();
  public abstract Producto creaProducto3();
}
