import java.io.*;
import java.util.*;
public class Pattern {
	public static void main(String args[] ) throws Exception {
		System.out.println("Enter an integer number n [where N>=1, N<=100]");
		Scanner s = new Scanner(System.in);
		int inputNum = Integer.parseInt(s.nextLine());
		int num = 0;
		while(num<inputNum)
		{
			for(int index =0; index<inputNum - num - 1;index++)
			System.out.print("  ");
			int printChar = num * 2 + 1;
			for(int index = 1;index<printChar ;index++)
			System.out.print(printChar + " ");
			System.out.println(printChar);
			num++;
		}
	}
}