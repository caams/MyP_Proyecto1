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

  public void hacerPedido(String pedido, int cantidad){
    System.out.println("==================================================================="+
                       "===================================================================");
    System.out.println(String.format("La sucursal %d ha hecho un pedido de %d %s de %s.",
    this.getID(), cantidad, cantidad > 1 ? "lotes" : "lote", pedido));
    this.repostero.hacerPedido(pedido, this, cantidad);
    System.out.println("==================================================================="+
                       "===================================================================\n");
  }

  public abstract void agregaInventario(Lote lote);
}
