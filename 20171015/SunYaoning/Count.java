import java.util.Scanner;
public class Count{
	public static void main(String[] args){
		String num[]={"0","1","2","3","4","5","6","7","8","9"};
		Scanner sc=new Scanner(System.in);

		System.out.println("请输入一组数字字符窜：");
		String ser=sc.next();

		for(int n=0;n<=9;n++){
			int t=0;
			for(int i=0;i<ser.length();i++){
				String m=ser.substring(i,i+1);
				if(num[n].equals(m)){
					t++;
				}
			}
			if(t!=0){
				System.out.println("数字"+n+"出现"+t+"次；");
			}
		}
		System.out.print("本次统计结束");
	}	
}