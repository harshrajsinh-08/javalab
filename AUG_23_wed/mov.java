package AUG_23_wed;
import java.util.ArrayList;

class Movie {
    private String title;
    private String director;
    private ArrayList<String> actors;
    private ArrayList<String> reviews;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
        this.actors = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public void addActor(String actor) {
        actors.add(actor);
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    public ArrayList<String> getActors() {
        return actors;
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }
}

public class mov {
    public static void main(String[] args) {
        Movie movie = new Movie("Inception", "Christopher Nolan");
        movie.addActor("Leonardo DiCaprio");
        movie.addActor("Joseph Gordon-Levitt");

        movie.addReview("Fantastic movie! Mind-bending plot.");
        movie.addReview("A masterpiece of cinematography.");

        System.out.println("Movie Information:");
        System.out.println("Title: " + movie.getTitle());
        System.out.println("Director: " + movie.getDirector());
        System.out.println("Actors: " + movie.getActors());
        System.out.println("Reviews: " + movie.getReviews());
    }
}
