public abstract class Gomita extends Producto{

  public Gomita(){
    this.setIngredientes(new ArrayList<Ingrediente>());
    this.getIngredientes().add("Grenetina", 7, 2000);
    this.getIngredientes().add("Agua", 8, 2000);
    this.getIngredientes().add("Miel de maíz", 9, 2000);
    this.getIngredientes().add("Azucar", 3, 2000);
  }

  @Override public void prepararBase(){
    System.out.println("Preparando base para gomitas...");
  }

  @Override public void enmoldar(){
    System.out.println("Vaciando mezcla en el molde");
  }
}
