public interface EstadoMaquina{

  public void encenderse();

  public void activarse();

  public void suspenderse();

  public void apagarse();

  public Producto prepararPedido(String tipo);

  public void reabastecerse(Ingrediente ingrediente);

  public void empacar(Producto producto);

  public void entregar();
}
