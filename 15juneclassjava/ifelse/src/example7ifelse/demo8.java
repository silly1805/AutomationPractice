package example7ifelse;

public class demo8 {

	public static void main(String[] args) {
		   int x = 1;
		    int y = 2;

		    System.out.println("Before swapping: x = " + x + " y = " + y);

		    // Use a temporary variable to store the value of x
		    int temp = x;
		    // Assign the value of y to x
		    x = y;
		    // Assign the value of the temporary variable (the original value of x) to y
		    y = temp;

		    System.out.println("After swapping: x = " + x + " y = " + y);

	}

}
