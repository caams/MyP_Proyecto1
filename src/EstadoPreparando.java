public class EstadoPreparando implements EstadoMaquina{

  private Maquina maquina;

  public EstadoPreparando(Maquina maquina){
    this.maquina = maquina;
  }

  @Override public void encenderse(){
    System.out.println("La maquina ya está encendida.");
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

  @Override public Producto prepararPedido(String tipo){
    System.out.println("La maquina solo puede preparar un dulce a la vez");
    return null;
  }

  @Override public void reabastecerse(Ingrediente ingrediente){
    System.out.println("La maquina no se puede reabastecer mientras"+
                       " está preparando un lote.");
  }

  @Override public Lote empacar(Producto producto, int cantidad){
    System.out.println("La maquina no puede empacar mientras está preparando un lote.");
    return null;
  }
}
