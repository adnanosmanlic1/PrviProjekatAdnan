package six.beverage;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Main.consumeBeverage(coffee);
        Tea tea = new Tea();
        Main.consumeBeverage(tea);
        CocaCola cocaCola = new CocaCola();
        Main.consumeBeverage(cocaCola);

  //      BeverageConsumer beverageConsumer = new BeverageConsumer(coffee);
    //    beverageConsumer.consume();
    //    beverageConsumer.setBeverage(tea);
      //  beverageConsumer.consume();
        // beverageConsumer.setBeverage(cocaCola);
        // beverageConsumer.consume();

    }

    private static void consumeBeverage(Beverage beverage){
        System.out.println("Pijem " +beverage.getName()+ " i košta me to " + beverage.cost());

    }

}
// 1. Imamo coffee pa, proslijedimo cosumeru, p se pozove cosume
