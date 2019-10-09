public class ReposteroEncargado{

  private String nombre;

  public ReposteroEncargado(String nombre){
    this.nombre = nombre;
  }

  public void hacerPedido(String pedido, Sucursal sucursal, int cantidad){
    JefeTecnico jt = new JefeTecnico();
    ProxySucursal ps = new ProxySucursal(sucursal);
    jt.procesarPedido(ps, pedido, cantidad);
  }
}
