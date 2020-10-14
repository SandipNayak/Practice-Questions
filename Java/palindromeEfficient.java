import java.util.*;
public class palindromeEfficient {

	public static boolean isPalindrome(String s)
	{
		int begin=0;
		int end=s.length()-1;
		while(begin<end)
		{
			if(s.charAt(begin)!=s.charAt(end))
			{
				return false;
			}
			begin=begin+1;
			end=end-1;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		boolean ans=isPalindrome(s);
		if(ans)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not ");
		}
	}

}
