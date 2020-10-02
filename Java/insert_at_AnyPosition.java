import java.util.*;
public class insert_at_AnyPosition {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array-->");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elemets of array-->");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("The original array is-->");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		
		
		System.out.println("Enter the value of element-->");
		int val = sc.nextInt();
		System.out.println("Enter the postion-->");
		int pos = sc.nextInt();
		arr = arrayX(arr,n,val,pos);
		
		System.out.println("New arry is-->");
		for(int i=0;i<n+1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
 	}
	
	public static int[] arrayX(int[] arr,int n,int val,int pos)
	{
		int[] newArr = new int[n+1];
		for(int i=0;i<n+1;i++)
		{
			if(i<pos-1)
				newArr[i] = arr[i];
			else if(i == pos -1)
				newArr[i] = val;
			else
				newArr[i] = arr[i-1];
		}
		return newArr;
	}
	
	

}
