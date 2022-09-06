package String;

import java.util.Scanner;

public class ReverseEachWord {
    String obj;

    public void reverseEachWord(String obj)
    {
    this.obj=obj;   
        // String ss="java is platform dependent";

        String array[]=obj.split(" ");
        System.out.println("String after reversing:");

        for(String e:array)
        {
            
               for(int i=e.length()-1;i>=0;i--)
               {
                    System.out.print(e.charAt(i));
               }
               System.out.print(" ");
    
            }
        
    }

}

class Test
{
    public static void main(String s[])
    {
           Scanner sc=new Scanner(System.in);
               
           ReverseEachWord rew=new ReverseEachWord ();

           System.out.println("enter a string:");
           String line =sc.nextLine();

        rew.reverseEachWord(line);
         
    }
}

