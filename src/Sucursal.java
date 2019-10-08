import java.util.ArrayList;

public abstract class Sucursal{

  private int id;
  private String direccion;
  private ReposteroEncargado repostero;

  public int getID(){
    return this.id;
  }

  public String getDireccion(){
    return this.direccion;
  }

  public ReposteroEncargado getReposteroEncargado(){
    return this.repostero;
  }

  public abstract ArrayList<Lote> toArrayList();

  public void displayInventario(){
    for(Lote lote : this.toArrayList()){
      System.out.println("Producto: " + lote.getProducto().getNombre());
      System.out.println(String.format("Cantidad: %d\n", lote.getCantidad()));
    }
  }

  public abstract void agregaInventario(Lote lote);
}
