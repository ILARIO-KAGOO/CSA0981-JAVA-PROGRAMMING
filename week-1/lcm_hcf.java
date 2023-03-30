import java.util.Scanner;
 
public class lcm_hcf 
{
 
    public static void main(String[] args) 
    {
        int a, b, lcm, gcd;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Two Number:");
        a = s.nextInt();
        b = s.nextInt();
 
        gcd = getGcd(a, b);
        lcm = (a * b) / gcd;
        System.out.println("LCM: " + lcm);
        System.out.println("GCD: " + gcd);
    }
 
    public static int getGcd(int a, int b) 
    {
        if (b == 0) 
        { return a;} 
        else 
        { return getGcd(b, a % b);}
    }
}
