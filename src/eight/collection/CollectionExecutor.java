package eight.collection;

import java.util.ArrayList;

public class CollectionExecutor {
    public static void main(String[] args) {

        String[] personArray = new String[3];
        personArray[0] = "Omer";
        personArray[1] = "Ismar";
        personArray[2] = "Berin";
        for(String name: personArray){
            System.out.println(name);
        }
        System.out.println("........");
        // svi unutar niza personArray su tipa Person
        // svi unutar objekta personArrayLista su tipa Person
        ArrayList<String> personArrayList = new ArrayList<>();
        personArrayList.add("Omer");
        personArrayList.add("Ismar");
        personArrayList.add("Berin");
        personArrayList.add("Kerima");
        personArrayList.add("Jasna");
        personArrayList.add("Neila");
        for(String name: personArrayList) // enhaced for petlja
            System.out.println(name);
        }
        NaturalNumber naturalNumber = new NaturalNumber();



}

