import java.util.*;
import java.lang.*;

public class fizzbuzz
{
  public static void main(String[] args) throws java.lang.Exception
  {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = s.nextInt();
    Vector<String> array = new Vector<String>();
    for(int i = 1 ; i <= n ; ++i)
    {
      if((i%3==0)&&i%5==0)
      {
        array.addElement("FizzBuzz"); 
      }
      else if (i%3==0)
      {
        array.addElement("Fizz"); 
      }
      else if (i%5==0)
      {
        array.addElement("Buzz"); 
      }
      else
      {
        String d = Integer.toString(i);
        array.addElement(d);
      }
    }
    for(int i = 0 ; i < n ; ++i)
    {
      System.out.print(array.get(i)+", ");
    }
  }
}
