import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class nums
{
     private String num; // Declare a private String variable num

     public nums()
     {
          num = ("");
     } // Constructor initializing num to an empty string

     public nums(String num)
     {
          this.num = num;
     } // Constructor setting num to the provided value

     public String getNum()
     {
          return num; // Return the value of num
     }

     public void setNum(String newNum)
     {
          num = newNum; // Set the value of num to the newNum parameter
     }

     public void flipNum()
     {
          String[] numSplit = num.split(
            ""); // Split the num string into an array of individual characters
          ArrayList<String> numList = new ArrayList<>(
            Arrays.asList(numSplit)); // Convert the array to an ArrayList

          Collections.reverse(
            numList); // Reverse the order of elements in the ArrayList

          StringBuilder reversedNum =
            new StringBuilder(); // Create a StringBuilder to store the reversed
                                 // number
          for (String digit : numList) {
               reversedNum.append(digit); // Append each digit to the
                                          // StringBuilder in reversed order
          }

          System.out.println(
            "Reversed number: " +
            reversedNum.toString()); // Print the reversed number
     }
}
