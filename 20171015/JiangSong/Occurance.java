public class Occurance
{
	public static void main(String[] args)
	{
		String str = "1239586838923173478943890234092";
		String[] str1 = str.split("");

/*		for(String x : str1)
		{
			System.out.print(x);
		}*/

		String[] num = {"0","1","2","3","4","5","6","7","8","9"};

		for(int i = 0; i<10; i++)
		{
			int count = 0;
			for(int j = 0; j < str1.length; j++)
			{
				if(str1[j].equals(num[i]))
				{
					count++;
				}
			}
			System.out.println("Number\t" + num[i] + " Occurs " + count + " times");
		}
	}

}