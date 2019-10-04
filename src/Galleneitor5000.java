import java.util.ArrayList;

/**
 * Clase para la máquina Galleneitor5000:
 * 
 * Tiene un funcionamiento parecido al de la máquina Wonka 3000, pero 
 * sólo hace galletas (saladas, rellenas de mermelada, y con chispas). 
 * 
 * Esta máquina, sin embargo, recibe la masa sin cocinar y debe cocinarse, 
 * no tienen moldes distintos pues todas las galletas son redondas, y las 
 * galletas con chispas se cocinan con las chispas en la masa sin ingredientes 
 * extra, por lo que el proceso de preparación es distinto, sin embargo se 
 * requiere que el proceso se estandarice para que al llegar la empaquetación 
 * todo sea uniforme.
 */
public class Galleneitor5000 extends Maquina{

  /**
   * Constructor de la máquina Galleneitor5000.
   * @param la lista de ingredientes disponibles.
   */
  public Galleneitor5000(ArrayList<Ingrediente> ingredientes){
    this.ingredientes = ingredientes;
    this.recetas = new ArrayList<Producto>();
    Producto conMermelada = new GalletaAdapter(new GalletaConMermelada());
    Producto conChispas = new GalletaAdapter(new GalletaConChispas());
    Producto salada = new GalletaAdapter(new GalletaSalada());
    recetas.add(conMermelada);
    recetas.add(conChispas);
    recetas.add(salada);
  }

  @Override public Producto creaProducto1(String tipo){
    return new GalletaAdapter(new GalletaSalada());
  }

  @Override public Producto creaProducto2(String tipo){
    return new GalletaAdapter(new GalletaConChispas());
  }

  @Override public Producto creaProducto3(String tipo){
    return new GalletaAdapter(new GalletaConMermelada());
  }

}
