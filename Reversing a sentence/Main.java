import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
  	String[] split = str.split(" ");
    String result = "";
	for (int i = split.length - 1; i >= 0; i--) {
  		result = result + (split[i] + " ");
	}
    
    System.out.print(result);
      
    }
    // Function to reverse a string
  //  public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    //{
        // Type your code here
    //}
}