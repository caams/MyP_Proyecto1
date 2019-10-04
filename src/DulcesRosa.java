import java.util.ArrayList;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

public class DulcesRosa{

  public static void main(String[] args){
    ArrayList<Ingrediente> ingredientes = new ArrayList<>();
    ingredientes.add(new Ingrediente("Feo", 2, 20));
    FactoryProducer productora = new FactoryProducer();
    Maquina galle = productora.getFactory("galleta", ingredientes);
    Producto ash = galle.creaProducto1("sduh");
    ash.preparaProducto();

  }
}
