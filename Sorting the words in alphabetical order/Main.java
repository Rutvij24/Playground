import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        int n;
        String temp;
        Scanner s = new Scanner(System.in);
        
        n = s.nextInt();
        String names[] = new String[n+1];
       
        
        for(int i = 0; i <= n; i++)
        {
            names[i] = s.nextLine();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j <= n; j++) 
            {
                if (names[i].compareTo(names[j])>0) 
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
    
        for (int i = 1; i < n; i++) 
        {
            System.out.println(names[i].toLowerCase());
        }
        System.out.print(names[n].toLowerCase());
    }
}