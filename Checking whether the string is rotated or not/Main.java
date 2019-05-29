import java.util.*;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();
      String str2 = sc.nextLine();
      StringBuilder tmp = new StringBuilder("");
      tmp.append(str1+str1);
      str1 = tmp.toString();
      if(str1.contains(str2))
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}