public class JefeTecnico{

  public void procesarPedido(Sucursal sucursal, String pedido, int cantidad){
    if(validarPedido(sucursal, pedido)){
      crearPedido(sucursal, pedido, cantidad);
    }else{
      System.out.println("El pedido no ha sido validado pues la sucursal aún lo tiene en stock.");
    }
  }

  public boolean validarPedido(Sucursal sucursal, String pedido){
    for(Lote lote : sucursal.toArrayList()){
      if(lote.getNombre().equalsIgnoreCase(pedido))
        return false;
    }
    return true;
  }

  public void crearPedido(Sucursal sucursal, String pedido, int cantidad){
    FactoryProducer fp = new FactoryProducer();
    Maquina maquina = fp.getFactory(pedido);
    if(maquina.getEstadoActual() instanceof EstadoApagado)
      maquina.encenderse();
    if(maquina.getEstadoActual() instanceof EstadoSuspendido)
      maquina.activarse();
    Producto producto = maquina.prepararPedido(pedido);
    Lote entrega = maquina.empacar(producto, cantidad);
    if(producto != null && entrega != null){
      deliver(sucursal, entrega);
    }else{
      System.out.println("No fue posible completar el pedido");
      return;
    }
  }

  public void deliver(Sucursal sucursal, Lote entrega){
    DulcesRosa dr = DulcesRosa.getInstance();
    int repartidor = (int)(Math.random() * dr.getNumRepartidores());
    int camion = (int)(Math.random() * 7) +1;
    RepartidorDecorator repartidorDecorator =
    new RepartidorDecorator(dr.repartidores[repartidor], sucursal, camion);
    repartidorDecorator.entregar(entrega);
  }
}
