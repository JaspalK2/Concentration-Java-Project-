/*
 * Activity 3.8.2
 */
public class Traversing2DArrays
{
  public static void main(String[] args)
  {
   String board[][] = { {"close", "quarter"},
                        {"moon", "rock"},
                        {"band", "stand"},
                        {"out", "shine"} }; 
                       
    /* your code here */
    for (String[] row: board){
        for (String str : row)
        System.out.print(str + "\t");
    }
    System.out.println("rows in board: " + board.length);
    System.out.println("columns in board: " + board[0].length);
    for(int i = 0;  i< board[0].length;i++){
        for(int z = 0; z <board.length; z++){
            System.out.print(board[z][i] + "\t");
        }
    }
  }
  
}
