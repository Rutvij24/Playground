import java.util.Scanner;
class Main
{
  public static void reverse(String arr[] , int i)
  {
    String word = arr[i];
  	int len = word.length();
    StringBuilder str = new StringBuilder("");
    for(int j=len-1;j>=0;j--)
    {
    	str.append(word.charAt(j));
    }
    
    arr[i] = str.toString();
  }
  public static void main(String args[])
  {
    //your code here;
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String arr[] = str.split(" ");
    for(int i=0;i<arr.length;i++)
    	reverse(arr,i);

    for(int i=0;i<arr.length;i++)
      	System.out.print(arr[i]+" ");
    
  }
}