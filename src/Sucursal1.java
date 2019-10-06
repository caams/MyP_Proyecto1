import java.util.LinkedList;

public class Sucursal1{

  private int id;
  private String direccion;
  private ReposteroEncargado respostero;
  private LinkedList<Lote> inventario;

  public void displayInventario(){
    for(Lote lote : inventario){
      System.out.println("Producto: " + lote.getProducto().getNombre());
      System.out.println(String.format("Cantidad: %d\n", lote.getCantidad()));
    }
  }

}
