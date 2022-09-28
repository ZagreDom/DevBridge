import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


public class Main {


    public static void main(String[] args)
    {

        boolean doesLineFitCriteria;// Boolean for finding if line fits criteria of having number higher than 10

        try {
            File myObj = new File("input.txt");//Sets file name to read from
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {

                String data = myReader.nextLine();// Reads every line of text file
                doesLineFitCriteria=StringParser.isThereBigNumber(data); // Function for finding out if line fits criteria
                if(doesLineFitCriteria==true)// If it does
                {

                    System.out.println(data);// Print the correct line
                }

            }
            myReader.close(); // Closes text file buffer
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");// If format of input in .txt file is incorrect, error will be printed out
            e.printStackTrace();
        }

    }
}