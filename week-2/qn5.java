import java.util.*;
import java.lang.*;
public class qn5 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();
    System.out.println("Binary: "+Integer.toBinaryString(n));
    System.out.println("Octal: "+Integer.toOctalString(n));
  }  
}
