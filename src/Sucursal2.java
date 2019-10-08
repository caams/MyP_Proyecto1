import java.util.ArrayList;

public class Sucursal2 extends Sucursal{

  private ArrayList<Lote> inventario;

  @Override public ArrayList<Lote> toArrayList(){
    return this.inventario;
  }

  @Override public void agregaInventario(Lote lote){
    this.inventario.add(lote);
  }

}
