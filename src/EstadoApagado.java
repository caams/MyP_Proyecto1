public class EstadoApagado implements EstadoMaquina{

  private Maquina maquina;

  public EstadoApagado(Maquina maquina){
    this.maquina = maquina;
  }

  @Override public void encenderse(){
    System.out.println("Encendiendo maquina...");
    this.maquina.actualizarEstado(maquina.getEstadoSuspendido());
    System.out.println("Maquina encendida y en estado de suspensión");
  }

  @Override public void activarse(){
    System.out.println("La maquina debe encenderse antes de poder activarse.");
  }

  @Override public void suspenderse(){
    System.out.println("La maquina no puede entar en modo de suspensión "+
                       "cuando está apagada.");
  }

  @Override public void apagarse(){
    System.out.println("La maquina ya está apagada.");
  }

  @Override public Producto prepararPedido(String tipo){
    System.out.println("La maquina no pude preparar dulces mientras está apagada");
    return null;
  }

  @Override public void reabastecerse(Ingrediente ingrediente){
    System.out.println("La maquina no se pudede reabastecer mientras está apagada.");
  }

  @Override public void empacar(Producto producto){
    System.out.println("La maquina no puede empacar mientras está apagada.");
  }

  @Override public void entregar(){
    System.out.println("La maquina no puede entregar paquetes mientras está apagada.");
  }
}
