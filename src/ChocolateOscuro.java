public class ChocolateOscuro extends Chocolate{

 public ChocolateOscuro(){
   this.nombre = "Chocolate Oscuro";
   for(Ingrediente ing : this.getIngredientes()){
     if(ing.getNombre() == "Cacao")
       ing.setCantidad(15000);
   }
 }

  @Override public void prepararBase(){
    System.out.println("Preparando base de chocolate oscuro...");
    for(Ingrediente ing : this.getIngredientes()){
      System.out.println(String.format("Agregando %d gramos de %s",
                         ing.getCantidad(), ing.getNombre()));
    }
  }

  @Override public void agregarComplemento(){}
}
