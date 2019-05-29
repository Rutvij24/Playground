import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner sc = new Scanner(System.in);
      int base = sc.nextInt();
      int expo = sc.nextInt();
      int result = base;
      
      while(expo>1)
      {
      	result = result*base;
        expo--;
      }
      
      System.out.print(result);
    }
}