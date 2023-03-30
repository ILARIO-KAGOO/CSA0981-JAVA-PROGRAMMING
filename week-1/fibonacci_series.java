import java.util.Scanner;

class fibonacci_series 
{
  public static void main(String[] args) 
  {

    int n = 0, firstTerm = 0, secondTerm = 1;
    Scanner s = new Scanner(System.in);

    System.out.print("Enter the the series range: ");
    n = s.nextInt();
    s.close();
        
    System.out.println("\nFibonacci Series Upto " + n + ":");
    
    while (firstTerm <= n) 
    {
      System.out.print(firstTerm + ", ");
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;

    }
  }
}
