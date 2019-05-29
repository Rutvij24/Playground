import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String str2 = sc.nextLine();
    StringBuilder sb = new StringBuilder(str);
    
    for(int i=0;i<str2.length();i++)
    {
    	for(int j=0;j<sb.length();j++)
        {
        	if(str2.charAt(i) == sb.charAt(j))
            {
              for(int k=j;k<sb.length()-1;k++)
            	sb.setCharAt(k,sb.charAt(k+1));
              
              sb.setLength(sb.length()-1);
            }
        
        }
    	
    }
    System.out.print(sb);
    
  }
}