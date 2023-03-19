import java.util.Scanner;
class A
{

    public void maxProfit(int arr[],int parts,int len)
    {

        int listOfProfits[]=new int[len-1];
    
     int sum=0;
     int sp=0;
     int cp=0;

     int max=0;
     int profit;

          for(int i=0;i<len;i++)
        {
            cp+=arr[i]; 
            
            for(int j=i+1;j<len;j++)
            {
                  sum+=arr[j];   
            }

            profit=sum-cp;

            sum=0;
            System.out.println(profit+"  ");     

              if(i<len-1){
              listOfProfits[i]=profit;
              profit=0;
              } 
              
        }

        for(int i=0;i<listOfProfits.length;i++)
        {
         if(listOfProfits[i]>max)  
         max=listOfProfits[i];
        }
        System.out.println("maximum profit may earn:"+max);;
       
    }
public static void main(String args[])
{ 
    Scanner sc=new Scanner(System.in); 
    
    int arr[]={1,4,4,3,2,3,2};
int k;
A a=new A();

System.out.println("enter the value of k");
k=sc.nextInt();

a.maxProfit(arr,k,arr.length);
    
}
}