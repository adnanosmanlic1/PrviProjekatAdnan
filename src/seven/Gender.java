package seven;

import java.lang.reflect.GenericArrayType;

/**
 * 1. polja
 * 2.konstuktor->*************KOD ENUMA NE MOŽE BITI PUBLIC, MORA BITI PRIVATE
 * 3. finkcije ili metode
 */
public enum Gender{

    FEMALE("Zenski", "Njezniji rod"),
    MALE("Muški","Grublji rod"),
    UNKNOWN("Nepznato","Nepoznat opis")
    ;
    private String name;
    private String description;

    private Gender(String n, String d){
        this.name = n;
        this.description = d;


    }
    public String getName(){
        return name;
    }
    public String getDescription() {
        return description;
    }
}
