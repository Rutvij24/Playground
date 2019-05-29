import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int starcount = 1 ;
      for(int rownum = 1; rownum <= n; ++rownum){
    		    for(int space = 1; space <= (n- rownum ); ++space){
    		        System.out.print(" ");
		        }
            	for(int colnum = 1; colnum <= starcount; ++ colnum){
    		        System.out.print("*");
    		    }  
            	System.out.print("\n");
        		starcount = starcount+2;
		    }
	}
}