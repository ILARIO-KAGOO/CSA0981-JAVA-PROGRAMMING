import java.util.Scanner;

public class voting
{
    public static void main(String[] args)
    {
        
        int age;
        try (Scanner scan = new Scanner(System.in)) 
        {
            System.out.println("Please enter your age: ");
            age = scan.nextInt();
        }
        
        if(age>=18)
        {
            System.out.println("You are eligible for voting.");
        }
        else
        {
            System.out.println("Sorry,You can vote after: "+ (18-age) + " years");
        }
    }
}