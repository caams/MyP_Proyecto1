/**
 * Clase Repartidor. Cada repartidor tiene un nombre, un id y un rfc.
 */
public class Repartidor{

  /* Nombre del repartidor. */
  private String nombre;
  /* Identificación del repartidor. */
  private int id;
  /* RFC del repartidor. */
  private String rfc;

  /**
   * Contructor de la clase Repartidor.
   * @param nombre el nombre del repartidor.
   * @param id el número de identificación del repartidor.
   * @param rfc el RFC del repartidor.
   */
  public Repartidor(String nombre, int id, String rfc){
    this.nombre = nombre;
    this.id = id;
    this.rfc = rfc;
  }

  /**
   * Regresa el nombre del repartidor.
   * @return el nombre del repartidor.
   */
  public String getNombre(){
    return this.nombre;
  }

  /**
   * Regresa el número de identificación del repartidor.
   * @return el ID del repartidor.
   */
  public int getID(){
    return this.id;
  }

  /**
   * Regresa el RFC del repartidor.
   * @return el RFC del repartidor.
   */
  public String getRFC(){
    return this.rfc;
  }
}
