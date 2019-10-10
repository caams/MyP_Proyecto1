/**
 * Clase del repostero encargado de cada sucursal. Los reposteros tienen un nombre.
 */
public class ReposteroEncargado{

  /* Nombre del repostero. */
  private String nombre;

  /**
   * Contructor de la clase ReposteroEncargado.
   * @param nombre el nombre del repostero encargado de cada sucursal.
   */
  public ReposteroEncargado(String nombre){
    this.nombre = nombre;
  }

  /**
   * Método para realizar un pedido de cada sucursal. Se crea un nuevo jefe técnico
   * que va a validar el pedido y un proxy para la sucursal para recibir el pedido.
   * @param pedido el pedido a realizar de la sucursal.
   * @param sucursal que realizará el pedido.
   * @param cantidad de lotes del pedido a realizar.
   */
  public void hacerPedido(String pedido, Sucursal sucursal, int cantidad){
    JefeTecnico jt = new JefeTecnico();
    ProxySucursal ps = new ProxySucursal(sucursal);
    jt.procesarPedido(ps, pedido, cantidad);
  }
}
