import java.util.ArrayList;

/**
 * Clase para el proxy de cada sucursal. Implementa el patrón Proxy.
 */
public class ProxySucursal extends Sucursal{

  /* Sucursal que recibirá pedidos utilizando un proxy. */
  private Sucursal sucursal;

  /**
   * Contructor para el proxy de cada sucursal.
   * @param sucursal la sucursal que utilizará el proxy.
   */
  public ProxySucursal(Sucursal sucursal){
    this.sucursal = sucursal;
    this.id = sucursal.getID();
    this.direccion = sucursal.getDireccion();
    this.repostero = sucursal.getReposteroEncargado();
  }

  /**
   * Regresa la lista de los pedidos de la sucursal.
   */
  @Override public ArrayList<Lote> toArrayList(){
    return this.sucursal.toArrayList();
  }

  /**
   * Agrega el lote recibido al inventario de la sucursal.
   */
  @Override public void agregaInventario(Lote lote){
    this.sucursal.agregaInventario(lote);
  }
}
