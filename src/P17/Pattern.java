import java.io.*;
import java.util.*;
public class Pattern {
	public static void main(String args[] ) throws Exception {
		System.out.println("Enter an integer number n [where N>=1, N<=26]");
		Scanner s = new Scanner(System.in);
		int inputNum = Integer.parseInt(s.nextLine());
		int num = 1;
		char printChar = 'A';
		while(num<=inputNum)
		{
			for(int index =0; index<inputNum - num ;index++)
			System.out.print("  ");        
			for(int index = 1;index<num ;index++)
			System.out.print(printChar + " ");
			System.out.println(printChar);
			num++;
			printChar++;
		}
	}
}