import java.util.ArrayList;

/**
 * Clase abstracta Gomita que extiende a Producto.
 */
public abstract class Gomita extends Producto{

  /**
   * Contructor de la clase Gomita.
   * Se crea una instancia de la máquina encargada de las gomitas y se 
   * añaden los ingredientes para las gomitas a la lista de ingredientes.
   */
  public Gomita(){
    this.creador = Wonka3000.getInstance();
    this.setIngredientes(new ArrayList<Ingrediente>());
    this.getIngredientes().add(new Ingrediente("Grenetina", 5, 375));
    this.getIngredientes().add(new Ingrediente("Agua", 6, 2950));
    this.getIngredientes().add(new Ingrediente("Miel de maiz", 7, 1475));
    this.getIngredientes().add(new Ingrediente("Azúcar", 8, 5625));
  }

  /**
   * Se prepara la base para las gomitas.
   */
  @Override public void prepararBase(){
    System.out.println("Preparando base para gomitas:");
    this.usarIngrediente("Agua");
    this.usarIngrediente("Azúcar");
    this.usarIngrediente("Miel de maiz");
    this.usarIngrediente("Grenetina");
  }

  /* Método para enmoldar las gomitas. */
  @Override public void enmoldar(){
    System.out.println("Vaciando mezcla en el molde...");
  }
}
