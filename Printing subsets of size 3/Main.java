import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc = new Scanner(System.in);
      int arr_size = sc.nextInt();
      int arr[] = new int[arr_size];
      for(int i=0;i<arr_size;i++)
        arr[i] = sc.nextInt();
      
      for(int i=0;i<arr_size;i++)
      {
      	for(int j=i+1;j<arr_size;j++)
        {
        	for(int k=j+1;k<arr_size;k++)
            {
            	System.out.print("("+arr[i]+", "+arr[j]+", "+arr[k]+")"+" ");
            }
           
        }
        if(i!=arr_size-1)
        System.out.print("\n");
      }
      
     
    }
}