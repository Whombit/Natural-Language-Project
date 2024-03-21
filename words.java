import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class words
{
     private String word; // Declaring a private String variable named word

     public words()
     {
          word = ""; // Initializing the word variable as an empty string
     }

     // Method to split a sentence into words
     public String[] words(String word)
     {
          this.word = word; // Assigning the input word to the class variable
          return word.split(" "); // Splitting the input word into an array of
                                  // words based on spaces
     }

     // Method to get the current word
     public String getWord()
     {
          return word; // Returning the current word
     }

     // Method to set a new word
     public void setWord(String newWord)
     {
          word = newWord; // Updating the word with a new word
     }

     // Method to reverse the word
     public void flipWord()
     {
          String[] strSplit =
            word.split(""); // Splitting the word into individual characters
          ArrayList<String> strList = new ArrayList<>(
            Arrays.asList(strSplit)); // Converting the array to an ArrayList
          Collections.reverse(
            strList); // Reversing the order of characters in the ArrayList

          StringBuilder reversedStr = new StringBuilder();
          for (String letter : strList) {
               reversedStr.append(
                 letter); // Appending each character to reverse the word
          }

          System.out.println(
            "Reversed word: " +
            reversedStr.toString()); // Printing the reversed word
     }
}
