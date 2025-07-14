package javaprograms;
import java.util.*;
public class fibonnoci {
	static int fib(int n)
	{
		if(n<=1)
		{
			return n;
		}
		return fib(n-1)+fib(n-2);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		for(int i=0;i<num;i++)
		{
			System.out.print(fib(i)+" ,");
		}
	}
}

