package loop;

/**
 *
 */
public class DoWhileDemo {
    public static void main(String[] args) {
        int number = 1; // 1.pocetni uslov petlje
        do {
            System.out.println("Broj je: " + number);
            number++; // 2. korak petlje ili inkrement
        } while (number <= 10); // 3.Uslov petlje
    }
}
