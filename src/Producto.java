public abstract class Producto{

  private String nombre;
  private ArrayList<Ingrediente> ingredientes;

  public String getNombre(){
    return this.nombre;
  }

  public ArrayList<Ingrediente> getIngredientes(){
    return this.ingredientes;
  }

  public abstract void preparaProducto(){
    elegirMolde();
    prepararBase();
    enmoldar();
    agregarComplemento();
  }
  public abstract void elegirMolde();
  public abstract void prepararBase();
  public abstract void enmoldar();
  public abstract void agregarComplemento();
}
