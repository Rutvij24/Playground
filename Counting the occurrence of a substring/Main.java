import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String str2 = sc.nextLine();
 
    int str_len = str.length();
    int str2_len = str2.length();
    int count = 0;

    for(int i = 0; i<=str_len-str2_len; i++)
    {
        int j;
      for(j=0;j<str2_len;j++)
      {
         if(str.charAt(i+j) != str2.charAt(j))
            break;
        
      }
      if(j==str2_len)
      {
          count = count+1;
          j=0;
      }
      
    }
    System.out.println(count);
  }
}