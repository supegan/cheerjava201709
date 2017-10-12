import java.util.Scanner;
public class PayType
{
	public static void main(String[] args)
	{ 
		double cost[]={0.11,200,2000,199,7500};
		String payType[]={"余额","余额宝","花呗","银联卡","信用卡"};

		Scanner input=new Scanner(System.in);
		System.out.print("请输入消费金额：");
		double num=input.nextDouble();

		System.out.println("请选择支付方式(输入相应序号)：");		
		for (int i=0;i<payType.length ;i++ ) {
			System.out.println((i+1)+"."+payType[i]);
		}

		for (int j=1;j<6 ;j++ ) {
			int sern=input.nextInt();
			int k=sern-1;
			if (num<=cost[k]) {
				System.out.println("本次消费使用"+payType[k]+"支付。");
				break;
			}else if (j==5 && num>cost[k]) {
				System.out.println("您的可用余额不足，谢谢惠顾！");
			}else{
				System.out.println("余额不足，请重新选择支付方式(输入相应序号)：");
				for (int i=0;i<payType.length-j ;i++ ) {
					for (;k<payType.length-j ;k++ ) {
						cost[k]=cost[k+1];
						payType[k]=payType[k+1];
					}					
					System.out.println((i+1)+"."+payType[i]);			
				}
			}	
		}	
				
	} 

}