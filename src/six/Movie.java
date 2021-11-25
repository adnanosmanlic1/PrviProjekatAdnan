package six;

/**
 * Klasa moze imati:
 * <li> 1.polja ili atribute
 *        1.1 nestatička....  movie1,movie2.... instnce ili varijable ili primjerke
 *        1.2 statička polja
 *        </li>
 *        <li> 2. konstruktor -> instancni ili objekti
 *        </li>
 *        <li>3.funkcije ili metode
 *        3.1  instancne
 *        3.2 statičke
 *        </li>
 *        <li>4. inner klase
 *        </li>
 */
public class Movie {
    private static int counter = 0;
    private String title;
    private String director;
    //1-10
    private int review;

    public Movie(String invisible_guest, String pedro, String s){
        System.out.println("Konstruktor se pozvao ...");
        counter++;
    }

    public Movie(String title, String director){
        this.title = title;
        this.director = director;
    }

    public Movie(String title, int review){
        this.title = title;
        this.review = review;
    }
    public Movie(int review, String director){
        this.director = director;
        this.review = review;
    }
    public Movie (String title, String director , int review){
        this.title = title;
        this.director = director;
        this.review = review;
    }

    public Movie(String title){
        this.title = title;
        System.out.println("Konstruktor sa jednim parapetrom se pozvao");
        counter++;
    }
    public int getReview(){
        return review;
    }

    public void setReview(int review) {
        if(review>=1 && review<= 10) {
            this.review = review;
        }
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public static void print(){
        System.out.println("Counter: " + counter);
    }
}
