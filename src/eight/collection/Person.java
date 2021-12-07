package eight.collection;

import seven.Gender;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private Gender gender;
    private LocalDate birthday;

    public Person(String name, String surname, Gender gender, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        int age =  birthday.until(now).getYears();
        return age;
    }
    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Person)) {
            return false;
        }
            Person comparedPerson = (Person) obj;
        return name.equals(comparedPerson.getName())
                && surname.equals(comparedPerson.getSurname())
                && getAge() == comparedPerson.getAge()
                && gender.equals(comparedPerson.getGender());

    }
    @Override
    public int hashCode(){
        int hash = Objects.hash(name, surname, gender);
        return hash;
    }




    @Override
    public String toString(){
        return name + "  " +surname+ " , age: " + getAge()+", gender:" + gender;
    }

    @Override
    public int compareTo(Person o) {
        //-1 0 1
       // if(age > o.getAge()){
          //  return 1;
        //}
        //if(age< o.getAge()){
            //return -1;
        // }
        return 0;
    }
}
