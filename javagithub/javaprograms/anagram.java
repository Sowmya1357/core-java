package javaprograms;
import java.util.*;
public class anagram {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("S1=");
		String S1= sc.nextLine();
		System.out.println("S2=");
		String S2=sc.nextLine();
		S1=S1.toLowerCase();
		S2=S2.toLowerCase();
		sc.close();
		if(S1.length()==S2.length()) {
			char[] ch1=S1.toCharArray();
			char[] ch2=S2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean res=Arrays.equals(ch1, ch2);
			if(res)
			{
				System.out.println(S1+" and "+S2+" is a anagram");
			}
			else
			{
				System.out.println(S1+" and "+S2+" is not a anagram");
			}
		}
		else
		{
			System.out.println(S1+" and "+S2+" is not a anagram");
		}		
	}
}
