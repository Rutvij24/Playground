import java.util.Scanner;
class Main{
  	public static void search(int n , int size , int arr[])
    {
      int count = 0 , index = 0 ; 
    	for(int i = 0 ; i<size ; i ++)
        {
        	if(arr[i] == n)
            { count = 1;
             	index = i ;
          		break ;}
        }
      if(count == 1)
        System.out.println(index);
      else
        System.out.println(-1);
    }
	  
    public static void main(String args[]){
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int arr_size = sc.nextInt();
      int[] arr = new int [arr_size] ;
      for(int i=0 ; i < arr_size ; i++){
      		arr[i] = sc.nextInt();
      }
        int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      search(n1,arr_size,arr);
      search(n2,arr_size,arr);
    }
}