package String;
 class Occurence_Char_String {
    public static void main(String s[])
    {
        
        String c="aabbccdde";
        int count =1;
      
        char g[]= new char[c.length()];

        g=c.toCharArray();

        for(int i=0;i<g.length;i++)
        {
            for(int j=i+1;j<g.length;j++)
            {
                if(g[i]!='0')
                {
                      if(g[i]==g[j])
                      {
                             ++count;
                             g[j]='0';
                      }
                }
            }
            if(g[i]!='0')
            System.out.println(g[i]+" occurs"+count+"times\n");
            count=1;
            
        }




        

    }
}
