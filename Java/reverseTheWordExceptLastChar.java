import java.util.*;
public class reverseTheWordExceptLastChar 
{
  public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter any String.");
	  
	  String str=sc.nextLine();
	
	  String strArray[]=str.split("\\s"); 
	  char lastChar;
	  for(String s:strArray){
		   int lastCharIndex=s.length()-1;
		   lastChar=s.charAt(lastCharIndex);
		   StringBuilder sb=new StringBuilder(s);
		   sb.deleteCharAt(lastCharIndex);
		   sb.reverse();
		    System.out.print(sb.append(lastChar).append(" "));
		  }
		  
	   }

}
