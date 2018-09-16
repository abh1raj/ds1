
import java.util.*;
public class palindrome{
	public static boolean checkPalin(String str)
	{
		int len = str.length()-1;
		char c[]= str.toCharArray();
		int ctr=0;
		for(int i = 0;i < str.length()/2;i++){
			if(c[i]!=c[len--]){
				ctr = 1;
				break;
			}
		}
		if(ctr == 0)
		{
		 return true;
		}
		else 
		{
		 return false;
		}
	}
	public static void main(String[] ar)
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		boolean b = checkPalin(str);
		System.out.println(b+"");
		
	}
}