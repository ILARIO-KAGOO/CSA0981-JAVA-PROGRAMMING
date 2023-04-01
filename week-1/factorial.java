import java.util.*;

public class factorial 
{
  public static int fact(int n)
  {
    if(n==0||n==1)
    { return n;}
    else
    { return n*fact(n-1);}
  }  

  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter Number:");
    int n = s.nextInt();
    s.close();
    int f = fact(n);
    System.out.print("Factorial of "+n+": "+f);
  }
}
