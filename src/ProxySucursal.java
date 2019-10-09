import java.util.ArrayList;

public class ProxySucursal extends Sucursal{

  private Sucursal sucursal;

  public ProxySucursal(Sucursal sucursal){
    this.sucursal = sucursal;
    this.id = sucursal.getID();
    this.direccion = sucursal.getDireccion();
    this.repostero = sucursal.getReposteroEncargado();
  }

  @Override public ArrayList<Lote> toArrayList(){
    return this.sucursal.toArrayList();
  }

  @Override public void agregaInventario(Lote lote){
    this.sucursal.agregaInventario(lote);
  }
}
