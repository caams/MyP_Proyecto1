import java.util.ArrayList;

public abstract class Maquina{

  private ArrayList<Ingrediente> ingredientes;
  private ArrayList<Producto> recetas;
  private EstadoMaquina estadoActual;
  private EstadoMaquina suspendido;
  private EstadoMaquina apagando;
  private EstadoMaquina preparando;
  private EstadoMaquina empacando;

  public void activarse(){

  }

  public void suspenderse(){

  }

  public void apagarse(){

  }

  public void reabastecerse(){

  }

  public void entregar(){

  }

  public void actualizarEstado(EstadoMaquina nuevoEstado){

  }

  public EstadoMaquina getEstadoActual(){
    return this.estadoActual;
  }

  public abstract Producto creaProducto1();
  public abstract Producto creaProducto2();
  public abstract Producto creaProducto3();
}
