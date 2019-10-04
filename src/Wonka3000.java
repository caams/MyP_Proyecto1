import java.util.ArrayList;

/**
 * Clase para la máquina Wonka 3000:
 * 
 * Esta máquina cuenta con 2 módulos para hacer dulces: 
 * chocolate (con leche, oscuro, y con almendras) y 
 * gomitas (ositos dulces, gusanos ácidos, y frutas con chamoy).
 * La máquina tiene guardadas las recetas de los dulces 
 * antes mencionados. 
 * Todos siguen un esquema similar para su preparación: 
 * elige un molde, se pone la mezcla y se le agregan ingredientes extra.
 */
public class Wonka3000 extends Maquina{

  /**
   * Constructor de la máquina Wonka3000.
   * @param la lista de ingredientes disponibles.
   */
  public Wonka3000(ArrayList<Ingrediente> ingredientes){
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
    this.ingredientes = ingredientes;
  }

  /**
   * Crea un chocolate o una gomita dependiendo del string que reciba.
   * <ol>
   *  <li>Caso chocolate: 
   *  @return un chocolate tipo chocolate oscuro. </li>
   *  <li> Caso gomita:
   *  @return una gomita tipo gusanito. </li>
   * </ol>
   * @return null en otro caso.
   */
  @Override public Producto creaProducto1(String tipo){
    String tipo2 = tipo.toLowerCase();
    switch(tipo2){
      case "chocolate":
        return new ChocolateOscuro();
      case "gomita":
        return new Gusanito();
      default:
        return null;
    }
  }

    /**
   * Crea un chocolate o una gomita dependiendo del string que reciba.
   * <ol>
   *  <li>Caso chocolate: 
   *  @return un chocolate tipo chocolate con leche. </li>
   *  <li> Caso gomita:
   *  @return una gomita tipo frutita. </li>
   * </ol>
   * @return null en otro caso.
   */
  @Override public Producto creaProducto2(String tipo){
    String tipo2 = tipo.toLowerCase();
    switch(tipo2){
      case "chocolate":
        return new ChocolateConLeche();
      case "gomita":
        return new Frutita();
      default:
        return null;
    }
  }

    /**
   * Crea un chocolate o una gomita dependiendo del string que reciba.
   * <ol>
   *  <li>Caso chocolate: 
   *  @return un chocolate tipo chocolate con almendra. </li>
   *  <li> Caso gomita:
   *  @return una gomita tipo osito. </li>
   * </ol>
   * @return null en otro caso.
   */
  @Override public Producto creaProducto3(String tipo){
    String tipo2 = tipo.toLowerCase();
    switch(tipo2){
      case "chocolate":
        return new ChocolateConAlmendra();
      case "gomita":
        return new Osito();
      default:
        return null;
    }
  }

}
