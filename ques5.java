
import java.util.*;

import javax.lang.model.util.ElementScanner14;


public class ques5
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
       float n = sc.nextFloat();
        
       if( n > 0 )
       {
        System.out.println("No. is positive");
       }
       else if( n < 0 )
       {
        System.out.println("No. is negative");
        }
        else 
        {
            System.out.println("No. is zero");
        }

    }
}

