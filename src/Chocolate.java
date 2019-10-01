public abstract class Chocolate extends Dulce{

  public Chocolate(String sabor){
    if(sabor.equalsIgnoreCase("con leche")){
      return new ChocolateConLeche();
    }else if(sabor.equalsIgnoreCase("con almendra")){
      return new ChocolateConAlmendra();
    }else if(sabor.equalsIgnoreCase("oscuro")){
      return new ChocolateOscuro();
    }
    return null;
  }

  public void preparaDulce(){
    preparaBase();
    enmoldar();
    agregaComplemento();
  }

  public void enmoldar(){

  }

  public abstract void preparaBase();

  public abstract void agregaComplemento();

}
