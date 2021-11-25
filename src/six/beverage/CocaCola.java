package six.beverage;

public class CocaCola extends Beverage {

    public CocaCola() {
        super("cocaCola");
    }

    @Override
    public double cost() {
        return 3.0;
    }

    @Override
    public void drink() {
        System.out.println("Konzumira se zbog tog da ne budemo fit");

    }
}
