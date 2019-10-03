public class DulcesRosa{

  public static void main(String[] args){
    // FactoryProducer productora = new FactoryProducer();
    // Maquina chocolates = productora.getFactory("Chocolate");
    // chocolates.creaProducto1();

    Chocolate choc = new ChocolateConLeche();
    choc.preparaProducto();
  }
}
