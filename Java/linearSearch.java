import java.util.Scanner;
public class linearSearch {
	
	
	public static int search(int[]a,int key)
	{
		int answer=-1;
	     for(int j=0;j<a.length;j++)
	     {
	    	 if(a[j]==key)
	    	 {
	    		return j;
	    	 }
	     }
         return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
     {
    	 a[i]=sc.nextInt();
     }
     int key=sc.nextInt();
     int position=search(a,key);
     System.out.println("element found at : "+position);
	}

}
