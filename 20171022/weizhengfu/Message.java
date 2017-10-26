public class Message{
	String name;  //名字
	final String census; //户籍
	final int id; //身份证号
	final String birthday; //生日
	public Message (String a,String b,int c,String d)
	{
		name = a;
		census = b;
		id = c;
		birthday = d;
	}
	public String toString()
	{
		System.out.println("姓名:" + name + "\n户籍:" + census + "\n身份证号:" + id + "\n生日:" + birthday);
		return "";
	}
}