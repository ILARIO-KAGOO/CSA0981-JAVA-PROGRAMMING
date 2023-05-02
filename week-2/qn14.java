import java.util.*;
import java.lang.*;

public class qn14 {
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String statement = sc.nextLine();
    int count = 0;
    for (int i = 0; i < statement.length(); i++) 
    {
        char ch = statement.charAt(i);
        if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) 
        {
            count++;
        }
    }
    System.out.println("Number of special Characters: " + count);
  }
}
