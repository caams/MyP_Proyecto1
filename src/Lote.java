import java.util.ArrayList;

public class Lote{

  private Producto producto;
  private int cantidad;
  private ArrayList<Ingrediente> ingredientes;

  public Producto getProducto(){
    return this.producto;
  }

  public int getCantidad(){
    return this.cantidad;
  }

  public ArrayList<Ingrediente> getIngredientes(){
    return this.ingredientes;
  }
}
