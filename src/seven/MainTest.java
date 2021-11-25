package seven;

import seven.human.Person;

public class MainTest {
    public static void main(String[] args) {
        Person person = new Person();
        Gender gender1 =Gender.MALE;
        Gender gender2 = Gender.FEMALE;

        System.out.println(gender1.hashCode());
        System.out.println(gender2.hashCode());
    }
}
