import java.util.*;
import java.lang.Math;
public class squareroot 
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter number: ");
    int x = s.nextInt();
    System.out.print("Squareroot of "+x+" : "+Math.sqrt(x)+", "+-Math.sqrt(x));
  }  
}
