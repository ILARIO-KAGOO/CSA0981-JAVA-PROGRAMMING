import java.util.*;
import java.lang.*;
public class qn13
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Binary Number: ");
    String s = sc.nextLine();
    int decimal = Integer.parseInt(s,2);
    System.out.println("Decimal: "+decimal);
    System.out.println("Octal: "+Integer.toOctalString(decimal));
  }
}