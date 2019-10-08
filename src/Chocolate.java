import java.util.ArrayList;

public abstract class Chocolate extends Producto{

  public Chocolate(){
    this.setIngredientes(new ArrayList<Ingrediente>());
    this.getIngredientes().add(new Ingrediente("Cacao", 1, 2000));
    this.getIngredientes().add(new Ingrediente("Manteca de cacao", 2, 2000));
    this.getIngredientes().add(new Ingrediente("Azucar", 3, 2000));
  }

  @Override public void elegirMolde(){
    System.out.println("Tomando molde para chocolates");
  }

  @Override public void enmoldar(){
    System.out.println("Vaciando mezcla en el molde para chocolates");
  }
}
