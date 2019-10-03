import java.util.ArrayList;

public abstract class Wonka3000 extends Maquina{

  public Wonka3000(){
    ArrayList<Producto> recetas = new ArrayList<>();
    Producto gusanito = new Gusanito();
    Producto frutita = new Frutita();
    Producto osito = new Osito();
    Producto conLeche = new ChocolateConLeche();
    Producto conAlmendra = new ChocolateConAlmendra();
    Producto oscuro = new ChocolateOscuro();
    recetas.add(gusanito);
    recetas.add(frutita);
    recetas.add(osito);
    recetas.add(conLeche);
    recetas.add(conAlmendra);
    recetas.add(oscuro);
    this.recetas = recetas;
  }

}
