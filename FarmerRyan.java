import java.util.*;
public class FarmerRyan
{
    public static void main(String[]args){
        String manybeans = ("23 43 53 64 75 876");
        beans(manybeans);
        
    }
    
    // Scan through the string 6 times to find the " "
    public static String beans(String binb){
        int[] board = {0,0,0,0,0,0,0};
        int sum = 0;
        for(int i = 1; i< 6; i++){
            board[i] = binb.indexOf(" ");
        }
        for(int j = 0; j<6; j++)
        {
            String number = binb.substring(board[j],board[j+1]);
            int result = Integer.parseInt(number);
            sum+= result;
            
        }
        String statement = ("Ryan has to plant" + sum + "Beans");
        return statement;
        
        /*
         * String number = "10";
         * int result = Integer.parseInt(number);
         */
    }
}
