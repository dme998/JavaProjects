
public class ChainCode {

	public static void main(String[] args) {
		
		final int ROWS = 7;
		final int COLS = 8;
		
		boolean[][] image1 = new boolean[][] {
			{ false, true , false, false, false, false, false, false },
			{ false, true , false, false, false, true , false, false },
			{ false, true , true , true , false, false, true , false },
			{ false, false, false, true , true , false, false, true  },
			{ false, false, false, false, true , false, false, true  },
			{ false, false, false, false, false, true , false, false },
			{ false, false, false, false, false, false, true , false }
		};
		//java.util.Arrays.fill(image1[0], false);
		//java.util.Arrays.fill(image1[1], false);
		
		boolean[][] image2 = new boolean[][] {
			{ false, false , false, false, false, false, false, false },
			{ false, false , false, false, false, false, false, false },
			{ false, false , false, false, false, false, false, false },
			{ false, false , false, false, false, false, false, false },
			{ false, false , false, false, false, false, false, false },
			{ false, false , false, false, false, false, false, false },
			{ false, false , false, false, false, false, false, false }
		};
		//java.util.Arrays.fill(image2[0], false);
		//java.util.Arrays.fill(image2[1], false);

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
}
