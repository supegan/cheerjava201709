import java.text.SimpleDateFormat;
public class TimeCal{
	String str="2017-07-17 17:50:55";
	int minadd=30;

	public void calculate()throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long result=sdf.parse(str).getTime()+minadd*60000;

		System.out.println(sdf.format(result));
	}

	public static void main(String[] args)throws Exception{
		TimeCal tc=new TimeCal();
		tc.calculate();
	}
}