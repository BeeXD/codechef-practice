package codechef.java1;

import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input= new Scanner(System.in);
		int testcase = input.nextInt();
		while(testcase-->0){
		    int elements = input.nextInt();
		    int arr[]=new int[elements];
		    int max=0;
		    for(int i=0;i<elements;i++){
		        arr[i]=input.nextInt();
		        if(arr[i]>max){
		            max=arr[i];
		        }
		    }
		    System.out.println(max);
		}
		
	}
}
