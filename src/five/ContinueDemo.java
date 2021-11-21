package five;

import java.util.Scanner;

public class ContinueDemo {
    public static void main(String[] args) {
        System.out.println("Unesi neki tekst : ");
        String text = new Scanner(System.in).nextLine();
        char[] nizSlova = text.toCharArray();
        char slovo = 'p';
        int brojačP = 0;
        for(int i = 0 ; i<nizSlova.length;i++){
            char  slovoNiza = nizSlova[i];
           if(slovo != slovoNiza){
               continue;
           }
            System.out.println("Nadjoh opet p...");
           brojačP++;
        }
        System.out.println("Slovo p se ponavlja " + brojačP + " puta " );
    }
}
