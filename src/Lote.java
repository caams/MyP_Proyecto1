import java.util.ArrayList;

public class Lote{

  private Producto producto;
  private int cantidad;

  public Lote(Producto producto, int cantidad){
    this.producto = producto;
    this.cantidad = cantidad;
  }

  public String getNombre(){
    return this.producto.getNombre();
  }

  public Producto getProducto(){
    return this.producto;
  }

  public int getCantidad(){
    return this.cantidad;
  }
}
