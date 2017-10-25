import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TimeChange
{
	//Done by BaiDu search.... 
	public static void main(String[] args) throws ParseException
	{
		String time = "2017-07-17 17:50:55";
		SimpleDateFormat formatter=new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");    
		Date date = formatter.parse(time);    
		long afterTime=(date.getTime()/1000) + 60*30;    
		date.setTime(afterTime*1000);    
		String afterDate=formatter.format(date);    
		System.out.println("Origanl time is " + time);
		System.out.println("In 30 minutes, the time will be " +afterDate);  
	}
}

/*java.text.Format formatter=new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");    
java.util.Date todayDate = new java.util.Date();    
long beforeTime=(todayDate.getTime()/1000)-60*60*24*365;    
todayDate.setTime(beforeTime*1000);    
String beforeDate=formatter.format(todayDate);    
System.out.println(beforeDate);  */