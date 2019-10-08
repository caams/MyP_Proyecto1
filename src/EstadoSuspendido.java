public class EstadoSuspendido implements EstadoMaquina{

  private Maquina maquina;

  public EstadoSuspendido(Maquina maquina){
    this.maquina = maquina;
  }

  @Override public void encenderse(){
    System.out.println("La maquina ya está encendida.");
  }

  @Override public void activarse(){
    System.out.println("Activando la maquina...");
    this.maquina.actualizarEstado(this.maquina.getEstadoActivado());
    System.out.println("Maquina activa.");
  }

  @Override public void suspenderse(){
    System.out.println("La maquina ya se encuentra encendida y en estado de suspensión.");
  }

  @Override public void apagarse(){
    System.out.println("Apagando maquina...");
    this.maquina.actualizarEstado(this.maquina.getEstadoApagado());
    System.out.println("Maquina apagada.");
  }

  @Override public Producto prepararPedido(String tipo){
    System.out.println("La maquina no puede preparar un pedido mientras"+
                       " se encuentra suspendida.");
    return null;
  }

  @Override public void reabastecerse(Ingrediente ingrediente){
    System.out.println("La maquina no puede reabastecerse mientras"+
                       " se encuentra suspendida.");
  }

  @Override public void empacar(Producto producto){
    System.out.println("La maquina no puede empacar un pedido mientras"+
                       " se encuentra suspendida.");
  }

  @Override public void entregar(){
    System.out.println("La maquina no puede entregar un pedido mientras"+
                       " se encuentra suspendida.");
  }
}
