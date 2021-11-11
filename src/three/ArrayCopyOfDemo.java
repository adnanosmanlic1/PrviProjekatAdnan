package three;

import java.util.Arrays;

public class ArrayCopyOfDemo {
    public static void main(String[] args) {
        char[] slova = {'d', 'e', 'c' , 'o', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};

        char[] odredisniNiz = Arrays.copyOfRange(slova, 2,9);
        System.out.println(new String(odredisniNiz));
    }
}
