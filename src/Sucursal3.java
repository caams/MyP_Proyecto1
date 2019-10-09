import java.util.Hashtable;
import java.util.Set;
import java.util.ArrayList;

public class Sucursal3 extends Sucursal{

  private Hashtable<Integer, Lote> inventario;

  public Sucursal3(){
    this.id = 3;
    this.direccion = "Boulevard Ignacio Zaragoza";
    this.repostero = new ReposteroEncargado("ash");
    this.inventario = new Hashtable<Integer, Lote>();
  }

  @Override public ArrayList<Lote> toArrayList(){
    ArrayList<Lote> inv = new ArrayList<>();
    Set<Integer> lotes = this.inventario.keySet();
    for(int key : lotes){
      inv.add(this.inventario.get(key));
    }
    return inv;
  }

  @Override public void agregaInventario(Lote lote){
    int i = inventario.size();
    inventario.put(i, lote);
  }

}
