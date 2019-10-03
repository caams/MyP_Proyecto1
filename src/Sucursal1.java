import java.util.LinkedList;

public class Sucursal1{

  private int id;
  private String direccion;
  private ResposteroEncargado respostero;
  private LinkedList<Lote> inventario;

  public void displayInventario(){
    for(Lote lote : inventario){
      System.out.println("Producto: " + lote.getProducto().getNombre());
      System.out.println("Cantidad: " + (String)lote.getCantidad() + "\n");
    }
  }

}
