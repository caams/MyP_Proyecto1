import java.util.ArrayList;

public abstract class Sucursal{

  protected int id;
  protected String direccion;
  protected ReposteroEncargado repostero;

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

  public void hacerPedido(String pedido, int cantidad){
    this.repostero.hacerPedido(pedido, this, cantidad);
  }

  public abstract void agregaInventario(Lote lote);
}
