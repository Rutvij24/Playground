import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here
       Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String word = sc.nextLine();
      String cword = sc.nextLine();
      StringBuilder changed = new StringBuilder("");
      String array[] = str.split(" ");
      
      for(int i=0 ; i<array.length ; i++)
      {
      		if(array[i].equals(word))
              array[i] = cword;
      }  
      
      for(int i=0 ; i<array.length ; i++)
      {
      changed.append(array[i]);
        changed.append(" ");
      }
      System.out.print(changed);
      
    }
}