import java.util.ArrayList;

public abstract class Galleta{

  public Galleta(){
    this.setIngredientes(new ArrayList<Ingrediente>());
    this.getIngredientes().add(new Ingrediente("Harina", 13, 2000));
    this.getIngredientes().add(new Ingrediente("Leche", 5, 2000));
    this.getIngredientes().add(new Ingrediente("Huevo", 14, 2000));
  }

  public void prepararGalleta(){
    elegirMolde();
    prepararMasa();
    enmoldar();
    hornear();
    agregarComplemento();
  }

  public void elegirMolde(){
    System.out.println("Tomando molde para galletas");
  }

  public void enmoldar(){
    System.out.println("Colocando la masa en los moldes");
  }

  public void hornear(){
    System.out.println("Hornenado las galletas");
  }

  public abstract void prepararMasa();
  public abstract void agregarComplemento();

}
