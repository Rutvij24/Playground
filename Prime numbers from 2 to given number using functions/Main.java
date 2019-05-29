import java.util.Scanner;
class Main{
  	public static void function(int n){
    	for(int i=2; i<=n; i++)
        {
           int count = 0;
            for(int j=2; j<i; j++)
            {
                if(i%j == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0)
            {
                System.out.print(i + "\n");
            }
        }
        }		
      
    
  
  
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
      function(n);
    }
}