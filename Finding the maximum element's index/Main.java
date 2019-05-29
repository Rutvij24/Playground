import java.util.Scanner;
public class Main
{
  public static int func(int list[],int n)
  {
  	int maxi = list[0];
    int index = 0;
    for(int i=0;i<n;i++)
    {
    	if(maxi<list[i])
        { 
          maxi = list[i];
         index = i;
        }
    }
	return index;  
  }
  
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    
    for(int i=0;i<n;i++)
      arr[i] = sc.nextInt();
    System.out.print(func(arr,n));
  }
}


