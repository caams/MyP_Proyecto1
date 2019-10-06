public class EstadoEmpacando implements EstadoMaquina{

  private Maquina maquina;

  public EstadoEmpacando(Maquina maquina){
    this.maquina = maquina;
  }

  @Override public void activarse(){
    System.out.println("La maquina ya está activada.");
  }

  @Override public void suspenderse(){
    System.out.println("La maquina no se puede suspender mientras está empacando.");
  }

  @Override public void apagarse(){
    System.out.println("La maquina no se puede apagar mientras está empacando");
  }

  @Override public void prepararPedido(){
    System.out.println("La maquina no puede preparar pedidos mientras está empacando.");
  }

  @Override public void reabastecerse(){
    System.out.println("La maquina no se puede reabastecer mientras está empacando.");
  }

  @Override public void empacar(){
    System.out.println("La maquina solo puede empacar un lote a la vez.");
  }

  @Override public void entregar(){
    System.out.println("La maquina no puede entregar pedidos mientras está empacando.");
  }
}
