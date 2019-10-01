import java.util.ArrayList;

public class Maquina implements PedidoValido{

  private ArrayList<Ingrediente> ingredientes;
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
}
