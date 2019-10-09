public class GalletaAdapter extends Producto{

  private Galleta galleta;

  public GalletaAdapter(Galleta galleta){
    this.galleta = galleta;
    this.creador = Galleneitor5000.getInstance();
    this.nombre = galleta.getNombre();
    this.ingredientes = galleta.getIngredientes();
  }

  @Override public void elegirMolde(){
    this.galleta.elegirMolde();
  }

  @Override public void prepararBase(){
    this.galleta.prepararMasa();
  }

  @Override public void enmoldar(){
    this.galleta.enmoldar();
    try{
      Thread.sleep(1000);
    }catch(InterruptedException ie){
      System.out.println("Hilo de ejecución interrumpido.");
    }
    this.galleta.hornear();
  }

  @Override public void agregarComplemento(){
    this.galleta.agregarComplemento();
  }
}
