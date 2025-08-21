package codechef.java1;

import java.util.*;

class Codechef
{
    public static int linearSearch(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i; // Element found, return its index
                }
            }
            return -1; // Element not found in the array
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int[] arr=new int[x];
        for(int i=0;i<x;i++){
            arr[i]=input.nextInt();
        }
        int result1=linearSearch(arr,y);
        if(result1==-1){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
        input.close();
	}
}