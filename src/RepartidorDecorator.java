public class RepartidorDecorator{

  private Repartidor repartidor;
  private Sucursal sucursal;
  private int camion;

  public RepartidorDecorator(Repartidor repartidor, Sucursal sucursal, int camion){
    this.repartidor = repartidor;
    this.sucursal = sucursal;
    this.camion = camion;
  }

  public void entregar(Lote entrega){
    System.out.println(String.format("El repartidor %s está entregando %d"+
                       " lotes de %s a la sucursal %d en %s en el camión %d.",
    this.repartidor.getNombre(), entrega.getCantidad(), entrega.getNombre(),
    this.sucursal.getID(), this.sucursal.getDireccion(), this.camion));
    sucursal.agregaInventario(entrega);
  }
}
