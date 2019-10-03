import java.util.ArrayList;

public abstract class Galleta{

  @Override public Producto creaProducto1(String tipo){
    return new GalletaSalada();
  }

  @Override public Producto creaProducto2(String tipo){
    return new GalletaConChispas();
  }

  @Override public Producto creaProducto3(String tipo){
    return new GalletaConMermelada();
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
