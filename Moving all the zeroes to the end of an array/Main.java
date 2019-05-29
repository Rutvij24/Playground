import java.util.Scanner;
class Main{
  
  	public static void update(int size,int arr[])
    {
    	int zero[] = new int[size];
      	int nonzero[] = new int[size];
      	int zcount=0; int nzcount =0;
      	
      for(int i=0;i<size;i++)
      {
      		if(arr[i]>0)
            {
            	nonzero[nzcount] = arr[i];
              nzcount++;
            }
        	else
            {
            	zero[zcount] = 0;
              zcount++;
            }
      }
      
      int count=0;
     
      	for(int j=0;j<nzcount;j++)
        {
        	arr[count]=nonzero[j];
          	count++;
        }
        for(int k=0;k<zcount;k++)
        {
          arr[count]=0;
          count++;
        }
    
    
    }
  
    public static void main(String args[]) {
       // Type your code here\
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
  	update(n,a);
      for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
      
    }
}
      
      