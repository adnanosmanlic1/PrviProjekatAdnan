package eight;

import five.Person;
import seven.animal.Flyable;

public class EightExecutor {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Sead");
        //  LAMBDA Operator
        Flyable flyable = ()-> {
            System.out.println("I'm flying in JAVA 8 style.");
        };
        flyable.fly();







    }
}
