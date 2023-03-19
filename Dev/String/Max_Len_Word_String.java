

public class Max_Len_Word_String {
    
    public static void main(String a[])
    {
        String sentence="dear, student you have need to work hard";
        int max=0;
         int value=0;

        // int max[]
        String s[]=sentence.split(" ");

        int ele[]=new int[s.length];

       
        for(String bc:s)
        {
             ele[value]= bc.length(); 
             ++value;
        }

           for(int i=0;i<ele.length;i++)
           {
                 if(ele[i]>max)
                 {
                    max=ele[i];
                    value=i;
                 }
           }

           System.out.println("word has highest length="+s[value]+"\n\n"+"whose length ="+max);

                                           
    }
}
