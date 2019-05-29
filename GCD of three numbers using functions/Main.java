import java.util.Scanner;
public class Main{
  	public static int gcd(int a , int b){
    	int hcf = 0 , small = 0 ;	
      if(a<b)
      	small = a ;
      else
        small = b ;
      for(int i = 1 ; i <= small ; i++ )
      {
      	 if(a % i ==0 &&  b % i == 0)
             hcf= i;
      }
      return hcf ;
      
    }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();
      int result = gcd(n1,n2);
      System.out.println(gcd(result,n3));
	}
}