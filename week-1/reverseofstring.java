
import java.util.*;
class StringFormatter {
    public static String reverseString(String str){
        char ch[]=str.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;
    }
}

public class reverseofstring {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.println("Enter String:");
            String str1 = sc.next();
            System.out.println(StringFormatter.reverseString(str1));
        }
    }
}