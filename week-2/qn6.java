import java.util.*;
import java.lang.*;
public class qn6
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Salary: ");
    int n = sc.nextInt(),bonus=0;
    System.out.print("Enter the Grade: ");
    String s = sc.next();
    switch (s) 
    {
      case "A":
        bonus = 5;
        if(n<10000)
          bonus+=2;
      break;
      case "B":
        bonus = 10;
        if(n<10000)
          bonus+=2;
      break;
      default:
        System.out.print("Invalid Choice");
        System.exit(1);
        break;
    }
    int d = (n*bonus)/100;
    System.out.println("\nSalary: "+n);
    System.out.println("Bonus: "+d);
    System.out.println("Total to be paid: "+(n+d));
  }
}