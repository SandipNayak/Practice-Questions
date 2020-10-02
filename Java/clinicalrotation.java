package gfg;
//clinically rotate an array.
import java.util.*;
public class clinicalrotation {
	
	public void rotate(int arr[],int n)
	{
		int temp=arr[n-1];
		for(int i=n-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		

	}
	 public void display(int []arr,int n)
	 {
		 for(int i=0;i<n;i++)
		 {
			 System.out.print(arr[i]+" ");
		 }
	 }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}

		clinicalrotation c=new clinicalrotation();
		c.rotate(arr, n);
		c.display(arr, n);
	}

}
