import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder sb = new StringBuilder("");
    String arr[] = str.split(" ");
    for(int i=0;i<arr.length-1;i++)
    {
    	for(int j=i+1;j<arr.length;j++)
        {
        	if(arr[i].equals(arr[j]))
              arr[j] = "$" ;
        }
      
    }
    for(int i=0;i<arr.length;i++)
    {
    	if(arr[i] != "$")
        {
        	sb.append(arr[i]+" ");
        }
      
    }
    System.out.print(sb);
  }
}