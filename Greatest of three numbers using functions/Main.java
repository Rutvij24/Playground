import java.util.Scanner;
class Main{
  
  public static void great(int a , int b , int c)
  { int g = 0 ;
    if(a > b)
      g = a ; 
    else
       g = b ;
    if ( g > c)
      System.out.println(g);
    else
      System.out.println(c);
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();
      great(n1,n2,n3);
	}
}