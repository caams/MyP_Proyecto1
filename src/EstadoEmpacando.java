public class EstadoEmpacando implements EstadoMaquina{

  private Maquina maquina;

  public EstadoEmpacando(Maquina maquina){
    this.maquina = maquina;
  }

  @Override public void encenderse(){
    System.out.println("La máquina ya está encendida.");
  }

  @Override public void activarse(){
    System.out.println("La máquina ya está activada.");
  }

  @Override public void suspenderse(){
    System.out.println("La máquina no se puede suspender mientras está " +
                       "empacando.");
  }

  @Override public void apagarse(){
    System.out.println("La máquina no se puede apagar mientras está empacando");
  }

  @Override public Producto prepararPedido(String tipo){
    System.out.println("La máquina no puede preparar pedidos mientras está " +
                       "empacando.");
    return null;
  }

  @Override public void reabastecerse(Ingrediente ingrediente){
    System.out.println("La máquina no se puede reabastecer mientras está " +
                       "empacando.");
  }

  @Override public Lote empacar(Producto producto, int cantidad){
    System.out.println("La máquina sólo puede empacar un lote a la vez.");
    return null;
  }
}
