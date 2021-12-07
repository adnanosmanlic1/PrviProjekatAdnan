package eight.collection;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        PrintStream out = System.out;

        Scanner scanner = new Scanner(inputStream);
        out.println("Unesi prvi broj: ");
        int number1 = scanner.nextInt();
        out.println("Unesi drugi broj: ");
        int number2 = scanner.nextInt();

    }
}
