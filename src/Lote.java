import java.util.ArrayList;

/**
 * Clase para los lotes de los productos.
 * Cada lote tiene 1000 productos.
 */
public class Lote{

  /* Producto a empaquetar. */
  private Producto producto;
  /* Cantidad del producto a empaquetar. */
  private int cantidad;

  /**
   * Constructor de la clase Lote.
   * @param producto el producto de cada lote.
   * @param cantidad la cantidad del producto de cada lote.
   */
  public Lote(Producto producto, int cantidad){
    this.producto = producto;
    this.cantidad = cantidad;
  }

  /**
   * Regresa el nombre del producto en el lote.
   * @return el nombre del producto del lote.
   */
  public String getNombre(){
    return this.producto.getNombre();
  }

  /**
   * Regresa el prodcucto del lote.
   * @return el producto del lote.
   */
  public Producto getProducto(){
    return this.producto;
  }

  /**
   * Regresa la cantidad de productos en el lote.
   * @return la cantidad de productos del lote.
   */
  public int getCantidad(){
    return this.cantidad;
  }
}
