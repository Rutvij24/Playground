import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int arr[] = new int[size];
      for(int i=0;i<size;i++)
      	arr[i] = sc.nextInt();
      
      int left=0; int right=size-1;
      boolean pal = true;
      while(left<right)
      {
      	if(arr[left] != arr[right])
        {
        	pal = false;
          	break;
        }
        left++;
        right--;
      }
      
      if(pal)
        System.out.print("Yes");
      else
        System.out.print("No");
      
    }
}