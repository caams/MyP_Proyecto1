import java.util.ArrayList;

/**
 * Clase abstracta para las sucursales. Las sucursales tienen una identificación,
 * una dirección y un repostero.
 */
public abstract class Sucursal{

  /* Identificación de la sucursal. */
  protected int id;
  /* Dirección de la sucursal. */
  protected String direccion;
  /* Repostero encargado de la sucursal. */
  protected ReposteroEncargado repostero;

  /**
   * Regresa la identificación de la sucursal.
   * @return el id de la sucursal.
   */
  public int getID(){
    return this.id;
  }

  /**
   * Regresa la dirección de la sucursal.
   * @return la dirección de la sucursal.
   */
  public String getDireccion(){
    return this.direccion;
  }

  /**
   * Regresa el repostero encargado de la sucursal.
   * @return el repostero encargado de cada sucursal.
   */
  public ReposteroEncargado getReposteroEncargado(){
    return this.repostero;
  }

  /**
   * Método abstracto del inventario de lotes de la sucursal.
   * @return el inventario de la sucursal.
   */
  public abstract ArrayList<Lote> toArrayList();

  /**
   * Método que imprime el inventario de la sucursal.
   */
  public void displayInventario(){
    System.out.println(String.format("Inventario de Sucursal %d:", this.getID()));
    if(this.toArrayList().size() >= 1){
      for(Lote lote : this.toArrayList()){
        System.out.println("  Producto: " + lote.getProducto().getNombre());
        System.out.println(String.format("  No. de Lotes: %d\n", lote.getCantidad()));
      }
    }else{
      System.out.println("  Inventario vacío.\n");
    }
  }

  /**
   * Permite al repostero encargado de la sucursal hacer un pedido.
   * @param pedido el pedido que realiza la sucursal.
   * @param cantidad de lotes que pedirá en el pedido.
   */
  public void hacerPedido(String pedido, int cantidad){
    System.out.println("==================================================================="+
                       "===================================================================");
    System.out.println(String.format("La sucursal %d ha hecho un pedido de %d %s de %s.",
    this.getID(), cantidad, cantidad > 1 ? "lotes" : "lote", pedido));
    this.repostero.hacerPedido(pedido, this, cantidad);
    System.out.println("==================================================================="+
                       "===================================================================\n");
  }

  /**
   * Método abstracto que agrega los lotes  del pedido al recibirlos.
   * @param lote a añadir en el inventario.
   */
  public abstract void agregaInventario(Lote lote);
}
