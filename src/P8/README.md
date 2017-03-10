# PatternCode
Java Pattern Programs


~~~
Take an integer input and draw the below pattern. Say for example drawn below pattern for input number 5.

1 2 3 4 5
  1 2 3 4
    1 2 3
      1 2
        1
~~~

~~~
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
			int printChar = 1;
			for(;printChar<inputNum - num ;printChar++)
			System.out.print(printChar + " ");
			System.out.println(printChar);
			for(int index =inputNum - num-1; index<inputNum && index > 0;index++)
			System.out.print("  ");
			num++;
		}
	}
}
~~~