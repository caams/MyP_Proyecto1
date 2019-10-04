import java.util.ArrayList;

public class Galleneitor5000 extends Maquina{

  public Galleneitor5000(ArrayList<Ingrediente> ingredientes){
    this.ingredientes = ingredientes;
    this.recetas = new ArrayList<Producto>();
    Producto conMermelada = new GalletaAdapter(new GalletaConMermelada());
    Producto conChispas = new GalletaAdapter(new GalletaConChispas());
    Producto salada = new GalletaAdapter(new GalletaSalada());
    recetas.add(conMermelada);
    recetas.add(conChispas);
    recetas.add(salada);
  }

  @Override public Producto creaProducto1(String tipo){
    return new GalletaAdapter(new GalletaSalada());
  }

  @Override public Producto creaProducto2(String tipo){
    return new GalletaAdapter(new GalletaConChispas());
  }

  @Override public Producto creaProducto3(String tipo){
    return new GalletaAdapter(new GalletaConMermelada());
  }

}
