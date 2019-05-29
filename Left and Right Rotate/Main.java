import java.util.Scanner;
public class Main 
{
  
  public static void main(String args[])
    {
    	//Try your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
   	int no_rot = sc.nextInt();
   	
    int odd=0 ; int even=0;
    if(n%2==1)
    {
    	 odd=n-1;
      	 even=n-2;
    }
    else
    {
    	 odd=n-2;
      	 even=n-1;
    }
    for(int i=1;i<=no_rot;i++)
    {
    	int temp = a[odd];
      	for(int j=odd;j>=2;j-=2)
        {
           
            a[j] = a[j-2];
       	
        }
        a[0] = temp;
    }
    
    for(int i=1;i<=no_rot;i++)
    {
    	int temp1 = a[1];
      	for(int j=1;j<=even;j+=2)
        {
           if(j==even)
                a[j]=temp1;
            else
            a[j] = a[j+2];
            
       	
        }
        
    }
    
    
   
    for(int t=0;t<n;t++)
      System.out.print(a[t]+" ");
    
  	}
}