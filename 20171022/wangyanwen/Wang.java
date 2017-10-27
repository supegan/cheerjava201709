public class Wang
{
	public static final String name = "汪眼文";
	public static final String num = "320522199010098001";
	public static final String birthday = "1990-10-09";
	public String wangperson()
	{
      return "姓名:"+name+"\n身份证"+num+"\n出生日期"+birthday;
	}
	public static void main(String[] agrs)
	{
		Wang p = new Wang();
        System.out.println(p.wangperson());
	}
}