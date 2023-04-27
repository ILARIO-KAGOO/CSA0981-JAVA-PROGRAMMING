import java.util.*;
public class nthodd 
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the range: ");
    int n = s.nextInt();
    String odd = "";
    if(n>0)
    {
      for (int i = 1; i < n; i++) 
      {
        if(!(i%2==0))
        {
          odd = odd + i + ", ";
        }  
      }
    }
    else if (n<0)
    {
      for (int i = n; i < 0; i++) 
      {
        if(!(i%2==0))
        {
          odd = odd + i + ", ";
        }  
      }
    }
    else
    {
      System.out.println("0 nor odd nor even");
      return;
    }
    System.out.println(odd);
  }
}
