import java.util.*;
public class test2_1 
{
    public static void main(String[] args) 
    {
        int n;
        String temp;
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter number of names you want to enter:");
        n = s1.nextInt();
        String names[] = new String[n];
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter all the names:");
        for(int i = 0; i < n; i++)
        {
            names[i] = s2.nextLine();
        }
        System.out.println("Enter choice(1 for ascending and 2 for descending):");
        int ch = s1.nextInt();
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
                }
            }
        }
        System.out.print("Names in Sorted Order:");
        for (int i = 0; i < n ; i++) 
        {
            System.out.print(names[i] + ",");
        }
    }
}


