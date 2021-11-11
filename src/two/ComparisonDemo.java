package two;

import java.util.Scanner;

public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Unesi broj1:");
        int broj1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi boroj2");
        int broj2 = new Scanner(System.in).nextInt();

        // == operator poređenja
        if(broj1 == broj2){
            System.out.println("Isti su brojevi");
        }else{
            System.out.println("Različiti su ");
        }
    }
}
