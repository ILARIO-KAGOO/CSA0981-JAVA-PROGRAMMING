import java.util.*;
import java.lang.*;

public class qn1
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no of numbers: ");
    int n = sc.nextInt();
    System.out.print("Enter the the numbers: \n");
    int arr[] = new int[n];
    int prime=0,composite=0;
    boolean cont = false;
    for(int i = 0 ; i < n ; ++i)
    {
      arr[i] = sc.nextInt();
    }
    for(int i:arr)
    {
      for(int j = 2 ; j < i ; j++)
      {
        if(i%j==0)
        {
          composite++;
          cont = true;
          break;
        }
      }
      if(cont==false)
      {
        prime++;
      }
      cont = false;
    }
    System.out.print("Prime: "+prime+"\nComposite: "+composite);
  }
}