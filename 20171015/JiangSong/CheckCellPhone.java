import java.util.Scanner;
public class CheckCellPhone
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入需要确认的手机号码:\t");
		String str = sc.next();
		String[] str1 = str.split("");
		String[] num = {"0","1","2","3","4","5","6","7","8","9"};

/*		for(String x : str1)
		{
			System.out.print(x + ',');
		}
*/
		if(str1.length == 11)
		{
			if(str1[0].equals(num[1]) && (str1[1].equals(num[3]) || str1[1].equals(num[8])))
			{
				int k = 0;
				for(int i = 0; i < 11; i++)
				{
					for(int j = 0; j < 10; j++)
					{
						if(str1[i].equals(num[j]))
						{
							k++;
						}
					}
				}
				if(k < 11)
				{
					System.out.println("输入的号码中含有非法字符!!");
				}
				else
				{
					System.out.println("输入的号码为合法的手机号码!!");
				}
			}
			else
			{
				System.out.println("输入的号码非13x或18x合法号码段!!");
			}
		}
		else 
		{
			System.out.println("输入的号码位数不等于11位!!");
		}
	}
}