public class EstadoActivado implements EstadoMaquina{

  private Maquina maquina;

  public EstadoActivado(Maquina maquina){
    this.maquina = maquina;
  }

  @Override public void encenderse(){
    System.out.println("La máquina ya está encendida y activa.");
  }

  @Override public void activarse(){
    System.out.println("La máquina ya está activa.");
  }

  @Override public void suspenderse(){
    System.out.println("Entrando en estado de suspensión...");
    try{
      Thread.sleep(1000);
    }catch(InterruptedException ie){
      System.out.println("Hilo de ejecución interrumpido.");
    }
    maquina.actualizarEstado(maquina.getEstadoSuspendido());
    System.out.println("Máquina en estado de suspensión.");
  }

  @Override public void apagarse(){
    System.out.println("Apagando máquina...");
    try{
      Thread.sleep(1000);
    }catch(InterruptedException ie){
      System.out.println("Hilo de ejecución interrumpido.");
    }
    maquina.actualizarEstado(maquina.getEstadoApagado());
    System.out.println("Máquina apagada.");
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
    System.out.println("Entrando en estado de suspensión...");
    try{
      Thread.sleep(1000);
    }catch(InterruptedException ie){
      System.out.println("Hilo de ejecución interrumpido.");
    }
    this.maquina.actualizarEstado(this.maquina.getEstadoSuspendido());
    System.out.println("Máquina en estado de suspensión.");
  }

  @Override public Lote empacar(Producto producto, int cantidad){
    Lote nuevoLote = new Lote(producto, cantidad);
    return nuevoLote;
  }
}
