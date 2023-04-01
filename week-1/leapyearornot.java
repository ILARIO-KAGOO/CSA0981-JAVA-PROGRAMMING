import java.util.*;

public class leapyearornot 
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter number: ");
    int n = s.nextInt();
    s.close();
    if ((n % 400 == 0) || ((n % 4 == 0) && (n % 100 != 0))) 
    {
      System.out.println(n + " is a Leap Year");
    }
 
    else 
    {
      System.out.println(n + " is not a Leap Year");
    }
  } 
}
