import java.util.ArrayList;

public class Sucursal2 extends Sucursal{

  private ArrayList<Lote> inventario;

  public Sucursal2(){
    this.id = 2;
    this.direccion = "Avenida Miguel Hidalgo";
    this.repostero = new ReposteroEncargado("duh");
    this.inventario = new ArrayList<Lote>();
  }

  @Override public ArrayList<Lote> toArrayList(){
    return this.inventario;
  }

  @Override public void agregaInventario(Lote lote){
    this.inventario.add(lote);
  }

}
