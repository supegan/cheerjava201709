import java.util.Scanner;
public class PhoneNum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String numArr[]={"0","1","2","3","4","5","6","7","8","9"};

		System.out.print("请输入手机号码：");
		String sr=sc.next();
		String scArr[]=sr.split("");

		if (sr.length()==11) {
			int k=0;
			for (int i=0;i<=10 ;i++ ) {
				for (int j=0;j<=9 ;j++ ) {
					if(numArr[j].equals(scArr[i])){
						k++;
					}					
				}
			}
			if (k==11) {
				if (scArr[0].equals("1")&&!scArr[1].equals("0")&&!scArr[1].equals("1")&&!scArr[1].equals("2")&&!scArr[1].equals("4")&&!scArr[1].equals("6")&&!scArr[1].equals("9")) {
					System.out.print("您所输入的为合法手机号码");	
				}else{
					System.out.print("您所输入的手机号码非法");
				}
			}else{
				System.out.print("您所输入的手机号码非法");
			}
		}else{
			System.out.print("您所输入的手机号码非法");
		}
	}
}