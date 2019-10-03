public abstract class Galleneitor5000 extends Maquina{

  public Galleneitor5000(){
    ArrayList<Producto> recetas = new ArrayList<>();
    Producto conMermelada = new GalletaConMermelada();
    Producto conChispas = new GaletaConChispas();
    Producto salada = new GalletaSalada();
    recetas.add(conMermelada);
    recetas.add(conChispas);
    recetas.add(salada);
    this.recetas = recetas;
  }

}
