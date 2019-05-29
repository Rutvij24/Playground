import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
    int arr[] = new int[size];
    for(int i=0;i<size;i++)
      arr[i] = sc.nextInt();
    int max = arr[0];
    for(int i=0;i<size;i++)
    {
      if(arr[i]>max)
        max = arr[i];
    }
    
    int temp[] = new int[max+1];
    for(int i=0;i<max+1;i++)
      temp[i]=0;
    
    //int count=0;
    for(int i=0;i<size;i++)
    {
    	++ temp[arr[i]]	;
      
    }
    
    int max1 = 0;
    for(int i=0;i<temp.length;i++)
    {
      if(temp[i]>max1)
        max1 = i;
    }
    System.out.print(max1);
  }
}