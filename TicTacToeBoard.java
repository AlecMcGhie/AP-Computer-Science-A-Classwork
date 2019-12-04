
/**
 * Write a description of class TicTacToeBoard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicTacToeBoard
{
    private String[][] board = new String[3][3];
    
    public TicTacToeBoard(){
        board[0][0] = "1";
        board[0][1] = "2";
        board[0][2] = "3";
        board[1][0] = "4";
        board[1][1] = "5";
        board[1][2] = "6";
        board[2][0] = "7";
        board[2][1] = "8";
        board[2][2] = "9";
    }
    public void enterX(int pos){
        if (pos == 1)
            board[0][0] = "X";
        else if (pos == 2)
            board [0][1] = "X";
        else if (pos == 3)
            board [0][2] = "X";
        else if (pos == 4)
            board [1][0] = "X";
        else if (pos == 5)
            board [1][1] = "X";
        else if (pos == 6)
            board [1][2] = "X";
        else if (pos == 7)
            board [2][0] = "X";
        else if (pos == 8)
            board [2][1] = "X";
        else if (pos == 9)
            board [2][2] = "X";
    }
    public void enterO(int pos){
        int count = 1;
        for(int i = 0;i <3;i++){
            for(int j =0;j<3;j++){
                if (count == pos){
                    board[i][j] = "O";
                count++;
                }
            }
        }
        
    
    
    
    }
    public boolean checkRowsForWinner(){
        if (board[0][0].equals("O")&& board[0][1].equals("O")&&board[0][2].equals("O")){
            return true;
        }
        
        for(int i = 0;i <3;i++){
            int count = 0;
            int count1 = 0;
            for(int j =0;j<3;j++){
                if(board[i][j].equals("X")){
                   count++;
                }
                else if(board[i][j].equals("O")){
                    count1++;
                }
                }
            // this is the bottom of the column
            if (count== 3)
                return true;
            else if (count1== 3)
                return true;
            }
            return false;
          }
        public boolean checkForDiagnols(){
             if (board[0][0].equals("O")&& board[1][1].equals("O")&&board[2][2].equals("O")){
                return true;
                }
             else if (board[0][0].equals("X")&& board[1][1].equals("X")&&board[2][2].equals("X")){
                return true;
                }  
             else if (board[0][2].equals("O")&& board[1][1].equals("O")&&board[2][0].equals("O")){
                return true;
                }
             else if (board[0][2].equals("X")&& board[1][1].equals("X")&&board[2][0].equals("X")){
                return true;
                } 
             return false;

          }
        public String createWinner(){
            for(int j =0;j<3;j++){
                for(int i = 0;i<3; i++){
                    board[i][j] = "O";
                    
                }
                }
            return "Done";
        }
        public String toString(){
            String s= "";
            for(int i =0; i<3; i++){
                for(int j =0;j<3;j++)
                    s+= board[i][j]+ "";
                s+= "\n";
                
            }
            return s;
        
        
        }
}
