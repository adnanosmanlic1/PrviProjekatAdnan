package six;

/**
 * MODIFIKTORI VIDLJIVOSTI
 * <li>1.public</li>
 * <li>2.paketno privatni</li>
 * <li>3. protected</li>
 * <li>4. private</li>
 *
 *OUTER -> PUBLIC,PAKETNO PRIVATNA
 * <P>
 *     Klasa moze imati:
 *     <li>1.polja,properties,attributes ili member varijable</li>
 *
 * </P>
 */



public class SixDemo {
    public static void main(String[] args) {

        Movie movie1 = new Movie("Invisible guest", "Pedro", "10");
        movie1.setDirector("Tarantino");
        movie1.setTitle("Django");
        movie1.setReview(9);

        System.out.println(movie1.getDirector());//Tarantino
        Movie.print();// 1

        int review1 = movie1.getReview();

        Movie movie2 = new Movie("Invisible guest", "Pedro", "10");
        movie2.setDirector("Steven Spilberg");
        movie2.setTitle("E.T.");
        movie2.setReview(88) ;

        System.out.println(movie2.getDirector());//Steven Spilberg
        Movie.print();//2
        movie2.print();


      Movie movie3 = new Movie("Nicija zemlja");
        System.out.println(movie3.getTitle());//Nicija zemlja

        Movie movie = new Movie("Invisible guest","Pedro","10");






    }

}
