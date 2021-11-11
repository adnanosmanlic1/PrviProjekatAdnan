package three;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        char slovo = 'a';
        //dugi pristup
        char[] slova = {'d', 'e', 'c' , 'o', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
        char[] odredisniNiz = new char[7];
        System.arraycopy(slova, 2, odredisniNiz,0, odredisniNiz.length);
        String text = new String(odredisniNiz);
        System.out.println(text);
    }
}
