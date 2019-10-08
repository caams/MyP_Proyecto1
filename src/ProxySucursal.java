import java.util.ArrayList;

public class ProxySucursal extends Sucursal{

  private Sucursal sucursal;

  public ProxySucursal(Sucursal sucursal){
    this.sucursal = sucursal;
  }

  public ArrayList<Lote> toArrayList(){
    return this.sucursal.toArrayList();
  }
}
