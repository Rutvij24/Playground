import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in) ;
      int num = sc.nextInt() ;
      int result = 0 , digit;
      int temp = num ;
      while (num > 0)
      {
        int fact = 1;
      	digit = num % 10 ;
        for( int i = 1 ; i <=digit ; i++)      	
          fact =  fact * i ;
      	result = result + fact ;
        num = num/10 ;
      }
      
      if(result == temp)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}