import java.util.*;
public class ArraySort
{
	public static void main(String[] args)
	{
		char[] sybol = {'g','e','l','w','f','d'};
		Arrays.sort(sybol);
		for(char x : sybol)
		{
			System.out.print(x + "\t");
		}
	}
}