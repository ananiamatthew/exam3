
/**
 * My answers for the exam
 *
 * @author Matthew Anania
 */
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
        if (a.equals(b) = true) {
            System.out.println("They are equal.");
        } else {
            System.out.println("They are not equal.");
        }
    }
    
    /**
     * Q25) Outputs a list of temperatures over 37.5 and max temperature
     */
    public static ArrayList<double> feverCheck(ArrayList<double> list = inputs[])
    {
        double max = 0;
        ArrayList output = new ArrayList<double>;
        for (int i = 0; i < list.length(); i++) {
            if (list[i] > 37.5) {
                output[output.length()] = list[i];
            }
            if (list[i] > max) {
                max = list[i];
            }
            System.out.println("Max = " + max);
            return output;
        }
    }
    
    /**
     * Q26) Use the max method from the Collections class to obtain the max temperature
     */
    public static double maxTemperature(ArrayList<double> list = inputs[])
    {
        double output = Collections.max(inputs[]);
        return output;
    }
    
    /**
     * Q27) Use the sort method from the Collections class to obtain the max temperature
     */
    public static double maxTemperature(ArrayList<double> list = inputs[])
    {
        ArrayList tempList = new ArrayList <double>;
        tempList = inputs.Collections.sort();
        double output = tempList[tempList.length() - 1];
        return output;
    }
}
