package three;

import java.util.Scanner;

/**
 * switchs - case- break
 */

public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("Unesi broj dana u sedmici");
        int brojDanaUSedmici = new Scanner(System.in).nextInt();

            switch (brojDanaUSedmici) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3 :
                    System.out.println("Wednsday");
                    break;
                case 4 :
                    System.out.println("Thursday");
                    break;
                case 5 :
                    System.out.println("Friday");
                    break;
                case 6 :
                    System.out.println("Saturday");
                    break;
                case 7 :
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Netačan broj dana u sedmici");
            }


        }
    }

