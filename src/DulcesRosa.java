import java.util.ArrayList;

public class DulcesRosa{

  public ArrayList<Ingrediente> ingredientes;
  public Repartidor[] repartidores;
  public ArrayList<Sucursal> sucursales;
  private static DulcesRosa instancia;

  private DulcesRosa(){
    sucursales = new ArrayList<Sucursal>();
    sucursales.add(new Sucursal1());
    sucursales.add(new Sucursal2());
    sucursales.add(new Sucursal3());

    repartidores = new Repartidor[10];
    repartidores[0] = new Repartidor("Giles Ibarra", 1, "BL49KS8N22");
    repartidores[1] = new Repartidor("Louile Jefferson", 2, "A04XX2V88");
    repartidores[2] = new Repartidor("Federico Devine", 3, "CX06FK433");
    repartidores[3] = new Repartidor("Asiyah Conroy", 4, "M33X6LM66");
    repartidores[4] = new Repartidor("Alfie-Lee Lopez", 5, "G06DA9011");
    repartidores[5] = new Repartidor("Libbi Rennie", 6, "E8R90GQ55");
    repartidores[6] = new Repartidor("Lex Franco", 7, "FR41HG500");

    ingredientes = new ArrayList<Ingrediente>();
    ingredientes.add(new Ingrediente("Almendra", 1, 100000));
    ingredientes.add(new Ingrediente("Cacao", 2, 100000));
    ingredientes.add(new Ingrediente("Manteca de Cacao", 3, 100000));
    ingredientes.add(new Ingrediente("Grenetina", 4, 100000));
    ingredientes.add(new Ingrediente("Agua", 5, 100000));
    ingredientes.add(new Ingrediente("Miel de maiz", 6, 100000));
    ingredientes.add(new Ingrediente("Saborizante Acido", 7, 100000));
    ingredientes.add(new Ingrediente("Chamoy", 8, 100000));
    ingredientes.add(new Ingrediente("Azúcar", 9, 100000));
    ingredientes.add(new Ingrediente("Leche", 10, 100));
    ingredientes.add(new Ingrediente("Harina", 11, 100000));
    ingredientes.add(new Ingrediente("Huevo", 12, 100000));
    ingredientes.add(new Ingrediente("Sal", 13, 100000));
    ingredientes.add(new Ingrediente("Chispas de Chocolate", 14, 100000));
    ingredientes.add(new Ingrediente("Mermelada", 15, 100000));
    ingredientes.add(new Ingrediente("Cobertura de azucar", 16, 100000));
  }

  public static DulcesRosa getInstance(){
    if(instancia == null)
      instancia = new DulcesRosa();
    return instancia;
  }

  public int getNumRepartidores(){
    int n = 0;
    for(int i = 0; i <= repartidores.length - 1; i++){
      if(repartidores[i] != null)
        n++;
    }
    return n;
  }

  public static void main(String[] args){
    DulcesRosa dr = getInstance();
    Sucursal s1 = dr.sucursales.get(0);
    Sucursal s2 = dr.sucursales.get(1);
    Sucursal s3 = dr.sucursales.get(2);
    s1.hacerPedido("Chocolate con Almendra", 5);
    s1.hacerPedido("Chocolate con Leche", 1);
    s2.hacerPedido("Galleta con Chispas", 4);
    s3.hacerPedido("Chocolate Oscuro", 3);
    s2.hacerPedido("Galleta con Chispas", 1);
    s3.hacerPedido("Chocolate con Café", 2);

    System.out.println("INVENTARIO GENERAL DE LAS SUCURSALES\n");
    for(Sucursal s : dr.sucursales){
      s.displayInventario();
    }
  }
}
