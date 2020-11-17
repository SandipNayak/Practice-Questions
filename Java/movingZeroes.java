// to move all the zeroes to the end of an array.
package gfgCourse;
import java.util.*;
public class movingZeroes {
	
	public static void moving(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
			{
			    for(int j=i+1;j<n;j++)
			    {
			    	if(arr[j]!=0)
			    	{
			    		arr[i]=arr[i]+arr[j];
			    		arr[j]=arr[i]-arr[j];
			    		arr[i]=arr[i]-arr[j];
			    	}
			    }
			}
		}
		for(int k=0;k<n;k++)
		{
			System.out.println(arr[k]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner (System.in);
      int n=sc.nextInt();
	     int []arr=new int[n];
	     for(int i=0;i<n;i++)
	     {
	    	 arr[i]=sc.nextInt();
	     }
	     moving(arr,n);
	}

}
