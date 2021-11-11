package three;
import java.util.Scanner;

/**
 * USLOVNI OPERATORI:
 */
public class ConditionalDemo {
    public static void main(String[] args) {
        int number1 = new Scanner(System.in).nextInt();
        int number2 = new Scanner(System.in).nextInt();
        if ((number2++ == 1) && (number1 == 23)) {
            System.out.println("Unio si za pvi broj vrijednost 23 a za drugi broj 1");
        }
        if ((number1 == 1) || (number2++ == 23)) ;
        {
            System.out.println("Broj2: " + number2); //Trebalo bi ispisat 3
        }
    }
}

