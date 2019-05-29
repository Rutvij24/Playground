import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();
      String str2 = sc.nextLine();
      StringBuilder sb1 = new StringBuilder(str1);
      //StringBuilder sb2 = new StringBuilder(str2);
      
     sb1.setLength(0);
     
     for(int i=0;i<str2.length();i++)
       sb1.append(str2.charAt(i));
      
     str1 = sb1.toString();
      String[] arr=  str1.split(" ");
      
      for(String word : arr)
        System.out.println(word);
      
    }
}