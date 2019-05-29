import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc = new Scanner(System.in) ;
      int num = sc.nextInt() ;
      int temp = num ;
      int flag = 0 , c=0 , digit ;
      while (temp > 0)
      {
        digit = temp % 10 ;
        c = c + (digit*digit*digit) ;
        temp = temp / 10 ;
      }
      
      if(c == num)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}