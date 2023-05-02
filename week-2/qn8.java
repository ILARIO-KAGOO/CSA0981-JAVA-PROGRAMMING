import java.util.*;
import java.lang.*;
public class qn8
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your Python Programming marks: ");
    int py = sc.nextInt();
    System.out.print("Enter your C Programming marks: ");
    int c = sc.nextInt();
    System.out.print("Enter your Mathematics marks: ");
    int m = sc.nextInt();
    System.out.print("Enter your Physics marks: ");
    int p = sc.nextInt();
    int sum = py+c+m+p;
    int agg = sum/4;
    System.out.println("\nTotal = "+sum+"\nAggregate = "+agg);

    if(agg >=75)
      System.out.println("Distinction");
    else if(75 > agg && agg >=60)
      System.out.println("First Division");
    else if(60 > agg && agg >=50)
      System.out.println("First Division");
    else if(50 > agg && agg >=40)
      System.out.println("First Division");
    else
      System.out.println("Fail");
  }
}