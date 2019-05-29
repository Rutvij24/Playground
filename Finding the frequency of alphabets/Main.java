import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    StringBuilder sb = new StringBuilder(str);
    String tt = sb.toString().toLowerCase();
    int arr[] = new int[26];
    for(int i=0;i<26;i++)
      arr[i]=0;
    int str_len = tt.length();
 
    for(int i = 0;i<str_len;i++)
    {
      if(tt.charAt(i)>='a' && tt.charAt(i)<='z')
      {
      int idx = tt.charAt(i) - 'a';
      arr[idx] = arr[idx]+1;
      }   
    }
    
	char tmp[] = new char[str_len];
	for(int i=0;i<str_len;i++)
	    tmp[i]='0';
	
	for(int i=0;i<str_len;i++)
	{
	    char ch = tt.charAt(i);
	    boolean flag = true;
	    for(int j=0;j<str_len;j++)
	    {
	        if(tmp[j]==ch)
	        {flag=false;
	        break;}
	    }
	    if(flag)
	       tmp[i]=ch;
	    
	}
	for(int i=0;i<str_len;i++)
    {
        if(tmp[i]!='0')
        {
        int j = tmp[i] - 'a';
      	System.out.print(tmp[i]);
      	System.out.print(arr[j]+" ");
        }        
    }
  }
}