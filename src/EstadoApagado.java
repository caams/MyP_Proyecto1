public class EstadoApagado implements EstadoMaquina{

  private Maquina maquina;

  public EstadoApagado(Maquina maquina){
    this.maquina = maquina;
  }

  @Override public void encenderse(){
    System.out.println("Encendiendo máquina...");
    try{
      Thread.sleep(1000);
    }catch(InterruptedException ie){
      System.out.println("Hilo de ejecución interrumpido.");
    }
    this.maquina.actualizarEstado(maquina.getEstadoSuspendido());
    System.out.println("Máquina encendida y en estado de suspensión.");
  }

  @Override public void activarse(){
    System.out.println("La máquina debe encenderse antes de poder activarse.");
  }

  @Override public void suspenderse(){
    System.out.println("La máquina no puede entar en modo de suspensión " +
                       "cuando está apagada.");
  }

  @Override public void apagarse(){
    System.out.println("La máquina ya está apagada.");
  }

  @Override public Producto prepararPedido(String tipo){
    System.out.println("La máquina no pude preparar dulces mientras está " +
                       "apagada");
    return null;
  }

  @Override public void reabastecerse(Ingrediente ingrediente){
    System.out.println("La máquina no se pudede reabastecer mientras está " +
                       "apagada.");
  }

  @Override public Lote empacar(Producto producto, int cantidad){
    System.out.println("La máquina no puede empacar mientras está apagada.");
    return null;
  }
}
