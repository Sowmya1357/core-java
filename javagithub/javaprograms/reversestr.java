package javaprograms;
import java.util.*;
public class reversestr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+ch[i];
			System.out.print(""+ch[i]);
		}
		System.out.print("\n");
		System.out.println(""+rev);
		sc.close();
	}
}

