import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
 		Scanner sc = new Scanner(System.in);
      	int row = sc.nextInt();
      	int column = sc.nextInt();
      	int[][] arr = new int[row][column];
      	for(int i=0;i<row;i++)
        {
        	for(int j=0;j<column;j++)
            {
            	arr[i][j]=0;
            }
        
        }
      
      int num = row;
      for(int i=0;i<row;i++)
        {
        	for(int j=0;j<column;j++)
            {
            	if(i==j)
                {	
                  	arr[i][j] = num;
                	for(int k=i+1;k<column;k++)
                    	arr[i][k] = num;
                  	for(int l=i+1;l<row;l++)
                    	arr[l][j] = num;
                  	
                }
            }
        	num--;
        }
      
      
      
      
      
      
      
      for(int i=0;i<row;i++)
        {
        	for(int j=0;j<column;j++)
            {
            	System.out.print(arr[i][j]+"");
            }
        System.out.println();
        }
    }
}