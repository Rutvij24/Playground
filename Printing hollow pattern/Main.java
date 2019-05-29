import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
     // int starcount = 2*n -1 ;
      //int scount = 1;
      
     for (int row = 1; row <=size; row++) {
        for (int col = 1; col <= size; col++) {
            if (row == 1 || row == size || col == 1 || col == size) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
      
      
	}
}
