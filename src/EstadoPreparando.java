public class EstadoPreparando implements EstadoMaquina{

  private Maquina maquina;

  public EstadoPreparando(Maquina maquina){
    this.maquina = maquina;
  }

  @Override public void encenderse(){
    System.out.println("La máquina "+ maquina.getNombre() +" ya está encendida.");
  }

  @Override public void apagarse(){
    System.out.println("La máquina "+ maquina.getNombre() +
                       " no se puede apagar mientras prepara un lote.");
  }

  @Override public Producto prepararPedido(String tipo){
    Producto producto = this.maquina.creaProducto(tipo);
    producto.preparaProducto();
    return producto;
  }

  @Override public void reabastecerse(Ingrediente ingrediente){
    for(Ingrediente i : this.maquina.getIngredientes()){
      if(i.getNombre() == ingrediente.getNombre())
        i.resetCantidad();
    }
    this.maquina.actualizarEstado(maquina.suspendido);
  }

  @Override public Lote empacar(Producto producto, int cantidad){
    this.maquina.actualizarEstado(maquina.empacando);
    return this.maquina.empacar(producto, cantidad);
  }
}
