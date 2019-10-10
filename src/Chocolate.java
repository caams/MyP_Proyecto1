import java.util.ArrayList;

/**
 * Clase abstracta Chocolate que extiende de Producto.
 */
public abstract class Chocolate extends Producto{

  /**
   * Contructor de la clase abstracta Chocolate.
   * Se crea una instancia de la máquina encargada de los chocolates y se 
   * añaden los ingredientes para los chocolates a la lista de ingredientes.
   */
  public Chocolate(){
    this.creador = Wonka3000.getInstance();
    this.setIngredientes(new ArrayList<Ingrediente>());
    this.getIngredientes().add(new Ingrediente("Cacao", 2, 12800));
    this.getIngredientes().add(new Ingrediente("Manteca de Cacao", 4, 12800));
    this.getIngredientes().add(new Ingrediente("Azúcar", 8, 6400));
  }

  /* Se elige el molde de cada chocolate. */
  @Override public void elegirMolde(){
    System.out.println("Tomando molde para chocolates...");
  }

  /* Se enmolda la mezcla de chocolates. */
  @Override public void enmoldar(){
    System.out.println("Vaciando mezcla en el molde para chocolates...");
  }
}
