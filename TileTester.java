
/*
 * Activity 3.8.1
 */

public class TileTester
{
  private static String[] tileValues =
  { "lion", "lion", "penguin", "penguin","dolphin", "dolphin","fox", "fox", "monkey", "monkey","turtle", "turtle" }; 

  public static void main(String[] args)
  {
    
    /* your code here */
  Tile[][] gameBoard = new Tile[3][4];
  /**
   *     c1    c2   c3    c4
   * r1
   * r2
   * r3
   */
  int iterateY = 0;
  for(int i =0;i <= 2; i++){
    for(int z = 0; z<=3;z++){
        gameBoard[i][z] = new Tile(tileValues[iterateY]);
        iterateY++;
    }
  }
/*
  System.out.println(java.util.Arrays.toString(gameBoard[0]));
  System.out.println(java.util.Arrays.toString(gameBoard[1]));
  System.out.println(java.util.Arrays.toString(gameBoard[2]));*/
  /*
  How are 2D arrays and 1D arrays related?
    2D arrays are really just 1D arrays in side of 1D arrays, so in other words, 2d Arrays are just nested 1d arrays
  Describe the rows and columns of a 2D array in terms of outer and inner arrays, including the outer and inner array lengths.
   when you set the first [] of a 2d array, you are setting the outer arrays, or the rows of the 2d array. The second [] stores the length of each individual row of arrays, or in other words it is the inner array of each outer array. 
   
  */

  
   
    
  }
}
