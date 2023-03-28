import java.util.*;

public class Compositeornot
{
    public static void main (String[] args)
    {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        number = sc.nextInt();
        sc.close();
        boolean cond = false ;
        for (int i=2 ; i < number ; i++)
        {
            if(number%i==0)
            {
                System.out.println(number+" is a composite");
                cond = true;
                break;
            }
        }
        if (!cond)
        {
            System.out.println(number+" is not a composite");
        }
    }
}
