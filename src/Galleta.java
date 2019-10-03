import java.util.ArrayList;

public abstract class Galleta{

  public Galleta(){

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

  public abstract prepararMasa();
  public abstract agregarComplemento();

}
