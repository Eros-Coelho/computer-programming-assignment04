// Name: Eros Lima Coelho
// Student Number: 3151957
// Date of Submission: 19th May 2024

import java.util.Arrays;

public class Main {

    //    Task 1 Function: creates the array and assigns the elements to it, then reverses them
    public static String[] reverse(String[] arr) {
//      Create a new array to hold the reversed elements
        String[] reversedArr = new String[arr.length];

//      Loop through the original array from the end to the beginning
        for (int i = 0; i < arr.length; i++) {
//      Assign elements from the original array to the new array in reverse order
            reversedArr[i] = arr[arr.length - 1 - i];
        }

        return reversedArr;
    }

//    Task 2 Function: Checks which elements are divisible by the divisor and returns them

    public static int[] divisible(int[] values, int divisor) {
//      First pass: count how many elements are divisible by the divisor
        int count = 0;
        for (int value : values) {
            if (value % divisor == 0 && value != 0) {
                count++;
            }
        }

//      Create an array to hold the divisible values
        int[] result = new int[count];
        int index = 0;
//
//      Collect the divisible values
        for (int value : values) {
            if (value % divisor == 0 && value != 0) {
                result[index++] = value;
            }
        }

        return result;
    }

    // Task 3 Function: Method to rotate the grid 90 degrees clockwise
    public static char[][] rotateGrid(char[][] grid) {
        int n = grid.length;  // Determine the size of the grid (assuming a square grid)
        char[][] rotated = new char[n][n];  // Create a new 2D array to store the rotated grid

//      Loop through each element in the original grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
//       Rotate the element by assigning it to the correct position in the new grid
                rotated[j][n - 1 - i] = grid[i][j];
            }
        }

        return rotated;  // Return the rotated grid
    } // Method to print the grid in a formatted way

    public static void printGrid(char[][] grid) {
        for (char[] row : grid) {  // Loop through each row in the grid
            for (char ch : row) {  // Loop through each character in the row
                System.out.print(ch + " ");  // Print the character followed by a space
            }
            System.out.println();  // Print a newline at the end of each row
        }
    }

    public static void main(String[] args) {

//     Task 1: Use the array as example and return the same elements but in reverse order

        String[] arr = {"this", "is", "the", "final"};
        String[] reversed = reverse(arr);

//      Print the reversed array
        for (String str : reversed) {
            System.out.print(str + " ");
        }
//      Ensure there's a new line after printing the array
        System.out.println();

//      Task 2: Creates an int array and returns only the elements which are divisible by the divisor
        int[] values = {10, 15, 20, 25, 30, 0, 35, 40, 50};
        int divisor = 10;
        int[] result = divisible(values, divisor);

//         Print the returned array
        System.out.println("Values divisible by " + divisor + ": " + Arrays.toString(result));

//       Task 3: Create a char grid then rotate it clockwise as necessary

//      Initialise a 3x3 grid with characters '1' to '9'
        char[][] grid = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}
        };

//       Print the original grid
        System.out.println("-------------");
        System.out.println("Original");
        System.out.println("-------------");
        printGrid(grid);

//      Rotate the grid once and print the result
        char[][] rotatedOnce = rotateGrid(grid);
        System.out.println("-------------");
        System.out.println("Rotation 1");
        System.out.println("-------------");
        printGrid(rotatedOnce);

//      Rotate the grid a second time and print the result
        char[][] rotatedTwice = rotateGrid(rotatedOnce);
        System.out.println("-------------");
        System.out.println("Rotation 2");
        System.out.println("-------------");
        printGrid(rotatedTwice);

//       Rotate the grid a third time and print the result
        char[][] rotatedThrice = rotateGrid(rotatedTwice);
        System.out.println("-------------");
        System.out.println("Rotation 3");
        System.out.println("-------------");
        printGrid(rotatedThrice);
    }
}