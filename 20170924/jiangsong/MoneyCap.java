import java.util.*;
public class MoneyCap
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("请输入需要大写的人名币金额(1~10万以内):");
		double money = input.nextDouble();
		int[] num = {1,2,3,4,5,6,7,8,9,0};
		char[] cap = {'壹','贰','叁','肆','伍','陆','柒','捌','玖','零'};
		char[] unit = {'元','十','百','千','万'};
		int[] temp = new int[5];
		if(money >= 100000)
		{
			System.out.println("金额超出转换范围上限");
		}
		else
		{
			if(money >= 10000)
			{
				for(int i = 0; i < 5; i++)
				{
					temp[i] = (int) money % 10;
					money = money / 10;
				}
			}
			else
			{
				System.out.println("金额超出转换范围下限");
			}
		}
		for(int i = 4; i >=0; i--)
		{
			for(int j = 0; j < 10; j++)
			{
				if(temp[i] == num[j])
				{
					System.out.print(cap[j]);
					System.out.print(unit[i]);
				}
			}
		}
		System.out.println("整!!!"); 
	}
}