import java.io.*;
import java.util.*;
public class Pattern {
	public static void main(String args[] ) throws Exception {
		System.out.println("Enter an integer number n [where N>=1, N<=26]");
		Scanner s = new Scanner(System.in);
		int inputNum = Integer.parseInt(s.nextLine());
		int num = 0;
		while(num<inputNum)
		{
			for(int index =0; index<inputNum - num-1;index++)
			System.out.print("  ");
			char printChar = (char)(64+inputNum);
			for(int index = 0;index<num; index++,printChar--)
			System.out.print(printChar + " ");
			
			System.out.println(printChar);
			num++;
		}
		while(num>1)
		{
			for(int index =0; index<inputNum - num+1;index++)
			System.out.print("  ");
			char printChar = (char)(64+inputNum);
			for(int index = 1;index<num-1; index++,printChar--)
			System.out.print(printChar + " ");
			
			System.out.println(printChar);
			num--;
		}

	}
}