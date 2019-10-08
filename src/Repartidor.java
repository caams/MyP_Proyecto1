public class Repartidor implements UpdateRepartidor{

  private String nombre;
  private int id;
  private int rfc;
  private Sucursal sucursal;
  private int camion;

  public String getNombre(){
    return this.nombre;
  }

  public int getID(){
    return this.id;
  }

  public int getRFC(){
    return this.rfc;
  }

  public void entregarPedido(Lote pedido, Sucursal sucursal){
    System.out.println("Entregando un lote de %s %d a la sucursal %s en el camión %d.",
                       pedido.getNombre(), pedido.getCantidad(),
                       sucursal.getDireccion(), this.camion);
    sucursal.agregaInventario(lote);
  }


  @Override public void update(){}
}
