public class EstadoSuspendido implements EstadoMaquina{

  private Maquina maquina;

  public EstadoSuspendido(Maquina maquina){
    this.maquina = maquina;
  }

  @Override public void encenderse(){
    System.out.println("La máquina "+ maquina.getNombre() +" ya está encendida.");
  }

  @Override public void apagarse(){
    System.out.println("Apagando "+ maquina.getNombre() +"...");
    try{
      Thread.sleep(1000);
    }catch(InterruptedException ie){
      System.out.println("Hilo de ejecución interrumpido.");
    }
    this.maquina.actualizarEstado(this.maquina.apagado);
    System.out.println(maquina.getNombre() +" apagada.");
  }

  @Override public Producto prepararPedido(String tipo){
    this.maquina.actualizarEstado(maquina.preparando);
    return this.maquina.prepararPedido(tipo);
  }

  @Override public void reabastecerse(Ingrediente ingrediente){
    System.out.println("La maquina " + maquina.getNombre() +
                       "no puede reabastecerse mientras está suspendida.");
    }

  @Override public Lote empacar(Producto producto, int cantidad){
    System.out.println("La maquina" + maquina.getNombre() +
                        "no puede empacar un pedido mientras está suspendida.");
    return null;
  }
}
