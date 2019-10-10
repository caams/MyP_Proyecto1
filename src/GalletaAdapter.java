/**
 * Clase GalletaAdapter que extiende de la clase Producto.
 * Utiliza el patrón Adapter para poder estandarizar la empaquetación
 * tratando una galleta como producto.
 */
public class GalletaAdapter extends Producto{

  /** Galleta privada de la clase Galleta. */
  private Galleta galleta;

  /**
   * Constructor para el adaptador de Galleta.
   * @param galleta que recibe para adaptarla.
   */
  public GalletaAdapter(Galleta galleta){
    this.galleta = galleta;
    this.creador = Galleneitor5000.getInstance();
    this.nombre = galleta.getNombre();
    this.ingredientes = galleta.getIngredientes();
  }

  /* Método para eligir un molde de galleta. */
  @Override public void elegirMolde(){
    this.galleta.elegirMolde();
  }

  /* Método para preparar la base de la galleta. */
  @Override public void prepararBase(){
    this.galleta.prepararMasa();
  }

  /* Método para enmoldar la galleta en el molde elegido. */
  @Override public void enmoldar(){
    this.galleta.enmoldar();
    try{
      Thread.sleep(1000);
    }catch(InterruptedException ie){
      System.out.println("Hilo de ejecución interrumpido.");
    }
    this.galleta.hornear();
  }

  /* Método para agregar un complemento de galleta. */
  @Override public void agregarComplemento(){
    this.galleta.agregarComplemento();
  }
}
