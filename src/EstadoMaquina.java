public interface EstadoMaquina{

  public void encenderse();

  public void apagarse();

  public Producto prepararPedido(String tipo);

  public void reabastecerse(Ingrediente ingrediente);

  public Lote empacar(Producto producto, int cantidad);
}
