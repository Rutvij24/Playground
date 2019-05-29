import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int num = n ;
      for(int rownum = 1; rownum <= n; ++rownum){
            	for(int colnum = 1; colnum <= n-rownum+1; ++ colnum){
    		        System.out.print(num);
                  	num = num -1 ;
    		    }  
            	System.out.print("\n");
        		num = n-rownum;
        		
		    }
	}
}