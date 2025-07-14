package javaprograms;
import java.util.*;
public class reversenum {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int o=num;
		int rev=0;
		while(o>0)
		{
			int org=o%10;
			rev=(rev*10)+org;
			o=o/10;
		}
		System.out.println(""+rev);
		System.out.println(""+num);
		sc.close();
	}
}
