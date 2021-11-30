package seven.animal;

public class Bird extends Animal implements Flyable {
    @Override
    public void fly() {
        System.out.println("Ja sam ptica i letim...");
    }
}
