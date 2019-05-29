import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int list[] = new int[n];
      int k = sc.nextInt();
      for(int i=0;i<n;i++)
        list[i] = sc.nextInt();
      int num[] = new int[k];
      for(int i=0;i<k;i++)
        num[i] = i+1;
      
      
      
      for(int i=0;i<k;i++)
      {
      		int count=0;
        for(int j=0;j<n;j++)
        {
        	if(num[i] == list[j])
              count=count+1;
        }
      
      System.out.println(num[i]+" "+count);
      
      }
    }
}