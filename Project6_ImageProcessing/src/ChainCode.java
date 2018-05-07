
public class ChainCode {

	public static void main(String[] args) {
		
		boolean[][] binImage1 = new boolean[][] {
			{ false, false, false, false, false, false, false, false, false },
			{ false, true , false, false, false, false, false, false, false },
			{ false, true , false, false, false, true , false, false, false },
			{ false, true , true , true , false, false, true , false, false },
			{ false, false, false, true , true , false, false, true , false },
			{ false, false, false, false, true , false, false, true , false },
			{ false, false, false, false, false, true , false, false, false },
			{ false, false, false, false, false, false, true , false, false },
			{ false, false, false, false, false, false, false, false, false }
		};
		//java.util.Arrays.fill(image1[0], false);
		//java.util.Arrays.fill(image1[1], false);
		
		
		boolean[][] binImage2 = new boolean[][] {
			{ false, false , false, false, false, false, false, false, false },
			{ false, true  , true , true , true , false, true , false, false },
			{ false, false , false, false, true , false, true , false, false },
			{ false, false , true , true , true , false, true , false, false },
			{ false, false , true , false, false, false, true , false, false },
			{ false, false , true , false, false, false, true , false, false },
			{ false, false , false, false, false, false, true , true , false },
			{ false, false , false, false, false, false, false, false, false }
		};
		//java.util.Arrays.fill(image2[0], false);
		//java.util.Arrays.fill(image2[1], false);
		
		System.out.println("Image 1: ");
		Chain(binImage1, 1, 1);
		Chain(binImage1, 2, 5);

		System.out.println("\nImage 2: ");		
		Chain(binImage2, 1, 1);
		Chain(binImage2, 1, 6);
	}
	
	
	public static void printArray(boolean[][] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println("\n");
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
		System.out.println();
	}
	
	public static void Chain(boolean[][] arr, int startRow, int startCol) {
		int r = startRow;
		int c = startCol;
		boolean isLoop = true;
		
		do {
			/* Test Cardinal Directions */
			if (arr[r][c+1] == true) {	//Test Right
				arr[r][c] = false;
				System.out.print("0");
				c++;
			}
			else if (arr[r+1][c] == true) {	//Test Down
				arr[r][c] = false;
				System.out.print("6");
				r++;
			}
			else if (arr[r][c-1] == true) {	//Test Left
				arr[r][c] = false;
				System.out.print("4");
				--c;
			}
			else if (arr[r-1][c] == true) {	//Test Up
				arr[r][c] = false;
				System.out.print("2");
				--r;
			}
			
			/* Test Diagonal Directions */
			else if (arr[r-1][c+1] == true) {	//Test Up-Right
				arr[r][c] = false;
				System.out.print("1");
				--r;
				c++;
			}
			else if (arr[r-1][c-1] == true) {	//Test Up-Left
				arr[r][c] = false;
				System.out.print("3");
				--r;
				--c;
				
			}
			else if (arr[r+1][c-1] == true) {	//Test Down-Left
				arr[r][c] = false;
				System.out.print("5");
				r++;
				--c;
			}
			else if (arr[r+1][c+1] == true) {	//Test Down-Right
				arr[r][c] = false;
				System.out.print("7");
				r++;
				c++;
			}
			else {
				isLoop = false;
			}
			System.out.print(" ");
		}while(isLoop);
		System.out.println();
	}
	
}


/* Freeman Chain Code:
 * >v  7
 * vv  6
 * v<  5
 * <<  4
 * <^  3
 * ^^  2
 * ^>  1
 * >>  0
 */
