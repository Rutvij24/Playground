import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
      int num=n;
      int missing=0;
      while(num>0)
      {
        int found=0;
      	for(int i=0;i<n;i++)
        {
        	if(arr[i]==num)
            {
              found = 1;
              break;
            }
        }
        if(found==0)
        {
          missing = num;
          break;
        }
        num--;
      }
      System.out.print(missing);
    }
}