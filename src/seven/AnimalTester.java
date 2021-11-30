package seven;

import seven.animal.Animal;
import seven.animal.Cat;
import seven.animal.Dog;
import seven.animal.Fish;

public class AnimalTester {
    public static void main(String[] args) {
        //animal.. Object(TIP varijable),Animal,Dog

        Animal animal = new Dog();
        AnimalTester.test(animal);
        animal = new Cat();
        AnimalTester.test(animal);


    }
    static void test(Animal animal){
        if(animal instanceof Dog){
            System.out.println("Pas");
        }else if(animal instanceof Cat){
            System.out.println("Mačka");
        }else if(animal instanceof Fish){
            System.out.println("Riba");
        }else {
            System.out.println("Neka životinja");
        }

    }
}
