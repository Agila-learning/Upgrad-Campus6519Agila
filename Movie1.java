
abstract class Movie {
    abstract void display();
}


class Outcome extends Movie {
    void display() {
        System.out.println("Outcome Display Method");
        
    }
}
class MyMovie extends Movie {
    
    String movieTitle;
     String director;
     int budget;

    MyMovie(String movieTitle, String director, int budget) {
        this.movieTitle = movieTitle;
        this.director = director;
        this.budget = budget;
    }

    void display() {
        System.out.println("Movietitle " + movieTitle);
        System.out.println("Director " + director);
        System.out.println("Budget " + budget);
    }
}

public class Movie1 {
    public static void main(String[] args) {
        MyMovie myMovie = new MyMovie("Lithophile", "Agila", 2300000);
        myMovie.display();
        Outcome outcome = new Outcome();
        outcome.display();
        System.out.println("Assignment on Abstraction Completed");
    }
}




