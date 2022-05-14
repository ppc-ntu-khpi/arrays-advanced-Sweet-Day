import java.util.Arrays;

/**
 * 
 * @author Vika
 * 
 */

public class Main {
    
 /**
  * creating and displaying a random matrix
  * @param args 
  */
  public static void main(String[] args) {
        int n = 3;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Column with max sum: " + (getColumnIndexMax(array)+1));
        
    }
 
  /**
   * Gets the column index max
   * @param array
   * @return index
   */
    private static int getColumnIndexMax(int[][] array) {
        int sum = 0;
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            int currentColumn = 0;
            for (int i = 0; i < array.length; i++) {
                currentColumn += array[i][j];
            }
            if (sum == 0) {
                sum = currentColumn;
                index = j;
            } else {
                if (sum < currentColumn) {
                    sum = currentColumn;
                    index = j;
                }
            }
 
        }
        return index;
    }
}
