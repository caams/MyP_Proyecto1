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

  @Override public Producto creaProducto1(String tipo){
    String tipo2 = tipo.toLowerCase();
    switch(tipo2){
      case "chocolate":
        return new ChocolateOscuro();
        break;
      case "gomita":
        return new Gusanito();
        break;
      default:
        return null;
    }
    return null;
  }

  @Override public Producto creaProducto2(String tipo){
    String tipo2 = tipo.toLowerCase();
    switch(tipo2){
      case "chocolate":
        return new ChocolateConLeche();
        break;
      case "gomita":
        return new Frutita();
        break;
      default:
        return null;
    }
    return null;
  }

  @Override public Producto creaProducto3(String tipo){
    String tipo2 = tipo.toLowerCase();
    switch(tipo2){
      case "chocolate":
        return new ChocolateConAlmendra();
        break;
      case "gomita":
        return new Osito();
        break;
      default:
        return null;
    }
    return null;
  }

}
