import java.util.*;
public class digitsum 
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner (System.in);
    System.out.print("Enter N value: ");
    int N = s.nextInt();
    System.out.print("Enter "+N+"digit Numbers: ");
    int n1 = s.nextInt();
    int counter = 0,sum=0;
    while(n1>0)
    {
      int temp = n1%10;
      sum += temp;
      n1/=10;
      counter++;
    }
    if(counter!=N)
    {
      System.out.print("N value and the given input doesnt match.");
    }
    else 
    {
      System.out.print("Sum: "+sum);
    }
  }
}
