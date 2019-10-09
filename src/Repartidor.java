public class Repartidor{

  private String nombre;
  private int id;
  private String rfc;

  public Repartidor(String nombre, int id, String rfc){
    this.nombre = nombre;
    this.id = id;
    this.rfc = rfc;
  }

  public String getNombre(){
    return this.nombre;
  }

  public int getID(){
    return this.id;
  }

  public String getRFC(){
    return this.rfc;
  }
}
