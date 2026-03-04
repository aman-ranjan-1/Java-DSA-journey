// Write a Java program to generate and display a multiplication table for numbers from 1 to n, where n is provided by the user.

// "Declare and initialize any positive integer 
// Use nested loops (for loops) to generate the multiplication table from 1 to n.
// Each row in the table should represent the multiplication table for a specific number (from 1 to n), and each column in the row should show the product of that number with numbers from 1 to 10.
// Display the multiplication table to the user in a readable format


public class Multiplication {
    public static void main(String[] args) {
            
            int number = 5;
            // Use nested loops to generate the multiplication table
            for(int i = 1; i <= number; i++) {
                System.out.println("Multiplication table for " + i + ":");
                for(int j = 1; j <= 10; j++) {
                    int product = i * j;
                    System.out.println(i + " * " + j + "  = "  + product);
                }
                System.out.println(); // Add a blank line between tables
            }
        }

}
