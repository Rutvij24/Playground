import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n = in.nextInt() ;
      int counter = 0 ;
      for(int cr = 1 ; cr<=n ; cr++)
      {

        for(int cc = 1 ; cc <= cr ; cc++)
        {
          if(counter % 2 == 1)
            System.out.print("#");
          else
            System.out.print("*");
          counter = counter + 1 ;
        }
        System.out.print("\n") ;
      }
    }
}