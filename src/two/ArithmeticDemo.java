package two;

/**
 * Operatiori:
 * 1. dodjele
 * 2. aritmetički operatori(+, - , * , /
 * 3. unarni operatori
 *
 */
public class ArithmeticDemo {
    public static void main(String[] args) {
        int broj1 = 23;
        int broj2 = 13;
        int result = broj1 + broj2;
        System.out.println("Suma:"+ result);
        //subtraction
        result = result - 3;
        System.out.println("Oduzimanje:"+ result);
        // multiplication
        result = result*2;
        System.out.println("MNOZENJE:"+ result);
        //division
        result = result/3;
        System.out.println("Djeljenje:"+ result);
        //MODULO 22/3= 7 ostatak 1
        result = result % 7;
        System.out.println("Modulo result:"+ result);








    }
}
