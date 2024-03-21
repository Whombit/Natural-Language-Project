import java.util.Scanner;

public class NLPRunner
{
  public static void main (String[] args)
  {
    Scanner myObj = new Scanner (System.in);
    words word = new words ();
    nums num = new nums ();

    System.out.println ("Write a word: ");
    String newWord = myObj.nextLine ();
    word.setWord (newWord);
    System.out.println ("Word chosen: " + word.getWord ());

    System.out.println ("Write a biiigggg number (Or not idc): ");
    String newNum = myObj.nextLine ();
    num.setNum (newNum);
    System.out.println ("Number chosen: " + num.getNum ());

    word.flipWord ();
    num.flipNum ();
  }
}