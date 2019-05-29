import java.util.* ;

public class Main
{
  	public static int power(int b , int e)
    {
     	int p = 1 ;
    	for(int i = 1 ; i <= e ; i ++)
        {
        	p = p*b;
        }
      return p ;
    }
  
  	 public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int base = sc.nextInt();
       int expo = sc.nextInt();
       
       System.out.println(power(base,expo));
    }
}