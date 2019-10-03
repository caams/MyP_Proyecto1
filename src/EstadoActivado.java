public class EstadoActivado implements EstadoMaquina{

  private Maquina maquina;

  public EstadoActivado(Maquina maquina){
    this.maquina = maquina;
  }

  @Override public void activarse(){
    System.out.println("La maquina ya está activa.");
  }

  @Override public void suspenderse(){
    System.out.println("Entrando en estado de suspensión...");
    maquina.actualizarEstado(maquina.getEstadoSuspendido());
    System.out.println("Maquina en estado de suspensión.");
  }

  @Override public void apagarse(){
    System.out.println("Apagando maquina...");
    maquina.actualizarEstado(maquina.getEstadoApagado());
    System.out.println("Maquina apagada.");
  }

  @Override public void prepararPedido(){

  }

  @Override public void reabastecerse(){

  }

  @Override public void empacar(){

  }

  @Override public void entregar(){

  }
}
