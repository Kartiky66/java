import java.net.SocketPermission;
import java.util.*;

import javax.lang.model.util.ElementScanner14;

   public class ques_7
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();

        if(a > b)
        {
         if(a > c)
         System.out.println("a is max.");

         else 
         System.out.println("c is max.");
        }
        else if(b > a) 
        {
            if(b > c)
            System.out.println("b is max.");
             
            else
            System.out.println("c is max.");
        }
        else 
        System.out.println("c is max.");
    }
}