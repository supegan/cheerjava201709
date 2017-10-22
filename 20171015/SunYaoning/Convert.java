public class Convert{
	public static void main(String[] args){
		String text="username:admin;password:123456;phone:13992341234";
		text=text.replace("username","用户名");
		text=text.replace("password","密码");
		text=text.replace("phone","手机号码");
		text=text.replace(":","=");
		text=text.replace(";",";\n");
		System.out.print(text+";");
	}

}