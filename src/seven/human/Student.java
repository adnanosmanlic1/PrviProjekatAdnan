package seven.human;

import seven.Gender;
import seven.animal.Dog;

public class Student extends Person {

    private String brojIndexa;


    public Student(){
        super();
        System.out.println("Student...");
    }

    public String getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

}
