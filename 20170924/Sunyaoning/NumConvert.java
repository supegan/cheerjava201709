import java.util.Scanner;
public class NumConvert
{
	public static void main(String[] args)
	{
		char cha[]={'零','壹','贰','叁','肆','伍','陆','柒','扒','玖'};
		char uni[]={'万','千','百','拾','元'};

		Scanner input=new Scanner(System.in);
				
		System.out.println("请输入金额(限5位数字)：");
		double num=input.nextDouble();

		int array[]=new int[5];
		for (int i=4;i>=0 ;i-- ) {
			int j=(int) num % 10;
			num=num / 10;
			array[i]=j;
		}

		for(int i=0;i<5 ;i++ ){
			int j=array[i];
			if (i!=0 && i!=4 && ((j==0 && j+1=0 && j+2=0) || (j==0 && j+1==0) || (j+1==0 && j+2==0))) {
				System.out.print("零");
			}
			if (i!=4 || j!=0) {
				System.out.print(cha[j]);	
			}
			if (i==4 || j!=0) {
				System.out.print(uni[i]);
			}
		}
		System.out.print("整");
	}
}