import java.util.ArrayList;

public abstract class Chocolate extends Producto{

  public Chocolate(){
    this.creador = Wonka3000.getInstance();
    this.setIngredientes(new ArrayList<Ingrediente>());
    this.getIngredientes().add(new Ingrediente("Cacao", 2, 12800));
    this.getIngredientes().add(new Ingrediente("Manteca de Cacao", 4, 12800));
    this.getIngredientes().add(new Ingrediente("Azúcar", 8, 6400));
  }

  @Override public void elegirMolde(){
    System.out.println("Tomando molde para chocolates...");
  }

  @Override public void enmoldar(){
    System.out.println("Vaciando mezcla en el molde para chocolates...");
  }
}
