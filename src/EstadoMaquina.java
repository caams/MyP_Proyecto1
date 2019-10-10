/**
 * Interfaz para los estados de la máquina.
 * Implementa el patrón State.
 */
public interface EstadoMaquina{

  /* Enciende la máquina. */
  public void encenderse();

  /* Apaga la maquina. */
  public void apagarse();

  /**
   * El estado de la máquina es preparando un producto de algún tipo.
   * @param tipo el producto que preparará.
   * @return el producto al terminar de prepararlo.
   */
  public Producto prepararPedido(String tipo);

  /**
   * El estado de la máquina es reabasteciendo algún ingrediente.
   * @param ingrediente a reabastecer.
   */
  public void reabastecerse(Ingrediente ingrediente);

  /**
   * El estado de la máquina es empacando un producto.
   * @param producto el producto a empaquetar.
   * @param cantidad la cantidad del prodcuto a empaquetar.
   * @return el lote de la cantidad del producto empaquetado.
   */
  public Lote empacar(Producto producto, int cantidad);
}
