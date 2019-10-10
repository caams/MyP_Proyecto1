/**
 * Clase para los repartidores. Implementa el patrón Decorator.
 * Necesitamos asignarles un repartidor, un camión y una sucursal.
 */
public class RepartidorDecorator{

  /* El repartidor a decorar. */
  private Repartidor repartidor;
  /* La sucursal a la que el repartidor debe entregar su pedido. */
  private Sucursal sucursal;
  /* El camión que utilizará el repartidor. */
  private int camion;

  /**
   * Contructor para el repartidor decorado.
   * @param repartidor que va a entregar su pedido.
   * @param sucursal a entregar el pedido solicitado.
   * @param camion que usa el repartidor para llegar a la sucursal.
   */
  public RepartidorDecorator(Repartidor repartidor, Sucursal sucursal, int camion){
    this.repartidor = repartidor;
    this.sucursal = sucursal;
    this.camion = camion;
  }

  /**
   * Método para entregar el lote a la sucursal.
   * Imprime un mensaje cuando el repartidor está entregando el lote.
   * @param entrega el lote que entrega a la sucursal y que la sucursal 
   * añade a su inventario.
   */
  public void entregar(Lote entrega){
    System.out.println(String.format("El repartidor %s está entregando %d"+
                       " lotes de %s a la sucursal %d en %s en el camión %d.",
    this.repartidor.getNombre(), entrega.getCantidad(), entrega.getNombre(),
    this.sucursal.getID(), this.sucursal.getDireccion(), this.camion));
    sucursal.agregaInventario(entrega);
  }
}
