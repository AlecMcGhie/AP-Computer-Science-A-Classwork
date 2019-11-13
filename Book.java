

public class Book
{
    private String title;
    private String name;
    private int pages;
    public Book (String t, String n, int p){
        title = t;
        name = n;
        pages = p;
    }
    public void setTitle(String t){
        title = t;
    }
    public void setName(String n){
        name = n;
    }
    public void setPages(int p){
        pages = p;
    }
    public String getTitle()
    {
        return title;
    }
    public String getName()
    {
        return name;
    }
    public int getPages()
    {
        return pages;
    }
    public String toString()
    {
        String bookData = "Title: "+ title;
        bookData+="Author: "+ name;
        bookData+="Pages: "+ pages;
        return bookData;
        
    }
    
}
