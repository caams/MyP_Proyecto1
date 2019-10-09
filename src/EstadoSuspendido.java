public class EstadoSuspendido implements EstadoMaquina{

  private Maquina maquina;

  public EstadoSuspendido(Maquina maquina){
    this.maquina = maquina;
  }

  @Override public void encenderse(){
    System.out.println("La máquina ya está encendida.");
  }

  @Override public void activarse(){
    System.out.println("Activando la máquina...");
    try{
      Thread.sleep(1000);
    }catch(InterruptedException ie){
      System.out.println("Hilo de ejecución interrumpido.");
    }
    this.maquina.actualizarEstado(this.maquina.getEstadoActivado());
    System.out.println("Máquina activa.");
  }

  @Override public void suspenderse(){
    System.out.println("La máquina ya se encuentra encendida y en estado de " +
                       "suspensión.");
  }

  @Override public void apagarse(){
    System.out.println("Apagando máquina...");
    try{
      Thread.sleep(1000);
    }catch(InterruptedException ie){
      System.out.println("Hilo de ejecución interrumpido.");
    }
    this.maquina.actualizarEstado(this.maquina.getEstadoApagado());
    System.out.println("Máquina apagada.");
  }

  @Override public Producto prepararPedido(String tipo){
    System.out.println("La máquina no puede preparar un pedido mientras " +
                       "se encuentra suspendida.");
    return null;
  }

  @Override public void reabastecerse(Ingrediente ingrediente){
    System.out.println("La máquina no puede reabastecerse mientras " +
                       "se encuentra suspendida.");
  }

  @Override public Lote empacar(Producto producto, int cantidad){
    System.out.println("La máquina no puede empacar un pedido mientras " +
                       "se encuentra suspendida.");
    return null;
  }
}
