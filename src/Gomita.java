public abstract class Gomita extends Dulce{

  public Gomita(String sabor){
    if(sabor.equalsIgnoreCase("gusanito")){
      return new Gusanito();
    }else if(sabor.equalsIgnoreCase("frutita")){
      return new Frutita();
    }else if(sabor.equalsIgnoreCase("osito")){
      return new Osito();
    }
    return null;
  }

  public void preparaDulce(){
    preparaBase();
    enmoldar();
    agregaComplemento();
  }

  public abstract void preparaBase(){

  }

  public abstract void enmoldar();

  public abstract void agregaComplemento();
}
