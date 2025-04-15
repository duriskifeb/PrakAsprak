package OTWE_UTS;

public class MovieTest {
    public static void main(String[] args) {

        //ini buat array of object kang!
        //dan ternyata SfMovie itu array yang breisi objeck
        SfMovie[] sfMovies = {
            new SfMovie("Avatar,", "james caron"),
            new SfMovie("AI,", "Steven Spielberg")
        };

        for(int inx = 0; inx < sfMovies.length; inx++) {
            System.out.println(sfMovies[inx]); 
            //ada hal menarik mengenai print! mengenai objeck .toString()
        }
    }
}