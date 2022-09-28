import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class StringParser {


    // Function to return the modified string
    static String extractInt(String str)
    {
        // Replacing every non-digit number
        // with a space(" ")
        str = str.replaceAll("[^0-9]", " "); // regular expression

        // Replace all the consecutive white
        // spaces with a single space
        str = str.replaceAll(" +", " ");

        if (str.equals(""))
            return "-1";

        return str;
    }

    static boolean isThereBigNumber(String oldLine)
    {
        String line = extractInt(oldLine); // Function to return the modified string
        int nmb = 0; // integer variable where parsed numbers will be stored
        int kiek=0;

        String []arr = line.split(" "); // Split numbers from one big string to multiple strings with single numbers

        for (String str : arr) // Check each string with a number in it
        {

            if(str!="")// Avoid format exceptions
            {

                nmb= Integer.parseInt(str); // Initialize nmb integer with a number from line
                if(nmb>=10)//Check if the number is higher than 10
                {
                    return true; //There is at least one number higher than 10 in the line
                }
            }

        }
        return false;// There is NO number higher than 10 in the line
    }






}
