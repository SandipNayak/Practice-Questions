package gfg;
//rotation of an array using reversal algorithm.
import java.util.*;
public class reversalalgo {
	
	public void rotate(int arr[],int d)

	{ 
		if (d == 0) 
         return; 
     int n=arr.length;
		reversal(arr,0,d-1);
		reversal(arr,d,n-1);
		reversal(arr,0,n-1);
	}
	
	public void reversal(int arr[],int start,int end)
	{
		int temp;
		while(start<end)
		{
		temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	    }
	}
	public void print(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] + "  ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr = new int [n];
		int d=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		reversalalgo r=new reversalalgo();
		r.rotate(arr,d);
		r.print(arr, n);

	}

}
