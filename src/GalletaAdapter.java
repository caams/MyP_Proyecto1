public class GalletaAdapter extends Producto{

  private Galleta galleta;

  public GalletaAdapter(Galleta galleta){
    this.galleta = galleta;
  }

  @Override public void elegirMolde(){
    this.galleta.elegirMolde();
  }

  @Override public void prepararBase(){
    this.galleta.prepararMasa();
  }

  @Override public void enmoldar(){
    this.galleta.enmoldar();
    this.galleta.hornear();
  }

  @Override public void agregarComplemento(){
    this.galleta.agregarComplemento();
  }
}
