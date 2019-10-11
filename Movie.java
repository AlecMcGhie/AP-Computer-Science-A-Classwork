

public class Movie
{
    //Instance variable are the adjectives to discribe the objest
    private String title;
    private String genre;
    private double lengthInMin;
    // constructure definition 
    public Movie(String titl, String gen, double len){
        title = titl;
        genre = gen;
        lengthInMin= len;
    }
    // Creating a method that can change the different variables
    public void setTitle(String t){
        title = t;
    }
    public String getTitle(){
        return title;
    }
    
    public void setGenre(String g){
        genre = g;
    }
    public String getGenre(){
        return title;
    }
    
    public void setlengthInMin(double l){
        lengthInMin = l;
     }
    public double getlenghtInMin(){
        return lengthInMin;
    }
}
