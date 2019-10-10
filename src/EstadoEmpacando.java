public class EstadoEmpacando implements EstadoMaquina{

  private Maquina maquina;

  public EstadoEmpacando(Maquina maquina){
    this.maquina = maquina;
  }

  @Override public void encenderse(){
    System.out.println("La máquina "+ maquina.getNombre() +" ya está encendida.");
  }


  @Override public void apagarse(){
    System.out.println("La máquina "+ maquina.getNombre() +
                       " no se puede apagar mientras está empacando");
  }

  @Override public Producto prepararPedido(String tipo){
    System.out.println("La máquina "+ maquina.getNombre() +
                       " no puede preparar pedidos mientras está empacando.");
    return null;
  }

  @Override public void reabastecerse(Ingrediente ingrediente){
    System.out.println("La máquina "+ maquina.getNombre() +
                       " no se puede reabastecer mientras está empacando.");
  }

  @Override public Lote empacar(Producto producto, int cantidad){
    System.out.println(String.format("Empacando %d %s de %s...",
    cantidad, cantidad > 1 ? "lotes" : "lote", producto.getNombre()));
    Lote nuevoLote = new Lote(producto, cantidad);
    this.maquina.actualizarEstado(maquina.suspendido);
    return nuevoLote;
  }
}
