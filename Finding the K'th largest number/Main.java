import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int list[] = new int[n];
      for(int i=0;i<n;i++)
        list[i] = sc.nextInt();
      int k = sc.nextInt();
      
      for(int i=0;i<n-1;i++)
      {
      	for(int j=i+1;j<n;j++)
        {
        	if(list[i] > list[j])
            {
            	int temp = list[i];
              	list[i] = list[j];
              	list[j] = temp;
            }
        }
      }
      
      System.out.print(list[n-k]);
      
    }   
}