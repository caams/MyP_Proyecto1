import java.util.ArrayList;

public abstract class Galleta{

  protected String nombre;
  protected ArrayList<Ingrediente> ingredientes;
  protected Maquina productora;

  public Galleta(){
    this.productora = Galleneitor5000.getInstance();
    this.ingredientes = new ArrayList<Ingrediente>();
    this.ingredientes.add(new Ingrediente("Harina", 11, 8850));
    this.ingredientes.add(new Ingrediente("Azúcar", 8, 7800));
    this.ingredientes.add(new Ingrediente("Leche", 3, 5000));
    this.ingredientes.add(new Ingrediente("Huevo", 12, 3000));
  }

  public String getNombre(){
    return this.nombre;
  }

  public ArrayList<Ingrediente> getIngredientes(){
    return this.ingredientes;
  }

  public void utilizarIngrediente(String ingrediente){
    if(this.productora.getEstadoActual() instanceof EstadoActivado){
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

  public Ingrediente getIngredient(String ingrediente){
    for(Ingrediente i : this.getIngredientes()){
      if(i.getNombre().equals(ingrediente))
        return i;
    }
    return null;
  }

  public void prepararGalleta(){
    elegirMolde();
    prepararMasa();
    enmoldar();
    hornear();
    agregarComplemento();
  }

  public void elegirMolde(){
    System.out.println("Tomando molde para galletas...");
  }

  public void enmoldar(){
    System.out.println("Colocando la masa en los moldes...");
  }

  public void hornear(){
    System.out.println("Horneando las galletas...");
  }

  public abstract void prepararMasa();
  public abstract void agregarComplemento();

}
