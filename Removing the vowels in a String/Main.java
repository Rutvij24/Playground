import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder sb = new StringBuilder("");
    
   	for(int i=0;i<str.length();i++)
    {	
    	if(str.charAt(i) != 'a'&& str.charAt(i) != 'e'&&str.charAt(i) != 'i'&&str.charAt(i) != 'o'&&str.charAt(i) != 'u')
    	  sb.append(str.charAt(i));
    }
    System.out.print(sb);
  }
}