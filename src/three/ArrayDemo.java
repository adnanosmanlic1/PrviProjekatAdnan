package three;


import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        // TIP varijabla = vrijednost;
        int number1 = 23;
        //SLOZENI tip podatka
        //1. nacin konstrukcije niza
        //Shift + F6
        int[] brojevi = new int[3]; // heej zauzmi 3 puta po 32bita(radi se o nizu integer brojeva)
        System.out.println("Unesi prvi broj");
        brojevi[0] = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj");
        brojevi[1] = new Scanner(System.in).nextInt();
        System.out.println("unesi treći broj");
        brojevi[2] = new Scanner(System.in).nextInt();
        System.out.println(brojevi[0] + ", " + brojevi[1] + ", " + brojevi[2]);
    }
}


