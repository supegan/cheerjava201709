public class Format
{
	public static void main(String[] args)
	{
		String str = "username:admin;password:123456;phone:13992341234";
	    str = str.replace(":","=");
		str = str.replace("username","用户名");
		str = str.replace("password","密码");
		str = str.replace("phone","手机号码");

		String[] str1 = str.split(";");


		for(int i = 0 ; i < str1.length;i++)
		{
			System.out.println(str1[i]+';');
		}
	}
}