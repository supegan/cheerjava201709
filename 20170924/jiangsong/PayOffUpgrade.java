
import java.util.Scanner;
public class PayOffUpgrade
{
	public static void main(String[] args)
	{

		double[] money = {0.11,200,2000,199,7500};
		String[] payType = {"余额","余额宝","花呗","银联卡","信用卡"};
		System.out.print("当前支付方式列表为: ");
		for(String x: payType)
		{
			System.out.print(x + ',');
		}

		Scanner input = new Scanner(System.in);
		System.out.print("\n请输入消费金额: ");
		double spend = input.nextDouble();
		int i = 0;

		for(; spend > money[i]; i++)
		{
			System.out.println("消费金额超过" + payType[i] + "金额,系统将移除此支付选项!!");
		}

		int temp = payType.length-i;
		String[] payType1 = new String[temp];

		if(i<=4)
		{
			System.out.println("此次消费金额将通过" + payType[i] + "进行支付!!");
			for(int j = 0; j < temp; j++)
			{
				payType1[j] = payType[i];
				i++;
			}

			System.out.print("更新后的支付方式列表为: ");
			for(String x : payType1)
			{
				System.out.print(x + ',');
			}
		}
		else
		{
			System.out.println("此次消费金额过高,没有支付选项可以完成支付!!");
		}


	}
}