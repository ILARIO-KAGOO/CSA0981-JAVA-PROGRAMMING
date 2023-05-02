import java.util.*;
import java.lang.*;

public class test1_1
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int[] arr = {14,16,87,36,25,89,34}; //Input Array
    Arrays.sort(arr);
    System.out.print("Enter the Mth Maximum: ");
    int m = sc.nextInt();
    System.out.print("Enter the Nth Minimum: ");
    int n = sc.nextInt(),dn,dm;
    if(n==0)
    { dn = 0;}
    else
    { dn = arr[n-1];}
    if(m==0)
    { dm=0;}
    else
    { dm =arr[(arr.length)-m]; }
    int sum = dn + dm;
    int dif = dm - dn;
    System.out.println("Mth maximum: "+dm+"\nNth Minimum: "+dn);
    System.out.println("Sum: "+sum+"\nDifference: "+dif);
  }
}

