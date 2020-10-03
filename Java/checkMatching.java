import java.util.regex.*;
public class checkMatching
{
   public static void search(String str1,String str2)
   {
	Pattern p=Pattern.compile(str2);
	Matcher m=p.matcher(str1);
	boolean flag=false;
	   while(m.find())
	   {
		   flag=true;
		   System.out.println("pattern found at pos: "+m.start());
	   }
	   if(!flag)
	   {
		   System.out.println("Pattern Not found");
	   }
	   
	   
   }
  
   public static void main(String[] args)
	{
  search("THIS IS A TEST","TEST");
		}

}
