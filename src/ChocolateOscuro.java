public class ChocolateOscuro extends Chocolate{

 public ChocolateOscuro(){
   this.nombre = "Chocolate Oscuro";
   for(Ingrediente ing : this.getIngredientes()){
     if(ing.getNombre() == "Cacao")
       ing.setCantidad(15000);
   }
 }

  @Override public void prepararBase(){
    System.out.println("Preparando base de Chocolate Oscuro...");
    this.usarIngrediente("Manteca de Cacao");
    this.usarIngrediente("Cacao");
    this.usarIngrediente("Azúcar");
  }

  @Override public void agregarComplemento(){}
}
