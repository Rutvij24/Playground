import java.util.Scanner;
class Main
{
  	public static int square(int num)
    {
    	int result = num * num ;
      	return result ;
    }
  
	public static void main (String[] args)
    {
	 // Type your code here   
	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int output = square(n);
      System.out.println(output);
    } 
}