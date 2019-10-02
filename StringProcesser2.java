
/**
 * Write a description of class StringProcesser here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringProcesser2
{
    public static String withoutEnds(String str)
    {
        return str.substring(1,str.length()-1);
    }
    public static String front2(String str)
    {
       return (str.substring(str.length()-2,str.length())+ str.substring(0,str.length()-2));
    
    }
    public static String firstFour(String str)
    {
        if (str.length()>=4){
            return str.substring(0,4);
        }
        else{
            int numAdd = (4-str.length());
            if (numAdd == 1){
                return str + "#";
            }
            else if (numAdd == 2){
                return str + "##";
            }
            else if (numAdd == 3){
                return str + "###";
            }
            else {
                return "####";
            }
        }
    }
    public static boolean frontAgain(String str)
    {
        if (str.substring(0,2).equals(str.substring(str.length()-2, str.length())) )
        {
            return true;
        }
        else
        {
            return false;
        }
    
    }
    //public static boolean passwordTest(String username,String str)
    {
        
    }
}
