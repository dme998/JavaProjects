/* Daniel Eggers
 * CMPSCI-2261-E01-SP2018
 * Chocolates Assignment 
 */

public class ArrayofChocolates {

    public static void main(String[] args) {
        /* create 2-Dimensional array */
        int[][] arr = {{0,0,0,0,0, 0,0},
                       {0,6,8,9,7, 4,0},
                       {0,0,0,8,0, 5,0},
                       {0,5,7,4,5,10,0},
                       {0,4,2,0,6, 9,0},
                       {0,0,0,0,0, 0,0}};
        
        int eatCount = 0;  //number of chocolates 'eaten'
        int childrow = 2;  //child grid location row
        int childcol = 3;  //child grid location column
        int r = 2;         //grid location to test (row)
        int c = 3;         //grid location to test (column)
        boolean isAwake = true;  //is the child awake? (use for do-while loop)
        
        
        do {
           eatCount += arr[childrow][childcol];  //child eats chocolate at current position
           println("The total eat count is " + eatCount + ": ");
           arr[childrow][childcol] = 0;  //set current position to zero chocolates
           
           /* print 2d-array */
           for(int i=0; i<6; i++) {
               for (int j=0; j<7; j++) {
                   if (childrow == i && childcol == j)
                       System.out.print(arr[i][j] + "* ");
                   else
                       System.out.print(arr[i][j] + "  ");
               }
               println("");
           }
           
           r = childrow;  //row coordinate to test
           c = childcol;  //column coordinate to test
           
           if (arr[r][c-1] > arr[r-1][c]  &&  arr[r][c-1] > arr[r][c+1]  &&  arr[r][c-1] > arr[r+1][c]) {
               //Tested if L>U && L>R && L>D:  Pass.  Move left.
               childcol -= 1;
             }
             else if (arr[r-1][c] > arr[r][c+1]  &&  arr[r-1][c] > arr[r+1][c]) {
               //Tested if U>R && U>D:  Pass.  Move Up.
               childrow -= 1;
             }
               else if (arr[r][c+1] > arr[r+1][c]) {
                 //Tested if R>D:  Pass.  Move right.;
                 childcol += 1;
               }
                 else if (arr[r][c+1] > 0) {
                   //Test if D>0:  Pass.  Move down.
                   childcol += 1;
                 }
                   else {
                     isAwake = false;
                   }
           
           println("");
           
        }while (isAwake == true);
    }
    
    public static void println(String line) {
        System.out.println(line);
    }
}