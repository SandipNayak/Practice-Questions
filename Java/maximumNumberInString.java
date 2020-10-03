import java.util.regex.*;
public class maximumNumberInString 
{

	public static void main(String[] args) 
	{
		int x[]=new int[5];
	    String s="ram20 rahul50 mukesh 100 ";
	    Pattern p=Pattern.compile("[0-9]+");
	    Matcher m=p.matcher(s);
	    int i=0;
	    while(m.find())
	    {
	    	x[i]=Integer.parseInt(m.group());
	    	i++;
	    }
	 int max=x[0];
	  for(int j=0;j<x.length;j++)
	  {
		  if(max<x[j])
		  {
			  max=x[j];
		  }
	  }
	System.out.println(max);
	
	
	}
	

}
