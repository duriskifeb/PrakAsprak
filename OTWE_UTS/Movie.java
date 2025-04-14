package OTWE_UTS;

public class Movie {
    private String title, director, genre;

    public Movie(String title, String director, String genre){
        this.title = title;
        this.director = director;
        this.genre = genre;
    }

    public String toString() {
        return "Judul : " + title + "Director : " + director + "Genre : " + genre; 
    }

    
}
