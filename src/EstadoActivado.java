public class EstadoActivado implements EstadoMaquina{

  private Maquina maquina;

  public EstadoActivado(Maquina maquina){
    this.maquina = maquina;
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
    if(this.maquina instanceof Wonka3000){
      return creaProducto1(tipo);
    }else{
      if(tipo.contains("salada"))
        maquina.creaProducto1(tipo);
      else if(tipo.contains("con chispas"))
        maquina.creaProducto2(tipo);
      else if(tipo.contains("con mermelada"))
        maquina.creaProducto3();
    }
    return null;
  }

  @Override public void reabastecerse(Ingrediente ingrediente){
    for(Ingrediente ingredint : this.maquina.getIngredientes()){
      if(ingredint.getID == ingrediente.getID())
        this.ingredint.resetCantidad();
    }
  }

  @Override public Lote empacar(Producto producto){
    Lote nuevoLote = new Lote(producto.getNombre(), 1000);
    return nuevoLote;
  }

  @Override public void entregar(){

  }
}
