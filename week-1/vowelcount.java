import java.util.*;

public class vowelcount
{
  public static void main(String[] args)
  {
    try (Scanner s = new Scanner(System.in)) {
      System.out.println("Enter the string");
      String str1 = s.nextLine();
      char[] c = str1.toCharArray();
      int count = 0;
      for(int i =0 ; i <c.length; i++)
      {
        if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u' || c[i]=='A' || c[i]=='E' || c[i]=='I' || c[i]=='O' || c[i]=='U')
        {
          count++;
        }
      }
      System.out.println("Vowels: " + count);
    }
  }

}