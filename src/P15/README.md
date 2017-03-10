# PatternCode
Java Pattern Programs


~~~
Take an integer input and draw the below pattern. Say for example drawn below pattern for input number 5.

9 9 9 9 9 9 9 9 9
  7 7 7 7 7 7 7
    5 5 5 5 5
      3 3 3
        1

~~~

~~~
import java.io.*;
import java.util.*;
public class Pattern {
	public static void main(String args[] ) throws Exception {
		System.out.println("Enter an integer number n [where N>=1, N<=100]");
		Scanner s = new Scanner(System.in);
		int inputNum = Integer.parseInt(s.nextLine());
		int num = 1;
		while(num<=inputNum)
		{
			int printChar = (inputNum - num) * 2 + 1;
			for(int index = 1;index<(inputNum - num) * 2 + 1 ;index++)
			System.out.print(printChar + " ");
			System.out.println(printChar);
			for(int index =inputNum -num; index<inputNum && index > 0;index++)
			System.out.print("  ");
			num++;
		}
	}
}
~~~