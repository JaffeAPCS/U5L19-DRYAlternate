import java.util.Random;

/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
    /**
     * Instance variables and constants
     */
    private final int maxRandomValue = 10;
    private final int arrayLength = 20;
    private int[] values = new int[arrayLength];

    /**
     * Initialize the values array with arrayLength random numbers between 0 and 9
     */
    public Tester()
    {
        Random r = new Random();
        for (int i=0; i<values.length; i++)
            values[i] = r.nextInt(maxRandomValue);
    }
    
    /**
     * This is the function we'll be working with in this lesson
     * 
     * Will multiply given values in the array by multiplyBy
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void mapValues()
    {
        // Print the array before we change it
        printValues("Before: ");
        
        // Make the changes
        int multiplyBy = 5;
        values[4] = values[4] * multiplyBy;
        
        // Print the array after we change it
        printValues("After:  ");
    }
    
    /**
     * Prints msg, then the formatted array values
     */
    private void printValues(String msg) {
        System.out.print(msg);
        for (int i=0; i<values.length; i++) {
            System.out.printf("%2d", values[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    /**
     * This runs the program 
     */
    public static void main(String [] str) 
    {
        Tester tester = new Tester();
        tester.mapValues();
    }
}
