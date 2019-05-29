import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    StringBuilder sb = new StringBuilder("");
    //if(num<0)
      //sb.append("-");
    int temp=num;
    if(num<0)
	    temp = temp * (-1) ;
    
   int rem=0;
    while(temp>0)
    {
    	rem = temp%10;
      	temp = temp/10;
      	char ch = (char) (rem + '0');
      	sb.append(ch);
    }
    
    sb.reverse();
    if(num<0)
      sb.insert(0,"-");
    System.out.print(sb);
    
    
    
  }
}