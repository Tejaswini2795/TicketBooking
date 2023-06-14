import java.io.*;
import java.util.*;

public class Solution1 {
	 static boolean isAnagram(String a, String b) {
         // Complete the function
         List a1 = Arrays  .asList(a.toCharArray());
         List a2 = Arrays.asList(b.toCharArray());
         return true;
     }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder sb = new StringBuilder(A);
       
        System.out.println(sb.reverse());
        if(A.length()<= 50){
            if((sb.reverse().toString()).equals(A)){
            	System.out.println(sb.reverse());
                System.out.println("Yes");
            }
            else
                System.out.println("No");
        }
       
    }
}



