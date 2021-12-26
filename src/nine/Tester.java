package nine;

import seven.Gender;
import six.Movie;

import javax.swing.text.Element;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

// CILJ: jednom funkcijom zadovoljit šefa

public class Tester {
    public static void main(String[] args) {
        PersonReader personReader = new PersonReader();
        List<String> names = Arrays.asList("Sead", "Muamer","Selma","Ismar");
        List <Movie> movies= new ArrayList<>();
        movies.add(new Movie("Prohujalo s vihorom"));
        movies.add(new Movie("Kum"));
        movies.add(new Movie(" X-Men"));
        //2.1Siroviobjektni tip
        List lista = new ArrayList();
        //2.2
        List<Person> personList = personReader.upitNaBazu();
        procesElements(personList, p->true, p -> System.out.println(p));
        procesElements(names, p->true, p-> System.out.println(p));
        procesElements(movies,m-> true, m-> System.out.println(m));
        //printPersons(personList);
        //printPersonsOlderThan(personList, 20);
       // printPersonWithinAges(personList, 50,60);
        PersonTester personTester = (Person p) -> p.getGender().equals(Gender.FEMALE);

    }

    private static <T> void procesElements(List<T> elements , Predicate<T> tester, Consumer<T> procesor){

        //iterator
       // for(T element: elements){
         //   if(tester.test(element)){
           //     procesor.accept(element);
            //}
        //}
        //Spliterator -> Stream ... procesiranje elemenata unutar kolekcije
        /*
        1. Izvor stream
        2. Intermidiate operations ili međuoperacija ->filter
        3. Terminate operation

         */


       // Movie movie = new Movie().setDirector("Maximillian").setTitle("Kum");
        elements.stream()
                .filter(tester)
                .forEach(procesor);


        Stream<T> stream =  elements.stream() ;    // svi elementi
                stream = stream.filter(tester);   //samo elementi koji zadovolje tst
                stream.forEach(procesor);   // konzumirati... terminirajuća operacija

    }
   // private static <T> void printElements(List<T> elements, Testable<T>tester ){
     //   for(T element : elements){
       //     if(tester.test(element));
         //   System.out.println(element);
        //}

    //}

    private static void printPeople(List<Person> personList, PersonTester personTester){
        for(Person person : personList){
            if(personTester.test(person)){
             System.out.println(person);
            }

        }
    }

  // private static void printPersons(List<Person> personList) {
    //    for (Person person : personList) {
      //      System.out.println(person);
        //}

    //}

    //private static void printPersonsOlderThan(List<Person> personList, int age) {
      //  for (Person person : personList) {
        //    if (person.getAge() >= age) {
          //      System.out.println(person);
            //}

        //}

    //}

    //private static void printPersonsWithGender(List<Person> personList, Gender gender) {
      //  for (Person person : personList) {
        //    if (person.getGender().equals(gender)) {
          //      System.out.println(person);
            //}

        //}
    //}
    //private static void printPersonWithinAges(List<Person> personList, int min, int max) {
      //  for (Person person : personList) {
        //if(age >= min && age <= max)
            //System.out.println(person);
        }



