import java.io.*;
import java.util.*;
 
class string_rotation {
 
    static boolean checkString(String s1, String s2,
                               int indexFound, int Size)
    {
        for (int i = 0; i < Size; i++) {
 
            if (s1.charAt(i)
                != s2.charAt((indexFound + i) % Size))
                return false;
        }
 
        return true;
    }
 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("s = ");
        String s1 = sc.nextLine();
        System.out.print("goal = ");
        String s2 = sc.nextLine();
 
        if (s1.length() != s2.length()) {
            System.out.println(
                "s2 is not a rotation on s1");
        }
        else {
 
            ArrayList<Integer> indexes = new ArrayList<
                Integer>(); 
 
            int Size = s1.length();
 
            char firstChar = s1.charAt(0);
 
            for (int i = 0; i < Size; i++) {
                if (s2.charAt(i) == firstChar) {
                    indexes.add(i);
                }
            }
 
            boolean isRotation = false;
 
            for (int idx : indexes) {
                isRotation = checkString(s1, s2, idx, Size);
 
                if (isRotation)
                    break;
            }
 
            if (isRotation)
                System.out.println(
                    "Output:True");
            else
                System.out.println(
                    "Output:False");
        }
    }
}