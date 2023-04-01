import java.util.*;

public class perfect_num
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter Number:");
    int n = s.nextInt(),sum=0;
    s.close();
    for(int i = 1 ; i < n ; ++i)
    {
      if(n%i==0)
      {
        sum+=i;
      }
    }
    if(sum == n)
    {
      System.out.println("It is a perfect number");
    }
    else
    {
      System.out.println("It is not a perfect number");
    }
  }
}