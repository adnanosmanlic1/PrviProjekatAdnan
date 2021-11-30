package seven;

import seven.animal.Cat;
import seven.animal.Dog;
import seven.animal.Fish;
import seven.animal.Hamster;
import seven.animal.Bird;
import seven.human.Employe;
import seven.human.Person;
import seven.human.Professor;

public class MainTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Dog dog = new Dog();
        professor.setAnimal(dog);
        Cat cat = new Cat();
        professor.setAnimal(cat);
        Fish fish = new Fish();
        fish.setType("Šaran");
        professor.setAnimal(fish);
        Fish fish1 = new Fish();
        fish1.setName("Pastrmka");
        fish1.setType("Pastrmka");
        professor.setAnimal(fish1);
        System.out.println(professor.getAnimal().getName());
        Hamster hamster = new Hamster();

        Bird bird = new Bird();
        professor.setAnimal(bird);










    }
}
