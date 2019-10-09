public interface EstadoMaquina{

  public void encenderse();

  public void activarse();

  public void suspenderse();

  public void apagarse();

  public Producto prepararPedido(String tipo);

  public void reabastecerse(Ingrediente ingrediente);

  public Lote empacar(Producto producto, int cantidad);
}
