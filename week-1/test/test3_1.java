import java.util.*;

public class test3_1 
{
  public static void reverseNumber(int number)   
  {  
    if (number < 10)   
    {  
      System.out.println(number);  
      return;  
    }  
    else   
    {  
      System.out.print(number % 10);  
      reverseNumber(number/10);  
    }  
  }  
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter Number: ");
    int n = s.nextInt();
    s.close();
    System.out.print("Reverse: ");
    reverseNumber(n);

  }
}
