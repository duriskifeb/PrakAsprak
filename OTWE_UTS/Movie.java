package OTWE_UTS;

public class Movie {
    private String title, director, genre;

    public Movie(String title, String director, String genre){
        this.title = title;
        this.director = director;
        this.genre = genre;
    }

    // ada hal menarik mengenai kenapa toString itu penting, karena karena kita bermain dnegan object agar data kita kita kelihatan harus pakek toString kalo tidak ya udah akan tampil
    public String toString() {
        return "Judul : " + title + " Director : " + director + " Genre : " + genre; 
    }
}
