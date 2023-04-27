import java.util.*;
import java.lang.*;

public class qn3
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int arr1[] = new int[4];
    int arr2[] = new int[4];
    int bal=0;
    for(int i = 0 ; i < 4 ; ++i)
    {
      System.out.print("Enter "+(i+1)+" Denomination: ");
      arr1[i] = sc.nextInt();
      System.out.print("Enter "+(i+1)+" Denominationno of notes: ");
      arr2[i] = sc.nextInt();
    }
    for(int i = 0 ; i < 4 ; ++i)
    {
      bal += arr1[i]*arr2[i];
    }
    System.out.println("Balance: "+bal);
  }
}