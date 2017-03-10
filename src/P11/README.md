# PatternCode
Java Pattern Programs


~~~
Take an integer input and draw the below pattern. Say for example drawn below pattern for input number 5.

        1
      1 2 3
    1 2 3 4 5
  1 2 3 4 5 6 7
1 2 3 4 5 6 7 8 9
~~~

~~~
import java.io.*;
import java.util.*;
public class Pattern {
	public static void main(String args[] ) throws Exception {
		System.out.println("Enter an integer number n [where N>=1, N<=26]");
		Scanner s = new Scanner(System.in);
		int inputNum = Integer.parseInt(s.nextLine());
		int tempNum = 1;
		while(inputNum>0)
		{
			for(int index =0; index<inputNum - 1;index++)
			System.out.print("  ");
			int printChar = 1;
			for(;printChar<tempNum ;printChar++)
			System.out.print(printChar + " ");
			System.out.println(printChar);
			tempNum+=2;
			printChar++;
			inputNum--;
		}
	}
}
~~~