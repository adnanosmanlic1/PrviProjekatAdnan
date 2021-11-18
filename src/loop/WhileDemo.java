package loop;

/** PETLJA - blok koda koji se izvršava sve dok je zadovoljen uslov petlje
/**  while(condition) {blok koda}
*/
public class WhileDemo {
    public static void main(String[] args) {
        int number = 1; // 1. početni uslovi definirni kroz vrijablu petlje
        while(number<= 10){  // 2. uslov petlje izveden kroz varijablu petlje
            System.out.println(number);
            number++;//3. korak petlje izveden kroz varijablu petlje

        }

    }
}
