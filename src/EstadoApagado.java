public class EstadoApagado implements EstadoMaquina{

  private Maquina maquina;

  public EstadoApagado(Maquina maquina){
    this.maquina = maquina;
  }

  @Override public void encenderse(){
    System.out.println("Encendiendo " + maquina.getNombre() + "...");
    try{
      Thread.sleep(1000);
    }catch(InterruptedException ie){
      System.out.println("Hilo de ejecución interrumpido.");
    }
    this.maquina.actualizarEstado(maquina.suspendido);
    System.out.println(maquina.getNombre() + " encendida y en estado de suspensión.\n");
  }

  @Override public void apagarse(){
    System.out.println("La máquina "+ maquina.getNombre() +" ya está apagada.");
  }

  @Override public Producto prepararPedido(String tipo){
    System.out.println("La máquina "+ maquina.getNombre() +
                       " no pude preparar dulces mientras está " +
                       "apagada");
    return null;
  }

  @Override public void reabastecerse(Ingrediente ingrediente){
    System.out.println("La máquina " + maquina.getNombre() +
                       " no se pudede reabastecer mientras está apagada.");
  }

  @Override public Lote empacar(Producto producto, int cantidad){
    System.out.println("La máquina "+ maquina.getNombre() +
                       " no puede empacar mientras está apagada.");
    return null;
  }
}
