package String;

class AllPossiblePalindrome {
    
    public int allPossiblePalindrome(String s,int len)
    {
          int palindrome=0;
           
        for(int i=0;i<len;i++)
        {
            if(s.charAt(i)==s.charAt(len-1-i))
            {
               ++palindrome;
               System.out.println(s.charAt(i)+""+ s.charAt(len-i-1));
            }
        }
        System.out.println("total no of possible palindrome is:"+palindrome);

        return palindrome;
    } 
}


class Test{

    public static void main(String a[])
    {
        String s="aaabbbacccababacccaabb";
          int length=s.length();

          AllPossiblePalindrome  app=new AllPossiblePalindrome ();
          

    int palindrome=app.allPossiblePalindrome(s,length); 
        System.out.println("total no of possible palindrome is:"+palindrome);


        
    }
}