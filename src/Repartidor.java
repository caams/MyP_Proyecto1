public class Repartidor implements UpdateRepartidor{

  private String nombre;
  private int id;
  private int rfc;

  public String getNombre(){
    return this.nombre;
  }

  public int getID(){
    return this.id;
  }

  public int getRFC(){
    return this.rfc;
  }

  @Override public void update(){}
}
