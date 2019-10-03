public class EstadoSuspendido implements EstadoMaquina{

  private Maquina maquina;

  public EstadoSuspendido(Maquina maquina){
    this.maquina = maquina;
  }

  @Override public void activarse(){

  }

  @Override public void suspenderse(){
    System.out.println("La maquina ya se encuentra encendida y en estado de suspensión.");
  }

  @Override public void apagarse(){
    System.out.println("Apagando maquina...");
    this.maquina.actualizarEstado(this.maquina.getEstadoApagado());
    System.out.println("Maquina apagada.");
  }

  @Override public void prepararPedido(){
    System.out.println("La maquina no puede preparar un pedido mientras"+
                       " se encuentra suspendida.");
  }

  @Override public void reabastecerse(){
    System.out.println("La maquina no puede reabastecerse mientras"+
                       " se encuentra suspendida.");
  }

  @Override public void empacar(){
    System.out.println("La maquina no puede empacar un pedido mientras"+
                       " se encuentra suspendida.");
  }

  @Override public void entregar(){
    System.out.println("La maquina no puede entregar un pedido mientras"+
                       " se encuentra suspendida.");
  }
}
