import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class words {
  private String word;

  public words() {
    word = "";
  }

  public String[] words(String word) {
    this.word = word;
    return word.split(" ");
  }

  public String getWord() {
    return word;
  }

  public void setWord(String newWord) {
    word = newWord;
  }

  public void flipWord() {
    String[] strSplit = word.split("");
    ArrayList<String> strList = new ArrayList<>(Arrays.asList(strSplit));
    Collections.reverse(strList);

    StringBuilder reversedStr = new StringBuilder();
    for (String letter : strList) {
      reversedStr.append(letter);
    }

    System.out.println(reversedStr.toString());
  }
}
