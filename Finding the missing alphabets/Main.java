import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    //StringBuilder sb = new StringBuilder(str);
    int arr[] = new int[26];
    for(int i=0;i<26;i++)
      arr[i]=0;
    int str_len = str.length();
    
    for(int i = 0;i<str_len;i++)
    {
      if(str.charAt(i)>='a' && str.charAt(i)<='z')
      {
      int idx= (char) (str.charAt(i) - 'a');
      arr[idx] = arr[idx]+1;
      }
      else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
      {
      int idx= (char) (str.charAt(i) - 'A');
      arr[idx] = arr[idx]+1;
      }
    }
   
     for(int i=0;i<26;i++)
     {
     	if(arr[i]==0)
        {
        	char ch = (char) (i+'a');
          	System.out.print(ch+" ");
        }
     }
  
  }
}
