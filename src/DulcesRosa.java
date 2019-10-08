import java.util.ArrayList;

public class DulcesRosa{

  public static void main(String[] args){
    FactoryProducer productora = new FactoryProducer();
    Maquina wonka3000 = productora.getFactory("gomita", new ArrayList<Ingrediente>());
    wonka3000.encenderse();
    wonka3000.activarse();
    Producto chocolate = wonka3000.prepararPedido("chocolate oscuro");
    for(Ingrediente i : chocolate.getIngredientes()){
      System.out.println(String.format("%s %d", i.getNombre(), i.getCantidad()));
    }
  }
}
