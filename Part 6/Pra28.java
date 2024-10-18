import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Pra28 {
   
 public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Pra28 <character> <filename>");
            return;
        }

        char targetChar = args[0].charAt(0); 
        String fileName = args[1]; 

        int charCount = 0; 
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int currentChar;

            while ((currentChar = reader.read()) != -1) {
                if (currentChar == targetChar) {
                    charCount++;
                }
            }
            System.out.println("Character '" + targetChar + "' appears " + charCount + " times in " + fileName);

        } catch (IOException e) 
        {
            System.err.println("Error reading file: " + fileName);
        }
    }
}

