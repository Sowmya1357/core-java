package javaprograms;
import java.util.*;
public class roundoff {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		float f1=sc.nextFloat();
		f1=Math.round(f1);
		System.out.println(f1);
		sc.close();
	}
}
