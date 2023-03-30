import java.util.*;
public class namesorting_reverse 
{
    public static void main(String[] args) 
    {
        int n;
        String temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of names you want to enter:");
        n = s.nextInt();
        String names[] = new String[n];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter all the names:");
        for(int i = 0; i < n; i++)
        {
            names[i] = s1.nextLine();
        }
        System.out.println("Enter choice(1 for ascending and 2 for descending):");
        int ch = s.nextInt();
        if (ch>2) { System.out.println("Invalid Choice");   return;}
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                switch (ch) {
                    case 1:
                        if (names[i].compareToIgnoreCase(names[j])>0) 
                        {
                            temp = names[i];
                            names[i] = names[j];
                            names[j] = temp;
                        }
                        break;
                    case 2:
                        if (names[i].compareToIgnoreCase(names[j])<0) 
                        {
                            temp = names[i];
                            names[i] = names[j];
                            names[j] = temp;
                        }
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        break;
                }
            }
        }
        System.out.print("Names in Sorted Order:");
        for (int i = 0; i < n ; i++) 
        {
            System.out.print(names[i] + ",");
        }
        // System.out.print(names[n - 1]);
    }
}