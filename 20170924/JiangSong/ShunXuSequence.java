public class ShunXuSequence
{
	public static void main(String[] args)
	{
		int[] num = {7,17,3,8,13,18,5,15,2,12,6,11};

		System.out.print("顺序排列前数组为:");
		for(int x : num)
		{
			System.out.print(x + ",");
		}

		for(int i = 0; i < num.length; i++)
		{
			int temp = num[i];
			int j;
			for(j = i; j > 0 && temp < num[j-1]; j--)
			{
				num[j] = num[j-1];
			}
			num[j] = temp;
		}

		System.out.print("\n顺序排列后数组为:");
		for(int x : num)
		{
			System.out.print(x + ",");
		}
	}
}