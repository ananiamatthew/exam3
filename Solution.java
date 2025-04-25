
/**
 * My answers for the exam
 *
 * @author Matthew Anania
 */

import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Solution
     */
    public Solution()
    {
        
    }

    /**
     * Q24) Compares if two strings are equal
     */
    public void compareStrings()
    {
        String a = "Hello";
        String b = "Goodbye";
        if (a.equals(b) == true) {
            System.out.println("They are equal.");
        } else {
            System.out.println("They are not equal.");
        }
    }
    // Fixed the if statement, changed "= true" to "== true"
    
    /**
     * Q25) Outputs a list of temperatures over 37.5 and max temperature
     */
    public static ArrayList<Double> feverCheck(ArrayList<Double> list)
    {
        double max = 0;
        ArrayList output = new ArrayList<Double>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 37.5) {
                output.add(list.get(i));
            }
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("Max = " + max);
        return output;
    }
    // Added "import java.util.ArrayList"
    // Changed "ArrayList<double>" to "ArrayList<Double>"
    // Fixed the "list.get()" parts
    // Moved the return and print statements out of the for loop
    
    /**
     * Q26) Use the max method from the Collections class to obtain the max temperature
     */
    public static double maxTemperature(ArrayList<Double> list)
    {
        double output = Collections.max(list);
        return output;
    }
    // Added "import java.util.Collections"
    // Changed "ArrayList<double>" to <ArrayList<Double>
    
    /**
     * Q27) Use the sort method from the Collections class to obtain the max temperature
    
    public static double maxTemperature(ArrayList<double> list = inputs[])
    {
        ArrayList tempList = new ArrayList <double>;
        tempList = inputs.Collections.sort();
        double output = tempList[tempList.length() - 1];
        return output;
    }
    
    */
}
