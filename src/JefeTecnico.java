public class JefeTecnico{

  public void procesarPedido(Sucursal sucursal, String pedido, int cantidad){
    if(validarPedido(sucursal, pedido)){
      crearPedido(sucursal, pedido, cantidad);
    }
  }

  public boolean validarPedido(Sucursal sucursal, String pedido){
    FactoryProducer fp = new FactoryProducer();
    Maquina m = fp.getFactory(pedido);
    Producto p = m.creaProducto(pedido);
    if(p == null){
      System.out.println("El pedido no ha sido validado pues no "+
                         "existe dentro de las ofertas de Dulces Rosa®.");
      return false;
    }
    for(Lote lote : sucursal.toArrayList()){
      if(lote.getNombre().equalsIgnoreCase(pedido)){
        System.out.println("El pedido no ha sido validado pues la sucursal " +
                           "aún lo tiene en stock.");
        return false;
      }
    }
    return true;
  }

  public void crearPedido(Sucursal sucursal, String pedido, int cantidad){
    System.out.println("El pedido ha sido validado.\n");
    FactoryProducer fp = new FactoryProducer();
    Maquina maquina = fp.getFactory(pedido);
    if(maquina.getEstadoActual() instanceof EstadoApagado)
      maquina.encenderse();
    //   maquina.activarse();
    Producto producto = maquina.prepararPedido(pedido);
    if(maquina.getEstadoActual() instanceof EstadoSuspendido){
      return;
    }
    Lote entrega = maquina.empacar(producto, cantidad);
    if(producto != null && entrega != null){
      deliver(sucursal, entrega);
    }else{
      System.out.println("No fue posible completar el pedido.");
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
