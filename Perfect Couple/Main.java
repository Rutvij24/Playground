import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc = new Scanner(System.in);
      int arr_size = sc.nextInt();
      int arr[] = new int[arr_size];
      for(int i=0;i<arr_size;i++)
        arr[i] = sc.nextInt();
      int value = sc.nextInt();
      
      for(int i=0;i<arr_size;i++)
      {
      	for(int j=i+1;j<arr_size;j++)
        {
        	if(arr[i]+arr[j]==value)
          		System.out.println(arr[i]+", "+arr[j]);
        }      
        
      }
    }
}