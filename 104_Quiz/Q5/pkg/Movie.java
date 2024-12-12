package pkg;

public class Movie{
    
    String movieName;
    double rating;
    int numRating;
    int revenue;
    
    public Movie() {
        movieName = "Avengers";
        rating = 8.0;
        numRating = 33;
        revenue = 623357910;
    }
    public Movie(String movieName, double rating, int numRating, int revenue){
        this.movieName = movieName;
        this.rating = rating;
        this.numRating = numRating;
        this.revenue = revenue;
    }
    public void movieToString() {
        System.out.println("Movie: " + this.movieName);
        System.out.println("Rating: " + this.rating);
        System.out.println("Numbers of Rating: " + this.numRating);
        System.out.println("Revenue: " + this.revenue);
        System.out.println();
    }
    public String getMovieName() {
        return this.movieName;
    }
    public int getRevenue() {
        return this.revenue;
    }
    public double getRating() {
        return this.rating;
    }
    public double addRating(double addRating){
        double x = (addRating * numRating + addRating) / (numRating + 1);
        return x;
    }
    public boolean compareRating() {
        return ( > );
    }
}
