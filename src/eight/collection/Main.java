package eight.collection;

import eight.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String imput = "23";
        int number = Integer.parseInt(imput);
        Box<Integer> kutija = new Box<>();
        kutija.setField(23);
        kutija.getField();
















        // polja niza su indeksirana
        // Ograničenje: svi moraju biti String
        // Ograničenje 2 : fiksna duzina niza

        String[] names = new String[3];
        names[0] = "Nejla";
        names[1] = "Jasna";
        names[2] = "Selma";
        names [3] ="Kerima";

        Person person = new Person();
        person.setName("Kerima");
        person.setSurname("Grabovica");
        person.setAge(13);

        //names, person ->> sirovi slozeni tipovi podataka

        Box<Person> box = new Box<>();
        box.setField(person);

        Box<String> box2 = new Box<>();
        box2.setField("Tekst..");
        //SIROVI RAW type
        Box box3 = new Box();
        box3.setField(new Object());

        ArrayList<Person> persons = new ArrayList<>(); // dinamicki niz

        Box<Integer> box4 = new Box<>();



    }
}
