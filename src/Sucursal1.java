import java.util.LinkedList;
import java.util.ArrayList;

public class Sucursal1 extends Sucursal{

  private LinkedList<Lote> inventario;

  public Sucursal1(){
    this.id = 1;
    this.direccion = "Calzada de los Jinetes";
    this.repostero = new ReposteroEncargado("feo");
    this.inventario = new LinkedList<Lote>();
  }

  @Override public ArrayList<Lote> toArrayList(){
    ArrayList<Lote> nuevoInventario = new ArrayList<>();
    for(Lote lote : this.inventario){
      nuevoInventario.add(lote);
    }
    return nuevoInventario;
  }

  @Override public void agregaInventario(Lote lote){
    this.inventario.add(lote);
  }
}
