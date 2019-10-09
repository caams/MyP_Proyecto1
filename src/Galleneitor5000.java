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
   * @param lista la lista de ingredientes disponibles.
   */
  private Galleneitor5000(){
    DulcesRosa dr = DulcesRosa.getInstance();
    this.ingredientes = new ArrayList<Ingrediente>();
    for(int i = 8; i < dr.ingredientes.size(); i++){
      this.ingredientes.add(dr.ingredientes.get(i));
    }
  }

  public static Maquina getInstance(){
    if(instance == null)
      instance = new Galleneitor5000();
    return instance;
  }

  @Override public Producto creaProducto(String tipo){
    tipo = tipo.toLowerCase();
    if(tipo.contains("salada")){
      return new GalletaAdapter(new GalletaSalada());
    }else if(tipo.contains("con chispas")){
      return new GalletaAdapter(new GalletaConChispas());
    }else if(tipo.contains("con mermelada")){
      return new GalletaAdapter(new GalletaConMermelada());
    }
    return null;
  }
}
