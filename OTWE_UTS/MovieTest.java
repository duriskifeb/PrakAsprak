package OTWE_UTS;

public class MovieTest {
    public static void main(String[] args) {
        SfMovie movie1 = new SfMovie("Avatar", "James Cameron");
        SfMovie movie2 = new SfMovie("Avatar", "James Cameron");

        System.out.println(movie1.toString());
        System.out.println(movie2.toString());
    }
}