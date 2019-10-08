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
  @Override public Producto creaProducto(String tipo){
    tipo = tipo.toLowerCase();
    if(tipo.contains("chocolate"))
      return creaProducto1(tipo);
    else if(tipo.contains("gomita"))
      return creaProducto2(tipo);
    return null;
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
  public Producto creaProducto1(String tipo){
    if(tipo.contains("oscuro"))
      return new ChocolateOscuro();
    else if(tipo.contains("con leche"))
      return new ChocolateConLeche();
    else if(tipo.contains("con almendra"))
      return new ChocolateConAlmendra();
    return null;
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
  public Producto creaProducto2(String tipo){
    if(tipo.contains("frutita"))
      return new Frutita();
    else if(tipo.contains("gusanito"))
      return new Gusanito();
    else if(tipo.contains("osito"))
      return new Osito();
    return null;
  }

}
