import java.util.*;
public class lengthOfLastWord 
{

	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
 
	 StringBuilder s1=new StringBuilder("java");
	 
	 String s2="Love";
	 s1.append(s2);
	 
	 int index=s1.indexOf(s2);
	 System.out.println(index);
	 
	  String str=sc.nextLine();
	  String strArray[]=str.split(" ");
	  int length=strArray[strArray.length-1].length();
	 
	  System.out.println(length); 
		
		
	}

}
