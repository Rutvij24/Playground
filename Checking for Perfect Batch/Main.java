import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
     Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int nbatch = n/3;
    int list[]=new int[n];
    for(int i=0;i<n;i++)
    {
      list[i]=sc.nextInt();
      
    }
    int sum = list[1]+list[0]+list[2];
    int start = 1;
    int end = 3;
    int flag=0;

    
    while(start<nbatch)
    {
        int temp[] = new int[3];
        int j=0;
        for(int i=end;i<=end+2;i++)
        {   
            temp[j] = list[i];
            j=j+1;
        }
        j=0;
        
        end = end+3;
        start = start+1;
    int sum2 = temp[0]+temp[1]+temp[2];
        if(sum==sum2){
            flag=1;
        }
        else{
            flag=0;
            break;
        }
        
    }
    if(flag==1)
    System.out.print("Perfect Batch");
    else
    System.out.print("Not a Perfect Batch");
   
  }
}