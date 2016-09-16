import java.io.*;
import java.util.*;
public class HackerArray1 {


    
    public void reverseArray(int [] arr, int n)
        {
    	  System.out.println("the reverse array is \n");
           for (int i =n-1; i>=0;i--)
               {
                  System.out.print(arr[i]+"\t");
           }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	HackerArray1 obj = new HackerArray1();
       System.out.println("Enter the number of array elements");
        Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
        Scanner input = new Scanner(System.in);
    int[] numbers = new int[20];

    for (int i = 0; i < x; i++)
    {
        System.out.println("Please enter number");
        numbers[i] = input.nextInt();
    }
        obj.reverseArray(numbers,x);
    }
}


