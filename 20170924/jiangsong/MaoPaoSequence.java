public class MaoPaoSequence
{
	public static void main(String[] args)
	{
		int[] num = {7,17,3,8,13,18,5,15,2,12,6,11};

		System.out.print("数组初始排列为:\t");
		for(int k : num)
		{
			System.out.print(k + ",");
		}

		System.out.print("\n数组冒泡排序后为:");
		for(int i = 0; i< num.length; i++)
		{
			for(int j = 1; j < num.length - i; j++)
			{
				if(num[j] < num[j-1])
				{
					int temp = num[j-1];
					num[j-1] = num[j];
					num[j] = temp;					
				}
			}
		}

		for(int k : num)
		{
			System.out.print(k + ",");
		}
	}
}