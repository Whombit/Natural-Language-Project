import java.util.Scanner;

public class NLPRunner
{
     public static void main(String[] args)
     {
          Scanner myObj = new Scanner(
            System.in); // Instantiate the scanner with the System.in parameter
          words word = new words(); // Instantiate the words object as 'word'
          nums num = new nums();    // Instantiate the nums object as 'num'
          try {
               System.out.println(
                 "Write a word: "); // Asks the user to write a word
               String newWord = myObj.nextLine();
               word.setWord(
                 newWord); // Sets the user inputted word as the word object
               System.out.println(
                 "Word chosen: " +
                 word.getWord()); // Prints that for convenience sake
          } catch (Exception e) {
               System.out.println("Write a word. Or words. I don't care.");
          }

          try {
               System.out.println(
                 "Write a biiigggg number (Or not idc): "); // Asks the user to
                                                            // write a number of
                                                            // any kind really
               String newNum = myObj.nextLine();
               num.setNum(
                 newNum); // Sets the user inputted number as the num object
               System.out.println(
                 "Number chosen: " +
                 num.getNum()); // Prints that for convenience sake
          } catch (Exception e) {
               System.out.println("Write a number. Any number.");
          }

          word.flipWord(); // Flips word
          num.flipNum();   // Flips number
     }
}