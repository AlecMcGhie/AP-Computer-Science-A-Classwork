import java.util.Scanner;
public class Classwork5

{
    public static void main(String[]args)
    {   
        Scanner scan = new Scanner(System.in);
        
        double count1 = 0;
        double count2 = 0;
        double count3 = 0;
        double count4 = 0;
        double count5 = 0;
        double count6 = 0;
        double rolls = 0;
        
        for(int i = 0; i < 500; i +=1)// First section start of i, Second section the amount of tinmes (50 times), third section for the incresing denomination
        {
            double randNum= Math.random()*6;// Math random method selects a number 0 - .99999
            double finalNum = Math.round(randNum);
            if(finalNum == 1.0)
            {
                count1 ++;
                
            }
            else if(finalNum == 2.0)
            {
                count2 ++;
                
                
            }
            else if(finalNum == 3.)
            {
                count3 ++;
                
                
            }
            else if(finalNum == 4.)
            {
                count4 ++;
                
            }
            else if(finalNum == 5.)
            {
                count5 ++;
                
            }
            else if(finalNum == 6.)
            {
                count6 ++;
                
            }
            else
            {
                System.out.println("6.0");
                count6 ++;
            }
            rolls ++;
            System.out.println(finalNum);
        }
        System.out.println("You rolled "+ rolls+ " rolls");
        System.out.println("You rolled "+count1+ " Ones");
        System.out.println("You rolled "+count2+ " Twos");
        System.out.println("You rolled "+count3+ " Threes");
        System.out.println("You rolled "+count4+ " Fours");
        System.out.println("You rolled "+count5+ " Fives");
        System.out.println("You rolled "+count6+ " Sixes");
        
        System.out.println("Do you want to play a game?");
        
        String yesOrNo = scan.nextLine(); //How you get the term name
        
        
        
        if (yesOrNo.equals ("Yes")||(yesOrNo.equals("yes")||(yesOrNo.equals ("Yep")||(yesOrNo.equals ("yep")) )))
        {
            System.out.println("Cool");
            double dice1 = Math.round(Math.random()*6);
            double dice2 = Math.round(Math.random()*6);
            double sum = dice1+dice2;
            if (sum == 7)
            {
                System.out.println("Your total was " + sum);
                System.out.println("Yay You WIN!");
            }
            else if (sum ==11)
            {
                System.out.println("Your total was " + sum);
                System.out.println("Yay You WIN!");
            }
            else if (sum ==2)
            {
                System.out.println("Your total was " + sum);
                System.out.println("Yay You WIN!");
            }
            else if (sum ==3)
            {
                System.out.println("Your total was " + sum);
                System.out.println("Yay You WIN!");
            }
            else if (sum ==5)
            {
                System.out.println("Your total was " + sum);
                System.out.println("Yay You WIN!");
            }
            
            
            else {
                System.out.println("Your total was " + sum);
                System.out.println("Keep Playing");
            }
            
        }
        else if (yesOrNo.equals ("No")||(yesOrNo.equals("no")))
        {
            System.out.println("okay then have a great day");
            
            
        
        }
        else 
        {
            System.out.print("ERROR");
        }
    }
}
