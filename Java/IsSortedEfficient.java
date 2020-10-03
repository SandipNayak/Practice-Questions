package gfgCourse;
import java.util.Scanner;
public class IsSortedEfficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int []arr=new int[n];
	     for(int i=0;i<n;i++)
	     {
	    	 arr[i]=sc.nextInt();
	     }
	     boolean flag=true;
	     for(int j=1;j<n;j++)
	     {
	    	 if(arr[j]<arr[j-1])
	    	 {
	    		 flag=false;
	    		 break;
	    	 }
	     }
	     if(flag==true)
	     {
	    	 System.out.println("array is sorted");
	     }
	     else
	    	 System.out.println("array is not sorted");
	}

}
