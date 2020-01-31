import java.util.*;
import java.util.Random;

public class ArrayListProssessing
{
    public static void main(String[] args)
    {
        ArrayList<String> sports = new ArrayList<String>();
        sports.add("Softball");
        sports.add("Soccer");
        sports.add("Basketball");
        sports.add("Tennis");
        sports.add("Soccer");
        sports.add("Skiing");
        sports.add("Baseball");
        
        System.out.println("");
        System.out.println("");
        System.out.println("Number 3");
        System.out.println("");
        insertElement(sports, "Football");
        System.out.println("");
        System.out.println("");
        System.out.println("Number 3");
        System.out.println("");
        System.out.println(returnElement(sports,3));
        System.out.println("");
        System.out.println("Number 4");
        System.out.println("");
        removeThirdElement(sports);
        System.out.println("");
        System.out.println("");
        System.out.println("Number 5");
        System.out.println("");
        searchForElement(sports, "Soccer");
        System.out.println("");
        System.out.println("");
        System.out.println("Number 6");
        System.out.println("");
        searchAndCountElement(sports, "Soccer");
        System.out.println("");
        System.out.println("");
        System.out.println("Number 7");
        System.out.println("");
        copyAndReturnList(sports);
        System.out.println("");
        System.out.println("");
        System.out.println("Number 8");
        System.out.println("");
        
        
        
    }
    
    public static void printArray(ArrayList<String> s)
    {
        for(int i = 0; i< s.size(); i++)
        {
            System.out.println(s.get(i));
        }
    
    }
    //Number 2
    public static void insertElement(ArrayList<String> s, String Sport)
    {   
        s.add(Sport);
        printArray(s);
        
    }
    
    // Number 3
    public static String returnElement(ArrayList<String> inList, int i)
    {   
        return inList.get(i);
    }
    
    //Number 4
    public static String removeThirdElement(ArrayList<String> s)
    {   
        s.remove(3);
        for(int i=0; i< s.size() ; i++){
            System.out.println(s.get(i));
        }
        return "";
    }
    
    //Number 5
    public static int searchForElement(ArrayList<String> s, String a)
    {   
        
        for(int i = 0; i< s.size(); i++)
        {
            if (s.get(i) == a){
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }
    
    //Number 6
    public static String searchAndCountElement(ArrayList<String> s, String a)
    {   
        int count = 0;
        for(int i = 0; i< s.size(); i++)
        {
            if (s.get(i) == a){
                count +=1;
            }
        }
        System.out.println(count);
        return "";
    }
    
    //Number 7 
    public static ArrayList<String> copyAndReturnList(ArrayList<String> s)
    {
        ArrayList<String> n = new ArrayList<>();
        for(int i = 0; i<s.size(); i++)
        {
            n.add(s.get(i));
        
        }
        printArray(n);
        return n;
    
    }
    
    //Number 8
    public static ArrayList<String> shuffleElements(ArrayList<String> s)
    {
        for(int i = 0; i< s.size(); i++)
        {
            
        
        }
        return s;
        
    
    
    }
}
