package five;

/**Klasa outer -> public i paketna vidljivost
 *1. atribute ili polja ili properties
 * 2. konstruktor
 * 3. funkcije ili metode
 *
 *
 *Modifiktor vidljivosti
 * 1.public
 * 2. private
 * 3.protected
 * 4.bez ključne rijeci-paketna vidljivost
 */

 public class Person {
    public String name;
    public String surname;
    public int age;


    public Person(){
        System.out.println("Konstruisana instanca....");
    }
}
