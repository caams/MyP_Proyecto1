import java.util.ArrayList;

/**
 * Clase abstracta Galleta. Las galletas tienen un nombre, sus propios ingredientes y una máquina productora.
 */
public abstract class Galleta{

  /* Nombre de la galleta. */
  protected String nombre;
  /* Lista de los ingredientes para las galletas. */
  protected ArrayList<Ingrediente> ingredientes;
  /* Máquina productora de las galletas. */
  protected Maquina productora;

  /**
   * Contructor de la clase abstracta Galleta.
   * Se crea una instancia de la máquina encargada de las galletas y se 
   * añaden los ingredientes para las galletas a la lista de ingredientes.
   */
  public Galleta(){
    this.productora = Galleneitor5000.getInstance();
    this.ingredientes = new ArrayList<Ingrediente>();
    this.ingredientes.add(new Ingrediente("Harina", 11, 8850));
    this.ingredientes.add(new Ingrediente("Azúcar", 8, 7800));
    this.ingredientes.add(new Ingrediente("Leche", 3, 5000));
    this.ingredientes.add(new Ingrediente("Huevo", 12, 3000));
  }

  /**
   * Regresa el nombre de la galleta.
   * @return el nombre de la galleta.
   */
  public String getNombre(){
    return this.nombre;
  }

  /**
   * Regresa la lista de los ingredientes de las galletas.
   * @return la lista de los ingredientes de las galletas.
   */
  public ArrayList<Ingrediente> getIngredientes(){
    return this.ingredientes;
  }

  /**
   * Si la máquina productora tiene un estado aceptable agrega un ingrediente a la vez.
   * Después de usar dicho ingrediente, se decrementa la cantidad del ingrediente usado.
   * @param ingrediente el ingrediente para preparar la galleta.
   */
  public void utilizarIngrediente(String ingrediente){
    if(this.productora.getEstadoActual() instanceof EstadoPreparando){
      Ingrediente ing = this.getIngredient(ingrediente);
      System.out.println(String.format("  Agregando %2.2f kilos de %s...",
                         ((double)ing.getCantidad())/1000, ing.getNombre()));
      try{
        Thread.sleep(1000);
      }catch(InterruptedException ie){
        System.out.println("Hilo de ejecución interrumpido.");
      }
      ing.drawIngredientes(this.productora);
    }
  }

  /**
   * Método que regresa un ingrediente del tipo que se pide.
   * @param ingrediente que se pide regresar.
   * @return el ingrediente que se solicita si existe, null en otro caso.
   */
  public Ingrediente getIngredient(String ingrediente){
    for(Ingrediente i : this.getIngredientes()){
      if(i.getNombre().equals(ingrediente))
        return i;
    }
    return null;
  }

  /**
   * Método template para preparar la receta de cada galleta.
   */
  public void prepararGalleta(){
    elegirMolde();
    prepararMasa();
    enmoldar();
    hornear();
    agregarComplemento();
  }

  /* Elige el molde default de cada galleta. */
  public void elegirMolde(){
    System.out.println("Tomando molde para galletas...");
  }

  /* Enmolda la masa de las galletas. */
  public void enmoldar(){
    System.out.println("Colocando la masa en los moldes...");
  }

  /* Hornea las galletas. */
  public void hornear(){
    System.out.println("Horneando las galletas...");
  }

  /* Método abstracto para preparar la masa de cada galleta. */
  public abstract void prepararMasa();
  /* Método abstracto para agregar un complemento a cada galleta. */
  public abstract void agregarComplemento();

}
