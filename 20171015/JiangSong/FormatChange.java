public class FormatChange
{
	public static void main(String[] args)
	{
		String str = "username:admin;password:123456;phone:13992341234";
		
		str = str.replace(":","=");
		str = str.replace("username","用户名");
		str = str.replace("password","密码");
		str = str.replace("phone","手机号码");

		String[] str1 = str.split(";");

		for(String s : str1)
		{
			System.out.println(s+';');
		}
	}
}