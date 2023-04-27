import java.util.*;
import java.lang.*;

public class qn2 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int[] arr = {14,16,87,36,25,89,34};
    Arrays.sort(arr);
    System.out.print("Enter the Mth Maximum: ");
    int m = sc.nextInt();
    System.out.print("Enter the Nth Minimum: ");
    int n = sc.nextInt();
    int sum = arr[n-1] + arr[(arr.length)-m];
    int dif = arr[(arr.length)-m] - arr[n-1];
    System.out.println("Mth maximum: "+arr[(arr.length)-m]+"\nNth Minimum: "+arr[n-1]);
    System.out.println("Sum: "+sum+"\nDifference: "+dif);
  }
}
