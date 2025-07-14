package javaprograms;
import java.util.*;
public class strmethods {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(""+str.toLowerCase());
		System.out.println(""+str.toUpperCase());
		System.out.println(""+str.split(""));
		System.out.println(""+str.trim());
		sc.close();
	}
}
