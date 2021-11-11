package two;

/** Unarni operatori:
 * 1. +
 * 2. -
 * 3. ++; pre and post
 * 4. -- ; pre and post
 * 5. operator negacije(!)
 *
 *
 */

public class UnaryDemo {
    public static void main(String[] args) {
        int broj1 = +23;
        System.out.println("Broj1 sa + :" + broj1);
        broj1 = -broj1;
        System.out.println("Broj1 sa - :" + broj1);
        broj1 = 23;
        broj1++; // broj1 = broj1 + 1
        System.out.println("POST INCREMENT: " + broj1);
        broj1 = 23;
        ++broj1;
        System.out.println("PRE INCREMENT:" + broj1);
        //
        broj1 = 23;
        System.out.println(broj1++);//23; korak jedan posalji u konzolu ... 2. korak = uvećaj ga za 1
        System.out.println(broj1);//24;
        //
        broj1 = 23;
        System.out.println(++broj1);// 24 ; uvećaj za 1 i takav salji u konzolu
        System.out.println(broj1);

        //POST DECREMENT
        broj1 = 23;
        System.out.println(broj1--);
        System.out.println(broj1);

        broj1 = 23;
        System.out.println(--broj1);
        System.out.println(broj1);
        boolean lav = false;
        System.out.println(!lav);


    }
}
