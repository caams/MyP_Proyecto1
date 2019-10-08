public class EstadoActivado implements EstadoMaquina{

  private Maquina maquina;

  public EstadoActivado(Maquina maquina){
    this.maquina = maquina;
  }

  @Override public void encenderse(){
    System.out.println("La maquina ya está encendida y activa.");
  }

  @Override public void activarse(){
    System.out.println("La maquina ya está activa.");
  }

  @Override public void suspenderse(){
    System.out.println("Entrando en estado de suspensión...");
    maquina.actualizarEstado(maquina.getEstadoSuspendido());
    System.out.println("Maquina en estado de suspensión.");
  }

  @Override public void apagarse(){
    System.out.println("Apagando maquina...");
    maquina.actualizarEstado(maquina.getEstadoApagado());
    System.out.println("Maquina apagada.");
  }

  @Override public Producto prepararPedido(String tipo){
    Producto producto = this.maquina.creaProducto(tipo);
    producto.preparaProducto();
    return producto;
  }

  @Override public void reabastecerse(Ingrediente ingrediente){
    for(Ingrediente ingredint : this.maquina.getIngredientes()){
      if(ingredint.getID() == ingrediente.getID())
        ingredint.resetCantidad();
    }
  }

  @Override public void empacar(Producto producto){
    Lote nuevoLote = new Lote(producto, 1000);
  }

  @Override public void entregar(){

  }
}
