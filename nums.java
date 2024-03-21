import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class nums
{

  private String num;

  public nums () { num = (""); }

  public nums (String num) { this.num = num; }

  public String
  getNum ()
  {
    return num;
  }

  public void
  setNum (String newNum)
  {
    num = newNum;
  }

  public void
  flipNum ()
  {
    String[] numSplit = num.split ("");
    ArrayList<String> numList = new ArrayList<> (Arrays.asList (numSplit));
    Collections.reverse (numList);

    StringBuilder reversedNum = new StringBuilder ();
    for (String digit : numList)
      {
        reversedNum.append (digit);
      }

    System.out.println (reversedNum.toString ());
  }
}
