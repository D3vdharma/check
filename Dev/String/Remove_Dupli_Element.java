package String;
import java.util.Scanner;

class Remove_Dupli_Element {
    
    public String removeDuplicates(String s)
    {
        char array[]=new char [s.length()];
        int c=1;

        array=s.toCharArray();
        
        for(int i=0;i<s.length();i++)
        {
            for(int j = i+1;j<s.length();j++)
            {
                   if(s.charAt(i)==s.charAt(j))
                   {
                     array[j]='0';  
                    }
                   }
            }
            
            s="";
            for(int i=0;i<array.length;i++)
            {
             if(array[i]!='0')
             {
              s=s+String.valueOf(array[i]);
             }
            }
          //s=s.trim();

             return s;
        }
        


    }

    class Test
    {
        public static void main(String a[])
        {
            Scanner sc=new Scanner(System.in);
            Remove_Dupli_Element rde=new Remove_Dupli_Element();
            
            System.out.println("enter a string:");
            String s=sc.nextLine();

           String after_removing= rde.removeDuplicates(s);

           System.out.println(after_removing);
           
        }
    }