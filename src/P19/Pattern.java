import java.io.*;
import java.util.*;
public class Pattern {
	public static void main(String args[] ) throws Exception {
		System.out.println("Enter an integer number n [where N>=1, N<=26]");
		Scanner s = new Scanner(System.in);
		int inputNum = Integer.parseInt(s.nextLine());
		int num = 1;
		while(num<=inputNum)
		{
			char printChar = (char)(64 +((inputNum - num)* 2 + 1));
			for(int index = 1;index<(inputNum - num) * 2 + 1 ;index++)
			System.out.print(printChar + " ");
			System.out.println(printChar);
			for(int index =inputNum -num; index<inputNum && index > 0;index++)
			System.out.print("  ");
			num++;
		}
	}
}