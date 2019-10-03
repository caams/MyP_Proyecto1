public class EstadoPreparando implements EstadoMaquina{

  private Maquina maquina;

  public EstadoPreparando(Maquina maquina){

  }

  @Override public void activarse(){
    System.out.println("La maquina ya está activada.");
  }

  @Override public void suspenderse(){
    System.out.println("La maquina no se puede suspender mientras se prepara un lote.");
  }

  @Override public void apagarse(){
    System.out.println("La maquina no se puede apagar mientras se prepara un lote.");
  }

  @Override public void prepararPedido(){

  }

  @Override public void reabastecerse(){
    System.out.println("La maquina no se puede reabastecer mientras"+
                       " está preparando un lote.");
  }

  @Override public void empacar(){
    System.out.println("La maquina no puede empacar mientras está preparando un lote.");
  }

  @Override public void entregar(){
    System.out.println("La maquina no puede entregar pedidos mientras está"+
                       " preparando un lote.");
  }
}
