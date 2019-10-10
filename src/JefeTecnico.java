/**
 * Clase del Jefe Técnico. Un jefe técnico controla la máquina a través
 * de una consola. También debe organizar a un grupo de repartidores 
 * para transportar los dulces a las distintas sucursales.
 */
public class JefeTecnico{

  /**
   * Valida el pedido de cualquier sucursal que lo solicita.
   * @param sucursal la sucursal que solicita algún pedido de la fábrica.
   * @param pedido el pedido a validar de alguna sucursal.
   * @param cantidad de lotes que pide la sucursal.
   */
  public void procesarPedido(Sucursal sucursal, String pedido, int cantidad){
    if(validarPedido(sucursal, pedido)){
      crearPedido(sucursal, pedido, cantidad);
    }else{
      System.out.println("El pedido no ha sido validado, pues la sucursal " +
                         "aún lo tiene en stock.");
    }
  }

  /**
   * Método que nos dice si el pedido de alguna sucursal es válido o no.
   * @param sucursal que realizó el pedido.
   * @param pedido que solicitó alguna sucursal.
   * @return true si el pedido es válido, false en otro caso.
   */
  public boolean validarPedido(Sucursal sucursal, String pedido){
    for(Lote lote : sucursal.toArrayList()){
      if(lote.getNombre().equalsIgnoreCase(pedido))
        return false;
    }
    return true;
  }

  /**
   * Después de que el pedido fue validado, crea el pedido para que la fábrica
   * se encarge de completarlo.
   * @param sucursal que realizó el pedido.
   * @param pedido que fue validado y que la fábrica debe crear.
   * @param cantidad de lotes del pedido solicitado.
   * Si el pedido fue completado con éxito, se entrega a dicha sucursal,
   * en otro caso se imprime que no pudo ser completado.
   */
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
      System.out.println("No fue posible completar el pedido.");
      return;
    }
  }

  /**
   * Método que  hace a un repartidor entregar el pedido a la sucursal 
   * que lo solicitó en caso de ser completado con éxito.
   * @param sucursal a entregar el pedido solicitado.
   * @param entrega el lote a entregar a la sucursal.
   */
  public void deliver(Sucursal sucursal, Lote entrega){
    DulcesRosa dr = DulcesRosa.getInstance();
    int repartidor = (int)(Math.random() * dr.getNumRepartidores());
    int camion = (int)(Math.random() * 7) +1;
    RepartidorDecorator repartidorDecorator =
    new RepartidorDecorator(dr.repartidores[repartidor], sucursal, camion);
    repartidorDecorator.entregar(entrega);
  }
}
