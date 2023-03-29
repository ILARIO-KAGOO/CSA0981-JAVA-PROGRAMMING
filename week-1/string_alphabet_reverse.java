import java.util.*;
public class string_alphabet_reverse 
{
  public static void main(String args[]) 
  {
    try (Scanner sc = new Scanner(System.in)) 
    {
      System.out.println("Enter a string value: ");
      String str = sc.nextLine();
      char charArray[] = str.toCharArray();
      Arrays.sort(charArray);
      String rev="";
      for(int i=charArray.length-1;i>=0;i--)
      {
        rev+=charArray[i];
      }
      System.out.println(rev);
    }  
  }
}
