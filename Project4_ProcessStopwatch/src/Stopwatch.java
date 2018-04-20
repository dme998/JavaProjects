/* Daniel Eggers
 * Project4: Working with Timers
 * CMPSCI-2261-E01
 * April 15, 2018
*/
public class Stopwatch {

	private long startClock;
	private long endClock;
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Declaring a new array of integers.");
		int arr[] = new int[10000];
		fillArray(arr);
		System.out.println("Creating new object s1 of class Stopwatch.");
		Stopwatch s1 = new Stopwatch();  //call default constructor
	    
		System.out.println("Starting stopwatch.");
		s1.start_timer();
		bubbleSort(arr);
		//printArray(arr);
		System.out.println("Stopping stopwatch.");
		s1.end_timer();
		
		System.out.println("Time elapsed: " + s1.get_elapsed() + " milliseconds.");
	}
	
	public static void fillArray(int[] arr) {
		System.out.println("Randomizing array elements.");
		for(int i = 0; i < arr.length; i++)
			arr[i] = (int)(Math.random() * 10);
	}
	
	public static void bubbleSort(int[] arr) {
		System.out.println("Performing bubble sort on array.");
		int tmp = 0;
		for(int i = 0; i < (arr.length - 1); i++) {
			for(int j = 0; j < (arr.length-1-i); j++) {
				if ( arr[j] > arr[j+1] ) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
	
	public static void printArray(int[] arr1) {
		System.out.print("Printing array.");
		for(int i=0; i<(arr1.length); i++) {
			if (i%50 == 0 && i != 0)  //perform line break every 50th iteration
				System.out.println(arr1[i]);
			else
				System.out.print(arr1[i] + " ");
		}
		System.out.println();
	}
	
	
	public Stopwatch() {
		//default constructor
	}
	
	
	/* Get and Set Methods */
	public long getStartClock() {
		return startClock;
	}
	public long getEndClock() {
		return endClock;
	}
	public void setStartClock(long sc) {
		startClock = sc;
	}
	public void setEndClock(long ec) {
		endClock = ec;
	}
	
	
	public void start_timer() {
		//reset startClock to current time
		setStartClock( System.currentTimeMillis() );
	}
	public void end_timer() {
		//set Endclock to current time
		setEndClock( System.currentTimeMillis() );
	}
	public long get_elapsed() {
		//return the elapsed time in ms
		return ( endClock - startClock );
	}
}
