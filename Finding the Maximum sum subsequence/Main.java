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
    int temp[] = new int[size*2];
    temp[0] = arr[0];
    
     int count=0;
    for(int i=0;i<size-1;i++)
    {
    	if(arr[i+1] > arr[i])
        {
          temp[count]=temp[count] + arr[i+1];
        }
      	else
        {
        	count = count+1;
          	temp[count] = arr[i+1];
        }   
    }
    
    int max = temp[0];
    for(int i=0;i<temp.length;i++)
    {
      if(temp[i]>max)
        max = temp[i];
    }
    System.out.print(max);
  }
}