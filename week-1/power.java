import java.util.*;
import java.lang.Math;
public class power 
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter number: ");
    double n = s.nextDouble();
    System.out.print("Enter the power (2 - square & 3 - cube etc): ");
    int n1 = s.nextInt();
    s.close();
    System.out.print(n+" ^ "+n1+" = "+Math.pow(n,n1));


  }
}
