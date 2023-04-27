import java.util.*;
import java.lang.String;

public class test
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int f = s.length();
    char[] arr = s.toCharArray();
    String d = "";
    for(int i = f-1; i>=0  ; i--)
    {
      // String g = arr[i];
      d = d + arr[i];
    }
    System.out.println("Reverse of string: "+d);
    if (s.equals(d))
    {
      System.out.println("It is Palindrome");
    }
    else
    {
      System.out.println("It is not a Palindrome"+d);
    }

  }
}
