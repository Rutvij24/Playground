import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder sb = new StringBuilder(str);
   	int len = sb.length();
    int mid = (sb.length()/2);
    //System.out.print(mid);
    
    for(int i=0;i<mid;i++)
    {
    	char ch = sb.charAt(0);
      	for(int j=0;j<len-1;j++)
          sb.setCharAt(j,sb.charAt(j+1));
      	sb.setCharAt(len-1,ch);
    }
    //System.out.print(sb);
    
    for(int i=1;i<=len;i++)
    {
    	for(int space=0 ; space<(len-i) ; space++)
          System.out.print(" ");
      	for(int j=0;j<i;j++)
          System.out.print(sb.charAt(j));
    
     System.out.println(); 
    }
    
    
    
  }
}