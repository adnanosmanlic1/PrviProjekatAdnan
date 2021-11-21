package five;

public class ContinueWithLabelDemo {
    public static void main(String[] args) {
        String recenica = "Pronađi mene ti";
        String rijec = "men";
       // char[] recenicaNiz = recenica.toCharArray();
       // char[] rijecNiz = rijec.toCharArray();
        int max = recenica.length() - rijec.length();

        boolean foundIt = false;
        NASA: for(int i = 0; i<=max;i++){

            for(int j=0; j<rijec.length();j++){
                char slovoRecenica = recenica.charAt(i+j);
                char slovoRijec = rijec.charAt(j);
                if(slovoRecenica != slovoRijec){
                 continue NASA;
                }

            }
            foundIt = true;
            break ;
        }

    }
}
